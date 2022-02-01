package com.org.generation.laçosRepetição;

import java.util.Scanner;


public class Atividade03 {
public static void main(String[] args) 
	
	{
		Scanner leia = new Scanner(System.in);
		int idade=0, menos=0, mais=0;
		
		
		//O programa termina quando idade for =-99
		
			while(idade!=-99) 
		{
			
				System.out.print("Informe a idade e finalize digitando -99: ");   //???????
				idade = leia.nextInt();
					
			
			if(idade < 20 )
			{
				menos++;
			} 
				else if (idade > 50)
			{
					mais++;
			} 
				
		}
		
		System.out.println("Total de pessoas com menos de 20 anos de idade: "+menos);
		
		System.out.println("Total de pessoas com mais de 50 anos de idade: "+mais);
		
	
		leia.close();
		
		
	}
		
	
}
