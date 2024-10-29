package retos;

import java.util.Scanner;

public class Reto1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1=0;
		int contador=0;
		
		System.out.println("Elige la operacion");
		System.out.println("1.Sumar");
		System.out.println("2.Restar");
		System.out.println("3.Multiplicar");
		System.out.println("4.Dividir");
		System.out.println("5.Par");
		System.out.println("6.Impar");
		System.out.println("7.Positivo");
		System.out.println("8.Negativo");
		System.out.println("0.Salir");
		
		do {
			try {
				System.out.println("Introduce el nº de la operacion que desea");
				String s=sc.nextLine();
				n1=Integer.parseInt(s);
				
				
			}catch(Exception ex) {
				System.out.println("Introduce un formato valido");
			}
		}while(true);

	}

}
