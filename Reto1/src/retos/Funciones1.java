package retos;

public class Funciones1 {

	public static int multiplicacion(int n1, int n2) {
		int mult=n1*n2;
		return mult;
	}
	public static int division(int n1, int n2) {
		int div=n1/n2;
		return div;
	}
	public static boolean esPositivo(int n1) {
		if(n1>=0) {
			return true;
		}else {
			return false;
		}
	}
	public static boolean esNegativo(int n1) {
		if(n1<0) {
			return true;
		}else {
			return false;
		}
	}
}
