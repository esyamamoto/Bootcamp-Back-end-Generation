package com.org.generation.laçosRepetição;

import java.util.Scanner;

public class Atividade02 {
	
	public static void main(String[] args) 
	
	{
		Scanner leia = new Scanner(System.in);
		
		int par=0, impar=0, num;
		for ( int x=0; x<10; x++)
		{
			System.out.print("Informe o " + (x+1) + "º número: ");
			num = leia.nextInt();
			
			if(num%2==0)
	
				{
				par++;	
				}
			else
				{
				impar++;
				}
		}
		
		
		leia.close();
		System.out.println("Foram " + par +" números pares e "+ impar+" números impares.");
		
		
	}

}
