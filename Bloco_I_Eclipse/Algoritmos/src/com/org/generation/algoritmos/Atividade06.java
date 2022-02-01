package com.org.generation.algoritmos;

import java.util.Scanner;

public class Atividade06 {
			
		public static void main(String[] args) {

	        double x1, x2, y1, y2, dx, dy, dxy, D;
	        
	        Scanner ler = new Scanner(System.in);

	        System.out.print("\nQual o valor de x1: ");
	        x1 = ler.nextDouble();
	        System.out.print("\nQual o valor de x2: ");
	        x2 = ler.nextDouble();
	        System.out.print("\nQual o valor de y1: ");
	        y1 = ler.nextDouble();
	        System.out.print("\nQual o valor de y2: ");
	        y2 = ler.nextDouble();
	        
	        
	        
	        dx=Math.pow((x2-x1), 2);
	        dy=Math.pow((y2-y1), 2);
	        dxy=dx+dy;
	        
	        D=Math.sqrt(dxy);

	        System.out.printf("\nA distância entre os pontos é de %.2f",D);
	        
	        ler.close();
	    }
		
}
