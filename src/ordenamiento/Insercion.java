package ordenamiento;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Insercion {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int arreglo[], nElementos, aux, pos;

		nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de elementos del arreglo"));

		arreglo = new int[nElementos];

		for (int i = 0; i < nElementos; i++) {
			System.out.print((i + 1) + ".- Digite un número: ");
			arreglo[i] = entrada.nextInt();
		}

		for (int i = 0; i < nElementos; i++) {
			pos = i;
			aux = arreglo[i];

			while ((pos > 0) && (arreglo[pos-1] > aux)) {
				arreglo[pos] = arreglo [pos-1];
				pos--;
			}
			
			arreglo[pos] = aux;
		}
		
		System.out.println("Orden ascendente: ");
		
		for(int i = 0; i<nElementos; i++) {
			System.out.println("El arreglo es: "+arreglo[i]);
		}

	}

}
