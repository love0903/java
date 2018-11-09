/*
ProgramName: Play Demo
Author: antallen
*/

import newworld.roles.*;
import java.util.Scanner;

public class Demo implements Action{

	public static void main(String[] args){
	
		SwordsMan s1 = new SwordsMan("Peter",100,1);
		Magicians m1 = new Magicians("Juli",50,1);
			
		showBlood(s1);
		showBlood(m1);
		
		Scanner scanner = new Scanner(System.in);
		int action = 0;
		do{
		System.out.print("???J?????V: (1:right, 2:left, 3:up, 4:down ) " );
		int action = scanner.nextInt();
		if(action == 0)
			break;
		play(action);
		}while(true)
	}
	public static void Play(int action){
		switch (action){
			case Action.STOP:
				System.out.println("停止走動...");
				break;
			case Action.RIGHT:
				System.out.println("向右走動...");
				break;
			case Action.LEFT:
				System.out.println("向左走動...");
				break;
			case Action.UP:
				System.out.println("向上走動...");
				break;
			case Action.DOWN:
				System.out.println("向下走動...");
				break;
			default:
				System.out.println("輸入錯誤...");
				break;
			
		}
	}
	
	public static void showBlood(Role r1){
		System.out.printf("%s : 血量 -> %d%n", r1.getName(), r1.getBlood());
	}
		
	public static void drawFight(Role r2){
		System.out.printf("%s 攻擊 %s %n",r2.getName(),r2.fight());
		
	}
	public static void drawScure(Role r2, Role r3){
		System.out.printf("%s",r2.getName());
		((Magicians)r2).secure();
		System.out.printf("%s",r3.getName());
		
	}
}