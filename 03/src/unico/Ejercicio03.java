package unico;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int random;
		int num;
		final int RENDIRSE = -1;
		String mensaje;
		String ayuda;
		int cont = 0;
		
		random = (int) ((Math.random() * 100+1));
		
		System.out.println("El juego consiste en averiguar un número de 100 posibles [0 - 100].");
		System.out.println("Recuerda que puedes salir pulsando -1");
		
		do {
			System.out.print("Introduce el número elegido: ");
			num = Integer.parseInt(teclado.nextLine());
		
			if (random != num && num == RENDIRSE) {
				ayuda = (random > num) ? "Es mayor" : "Es menor";
				System.out.println(ayuda);
			}
			
			cont++;
			
		} while (num != random && num != RENDIRSE);

		System.out.println("Total de intentos = " + cont);
		mensaje = (random == num) ? "Enhorabuena, has acertado!" : "Lástima, te has rendido.";
		System.out.println(mensaje);

}
}