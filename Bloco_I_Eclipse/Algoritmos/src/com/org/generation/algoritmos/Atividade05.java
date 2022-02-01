package com.org.generation.algoritmos;

import java.util.Scanner;

public class Atividade05 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double N1, N2, N3, media;
		
		System.out.println("Insira a 1ª nota:");
		N1 = ler.nextDouble();
		
		System.out.println("Insira a 2ª nota:");
		N2 = ler.nextDouble();
		
		System.out.println("Insira a 3ª nota:");
		N3 = ler.nextDouble();
		
		media = ((N1*2)+(N2*3)+(N3*5))/10;
		
		System.out.println("A média é:" + media);
		ler.close();
				
	}
}
