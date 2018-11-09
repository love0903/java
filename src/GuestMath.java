/*import java.util.Scanner;

public class GuestMath{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int number = (int)(Math.random()*10);
		int guess;
		System.out.printf("猜數字遊戲 範圍0~9%n");
		do{
			System.out.print("輸入數字 : ");
			guess = scanner.nextInt();
		}while(guess != number);
		System.out.println("猜中了");
	}*/
import java.util.Scanner;

public abstract class GuessGame{
	public void go(){
		int number = (int)(Math.random()*10);
		int guess;
		do{
			print("輸入數字");
			guess = nextInt();
		}while(guess != number);
		print("猜中了");
	
	}
	public void println(String text){
		print(text + "\n");
	}
	public abstract void print(String text);
	public abstract int nexttInt();
}
