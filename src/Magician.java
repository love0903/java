package world.roles;

public class Magician extends Role{
	
	public Magician(String name, int blood, int level){
		setName(name);
		setBlood(blood);
		setLevel(level);
	}
	
	public void MagicAttack(){
	System.out.printf("Å]ªk§ðÀ»");
	}
}