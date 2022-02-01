package com.org.generation.algoritmos;

import java.util.Scanner;

public class Atividade04 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double A, B, C, D, R, S;
		
		System.out.print("Insira o valor de A: ");
		A = leia.nextInt();
		
		System.out.print("Insira o valor de B  ");
		B = leia.nextInt();
		
		System.out.print("Insira o valor de C:  ");
		C = leia.nextInt();
		
		//R=(A+B)²
		//S=(B+C)²
		R = Math.pow((A+B),2.0);
		S = Math.pow((B+C),2.0);
		//D=R+S/2
		D = (R + S)/2;
		
		System.out.print("O valor de D é: "+D);
		leia.close();
	}
}
