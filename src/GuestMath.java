/*import java.util.Scanner;

public class GuestMath{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int number = (int)(Math.random()*10);
		int guess;
		System.out.printf("�q�Ʀr�C�� �d��0~9%n");
		do{
			System.out.print("��J�Ʀr : ");
			guess = scanner.nextInt();
		}while(guess != number);
		System.out.println("�q���F");
	}*/
import java.util.Scanner;

public abstract class GuessGame{
	public void go(){
		int number = (int)(Math.random()*10);
		int guess;
		do{
			print("��J�Ʀr");
			guess = nextInt();
		}while(guess != number);
		print("�q���F");
	
	}
	public void println(String text){
		print(text + "\n");
	}
	public abstract void print(String text);
	public abstract int nexttInt();
}
