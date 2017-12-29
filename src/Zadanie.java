import java.util.Scanner;

public class Zadanie {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Podaj dlugosc choinki");
		
		int dlugosc = in.nextInt();
		
		Rysowanie rys = new Rysowanie(dlugosc);
		
		rys.funkcja();
	}
}
