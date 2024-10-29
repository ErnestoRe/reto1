package retos;

public class Funciones2 {
		
	
	public static int suma(int n1,int n2) {
		int suma=n1+n2;
		return suma;
	}
	public static int resta(int n1,int n2) {
		int resta=n1-n2;
		return resta;
	}
	public static boolean esPar(int n) {
		if(n%2==0) {
			
			return true;
		}
		else {
		
			return false;
		}
	}
	public static boolean esImpar(int n) {
		if(n%2!=0) {
			return true;
		}
		else {
			return false;
		}
	}
}
