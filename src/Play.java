import world.roles.*;

public class Play{

	public static void main(String[] args){
	
		SwordsMan s1 = new SwordsMan("Peter",100,1);
		Magician  m1 = new Magicians("Juli",50,1);
		
		showBlood(s1);
		showBlood(m1);
		
	}
	
	public static void showBlood(Role r1){
		System.out.printf("%s : ¦å¶q -> %d%n", r1.getName(), r1.getBlood());
	}
		
}