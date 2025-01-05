package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com três números inteiros: ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maior = acharMaior(a,b,c);
		mostrarResultado(maior);
		
		sc.close();
		

	}
	
	public static int acharMaior(int x, int y , int z) {
		int aux; 
		
		if(x>y && x>z){
			aux = x;
		}
		else if (y>z) {
			aux = y;
		}
		else {
			aux =z;
		}
		return aux;
	}
	
	public static void mostrarResultado(int  l) {
		System.out.println("O Maior numero e: "+l);
	}

}
