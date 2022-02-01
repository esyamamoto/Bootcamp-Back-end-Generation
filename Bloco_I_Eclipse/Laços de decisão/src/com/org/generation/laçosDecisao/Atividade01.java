package com.org.generation.laçosDecisao;

import java.util.Scanner;

public class Atividade01 {
	public static void main(String[] args) 
	{
		//Faça um programa que receba três inteiros e diga qual deles é o maior.
		
		Scanner leia = new Scanner(System.in);
		
		int [] numero;
		numero = new int[3];
		
		
		for(int i = 0; i <3; i++) 
		{
			 
			System.out.print("Digite o "+ (i +1) +"º número inteiro: ");
			numero[i] = leia.nextInt();
		}
		
		if (numero[0] > numero [1] && numero[0] > numero [2]) 
		{
			System.out.print("O maior número é: "+numero[0]);
		}
		
		
		else if(numero[0] < numero [1] && numero [1] > numero[2]) 
		{
			System.out.print("O maior número é: " +numero[1]);
		}
		
		
		else if(numero[0] < numero[2] && numero[2] > numero [1])
		{
			System.out.print("O maior número é: ");
		}
		leia.close();
		}
}
