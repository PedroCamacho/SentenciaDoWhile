import java.util.Scanner;

public class ComprobarEntrada {

	public static void main(String[] args) {
		//Inicializaci�n
		Scanner sc = new Scanner (System.in);
		int numero;
		
		//Entrada y Proceso 
		do {
			System.out.print("Introduzca un n�mero del 1 al 100:");
			numero=sc.nextInt();
		} while (numero<1 || numero>100);
		
		//Salida y Finalizaci�n
		System.out.println("El n�mero seleccionado es: " + numero);
		sc.close();
	}
}
