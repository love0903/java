import java.util.Scanner;
import static java.lang.System.out;
import java.util.Array;

public class Guest{
	public static void main(String[] args){
		ArrayList names = new ArrayList();
		collectNameTo(names);
		out.println("�X�ȦW�� :");
		printUpperCase(names);
	}
	static void collectNameTo(ArrayList names){
		Scanner scanner = new Sacnner(System.in);
		String name;
		while(true){
			out.print("�X�ȦW�� :");
			name = scanner.nextLine();
			if(name.equals("quit")){
			break;
			}
			names.add(name);
		}
	}
	static void printUpperCase(ArrayList names){
		for(int i=0;i<names.size(); i++ ){
			String name = (String) names.get(i);
			out.println(name.toUpperCase());
		}
	}
}