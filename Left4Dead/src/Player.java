

public class Player extends Character {
	
	//Adnan
	
	private double intel;
	
	public Player(String name, double HP, double dexterity, Weapons weapon, double strength, double speed, double intel)
	{	
		this.name = name;
		this.HP = HP;
		this.dexterity = dexterity;
		this.weapon = weapon;
		this.strenght = strength;
		this.speed = speed;
		this.intel = intel;
	}
	
	public void setIntel(double intel) {
		
		double temp;
		temp = 0.5 + Math.random() * (2-0.5);
		this.intel = temp;
	}

	@Override
	public double Attack() {
		return super.Attack() * this.intel;
	}
	
	
	
}