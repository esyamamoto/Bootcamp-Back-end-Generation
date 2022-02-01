package com.org.generation.algoritmos;

import java.util.Scanner;

public class Atividade07 {
public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double a, b, c, d, e, f, x, y;
		
		System.out.print("Insira o valor de A: ");
		a = leia.nextDouble();
		
		System.out.print("Insira o valor de B: ");
		b = leia.nextDouble();
		
		System.out.print("Insira o valor de C: ");
		c = leia.nextDouble();
		
		System.out.print("Insira o valor de D: ");
		d = leia.nextDouble();
		
		System.out.print("Insira o valor de E: ");
		e = leia.nextDouble();
		
		System.out.print("Insira o valor de F: ");
		f = leia.nextDouble();
		
		// x = ce - bf / ae - bd
		// y = af - cd / ae - bd
		
		x= ((c*e)-(b*f))/((a*e)-(b*d));
		y= ((a*f)-(c*d))/((a*e)-(b*d));
		
		System.out.print("O valor de X: " +x);
		System.out.print("O valor de Y: " +y);
		leia.close();
		
		}
}
