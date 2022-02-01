package com.org.generation.VetoreseMatrizes;

import java.util.Scanner;

public class Atividade04 {
		
	
	
	public static void main(String[] args) 
	{
		
		Scanner leia = new Scanner(System.in);
		
		double[][] matriz = new double[3][3];
		double soma = 0.0, somaDiagonal = 0.0;
		
		
		
		for(int linha = 0; linha< 3; linha++ ) 
		{
			for(int coluna = 0; coluna < 3; coluna++) 
			{
				// %d - representa número inteiro
				System.out.printf("Digite o valor da posição [%d %d]: ",linha,coluna);
				matriz[linha][coluna] = leia.nextDouble();
			}			
		}
		
		for(int linha = 0; linha < 3; linha++ ) 
		{
			for(int coluna = 0; coluna < 3;coluna++) 
			{
				soma += matriz[linha][coluna];
				
				if(linha == coluna) 
				{
					somaDiagonal += matriz[linha][coluna];
				}
			}
		}
		System.out.println("A soma da matriz é: "+soma);
		System.out.println("A soma da diagonal principal da matriz é: "+somaDiagonal);
		leia.close();
	}
}
