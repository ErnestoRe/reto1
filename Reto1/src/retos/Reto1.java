package retos;

import java.util.Scanner;

public class Reto1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 1;
		int n1 = 0;
		int n2 = 0;
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
				String s = sc.nextLine();
				n = Integer.parseInt(s);
				if(n==0) {
					System.out.println("Termine");
					break;
				}
				do {
					try {
						System.out.println("Introduce un nº");
						String s1 = sc.nextLine();
						n1 = Integer.parseInt(s1);
						if (n >= 1 && n <= 4) {
							System.out.println("Introduce otro nº");
							String s2 = sc.nextLine();
							n2 = Integer.parseInt(s2);
						}
						break;
					} catch (Exception ex) {
						System.out.println("Introduce un numero valido");
					}
				} while (true);
				if (n == 1) {
					System.out.println(Funciones2.suma(n1, n2));
				} else if (n == 2) {
					System.out.println(Funciones2.resta(n1, n2));
				} else if (n == 3) {
					System.out.println(Funciones1.multiplicacion(n1, n2));
				} else if (n == 4) {
					System.out.println(Funciones1.division(n1, n2));
				} else if (n == 5) {
					if(Funciones2.esPar(n1)) {
						System.out.println(n1+ " es par");
					}else {
						System.out.println("No es par");
					}
					
				} else if (n == 6) {
					if(Funciones2.esImpar(n1)) {
						System.out.println(n1+ " es impar");
					}else {
						System.out.println("No es impar");
					}
				} else if (n == 7) {
					if(Funciones1.esPositivo(n1)) {
						System.out.println(n1+" es positivo");
					}else {
						System.out.println("No es positivo");
					}
				} else if (n == 8) {
					if(Funciones1.esNegativo(n1)) {
						System.out.println(n1+" es negativo");
					}else {
						System.out.println("No es negativo");
					}
				}
			} catch (Exception ex) {
				System.out.println("Introduce un formato valido");
			}
		} while (n != 0);
		sc.close();

	}

}
