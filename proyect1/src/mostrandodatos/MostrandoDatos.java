package mostrandodatos;

import java.util.Scanner;

public class MostrandoDatos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Pon tu nombre y un apellido");
		String nombreApellido = scanner.nextLine();
		System.out.println("Tu nombre es: " + nombreApellido);
	}

}
