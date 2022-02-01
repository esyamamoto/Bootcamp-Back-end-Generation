package com.org.generation.laçosDecisao;

import java.util.Arrays;
import java.util.Scanner;

public class Atividade02 {
	public static void main(String[] args) 
	{
		//Faça um programa que entre com três números e coloque em ordem crescente.
		
		Scanner leia = new Scanner(System.in);
		
		double[] numero;
		numero = new double[3];
		
				
		
		for(int i=0; i<3; i++)
		{
			System.out.println("Insira o "+(i+1)+"º número: ");
			numero[i] = leia.nextDouble();
		}
		
		 Arrays.sort(numero);
		
		
			System.out.println("A ordem crescente dos números são: " +Arrays.toString(numero));
			leia.close();
		
	
		
			
	}
	}
