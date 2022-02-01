package com.org.generation.VetoreseMatrizes;

import java.util.Scanner;

public class Atividade02 
{
	public static void main(String[] args)
{
		Scanner leia = new Scanner(System.in);	

			
			int[] dado = new int[10];
			int maiorDado = 0, qntsMaiorDado = 1;
			double media= 0.0, soma = 0.0;
			
			
			for(int x=0; x<10; x++)
			{
				System.out.print((x+1) + "º lançamento: ");
				dado[x] = leia.nextInt();
				
				while (dado[x] <1 || dado[x]>6) 
					{
					System.out.print("Valor inválido, insira valores entre 1 e 6 !!!!\n");
					dado[x] = leia.nextInt();
					}
					
					if(dado[x] > maiorDado) 
					{
						maiorDado = dado[x];
						qntsMaiorDado=1;
					}	
						else if (dado[x] == maiorDado) 
						{
							qntsMaiorDado++;	
						}
									
								{
								soma += dado[x];
								media = soma/10;
					
								}
					
																			
					
					System.out.print("\nA média aritmética é: " + media);
					System.out.print("\nO maior dado foi "  + maiorDado + " e ele se repetiu "  + qntsMaiorDado +"vezes.\n\n" );
					
			}
			
	}
}
	
