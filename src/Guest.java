import java.util.Scanner;
import static java.lang.System.out;
import java.util.Array;

public class Guest{
	public static void main(String[] args){
		ArrayList names = new ArrayList();
		collectNameTo(names);
		out.println("訪客名單 :");
		printUpperCase(names);
	}
	static void collectNameTo(ArrayList names){
		Scanner scanner = new Sacnner(System.in);
		String name;
		while(true){
			out.print("訪客名稱 :");
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