import java.util.Scanner;
public class KillThatZombie {
Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Player igrac = new Player("Vedo_Killer92",700,2,null,10,15,2);
		
		Zombie enver = null;
		
		int randomNum = (int) (1 + Math.random()*(5-1) );
		if(randomNum == 1) enver = new Emina("Emina", 1000, 0.98, null, 9, 52);
		if(randomNum == 2) enver = new Smoken("Smoker", 800, 0.75, null, 8, 45);
		if(randomNum == 3) enver = new Spitter("Spitter", 700, 0.65, null, 7, 40);
		if(randomNum == 4) enver = new Charger("Charger", 450, 0.4, null, 4, 20);
		if(randomNum == 5) enver = new Jackey("Jackey", 500, 0.50, null, 5, 25);
		
		
		System.out.println("Pola 3 je. Nemate cigareta. Hodate napuštenom ulicom"
				+ ".Odjednom čujete užasne krikove. Ugledate djevojčicu"
				+ " sa medvjedićem kojoj viri lobanja. Napao vas je zombie. Šta ćete uraditi?");
		System.out.println("(unesite 1 ako želite napasti, unesite 2 ako želite pokušati da begate");
		int odabir = in.nextInt();
		
		if(odabir == 1){
			
			double healthEnver = enver.HP;
			double healthIgrac = igrac.HP;
			
			while(healthEnver >0 && healthIgrac>0 ){
				
				healthEnver = healthEnver - igrac.Attack();
				healthIgrac = healthIgrac - enver.Attack();
				System.out.println("Health zombija je "  + healthEnver);
				System.out.println("Health Vede je "  + healthIgrac);
				System.out.println();
				
			}
			
			if(healthEnver <=0){
				System.out.println("Pobjednik SI!");
			}
			if(healthIgrac<=0){
				System.out.println("POBJEDNIK JE ZOMBIE BUHAHAHAHAHAHAH! Loš si.");
			}
			
		}
		if(odabir == 2){
			
			boolean beg = igrac.escChance(enver);
			
			if(beg == false) System.out.println("NISI POBJEGAO");
			if(beg == true) System.out.println("POBJEGAO SI,ovaj put.");
		}
		
	}

}
