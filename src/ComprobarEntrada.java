import java.util.Scanner;

public class ComprobarEntrada {

	public static void main(String[] args) {
		//Inicialización
		Scanner sc = new Scanner (System.in);
		int numero;
		
		//Entrada y Proceso 
		do {
			System.out.print("Introduzca un número del 1 al 100:");
			numero=sc.nextInt();
		} while (numero<1 || numero>100);
		
		//Salida y Finalización
		System.out.println("El número seleccionado es: " + numero);
		sc.close();
	}
}
