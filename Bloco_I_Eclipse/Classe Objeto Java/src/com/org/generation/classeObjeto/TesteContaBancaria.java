package com.org.generation.classeObjeto;

import java.util.Scanner;

public class TesteContaBancaria {
	public static void main(String[] args) 
	{
		
		
		int saldo = -1;
		Scanner leia = new Scanner(System.in);
		Conta c1 = new Conta ();
				
		
		c1.setNome("Mewpi");
		c1.setCpf("000.000.000-00");
		c1.setRg("000000000");
		c1.setDataNascimento("00/00/0000");
		c1.setEndereço("Rua Valorant Ferro, nº70. Ascent");
		c1.setEmail("erika.s.yamamoto@gmail.com");
		c1.setTelefone("(11) 00000-0000");
		
		
		
		System.out.println("Nome: "+c1.getNome());
		System.out.println("CPF: " +c1.getCpf());
		System.out.println("RG: " +c1.getRg());
		System.out.println("Data de Nascimento: "+c1.getDataNascimento());
		System.out.println("Endereço: "+c1.getEndereço());
		System.out.println("e-mail: "+c1.getEmail());
		System.out.println("Telefone: "+c1.getTelefone()+"\n");
		
		System.out.println("\nDigite a opção \n [1] Sacar dinheiro \n [2] Depositar dinheiro\n");
		saldo = leia.nextInt();
			
		
			if(saldo == 1) 
			{
			System.out.println("Digite o valor que deseja sacar: ");
			double x = leia.nextDouble();
			
			
				if(x > c1.getConta()) 
				{
				System.out.println("Você não tem saldo suficiente.");
				}
				else 
				{
					c1.sacar(x);
				}
				System.out.println("O seu saldo atual é: " + c1.getConta());
			}
			else if(saldo == 2) {
			System.out.println("Digite o valor que deseja depositar: ");
			c1.depositar(leia.nextDouble());
			System.out.println("Seu saldo atual é: " +c1.getConta());
			}
			else
			{
				System.out.println("Entrada inválida!");
			}
		
			leia.close();
	}
}
