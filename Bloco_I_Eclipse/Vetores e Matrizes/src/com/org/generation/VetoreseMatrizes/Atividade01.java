package com.org.generation.VetoreseMatrizes;

import java.util.Scanner;

public class Atividade01 
{
	public static void main(String[] args)
{
		Scanner leia = new Scanner(System.in);	
		double[] nota = new double[5];
		double maiorNota=0.0;
		
				
				
		for (int x=0 ; x<5; x++)
		{
			System.out.println("Insira a " +(x+1)+"ª nota:");
			nota[x] = leia.nextDouble();
			
			if (nota[x]>maiorNota)
			{
				maiorNota = nota [x];
			}
		
		
		System.out.print("\nA maior nota é: " + maiorNota+ "\n");
			
		}
		leia.close();
		}
}
