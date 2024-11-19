package sumando;

import java.util.Scanner;

public class Sumando {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce dos números");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int suma = num1 + num2;
		System.out.println("La suma de los números es: " + suma);

	}

}
