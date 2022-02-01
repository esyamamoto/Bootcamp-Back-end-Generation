package com.org.generation.Collection;

import java.util.*;


public class TesteEstoque {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
				
		ArrayList<Estoque> estoque = new ArrayList<>();
		
		
		int press = -1;
		
		estoque.add(new Estoque("Coca-Cola", 1010));
		estoque.add(new Estoque("Água", 1111));
		estoque.add(new Estoque("Energético", 1212));
		estoque.add(new Estoque("Cerveja", 1313));
		
		while(press !=0) {
			
		System.out.println("VOCÊ DESEJA?\n\n[1]ADICIONAR PRODUTO \n[2]REMOVER PRODUTO \n[3]ATUALIZAR PRODUTO \n[4]MOSTRAR ESTOQUE \n[0]SAIR" );
		press = scanner.nextInt();
		
			if (press == 1) {
				System.out.println("Insira o nome do produto: ");			
				String produto = scanner.next();
			
				System.out.println("Insira o nº de série do produto");
				int numSerie = scanner.nextInt();
				System.out.println("PRODUTO ADICIONADO!!!");
				estoque.add(new Estoque(produto, numSerie));
				} 
		
			else if (press == 2) {
				System.out.println("Digite o número do item que deseja remover: ");
				int i = scanner.nextInt();
				System.out.println("PRODUTO REMOVIDO!!!");
				estoque.remove(i);
			
				} 
		
			else if (press == 3) {
				System.out.println("Digite o número do item que deseja atualizar: ");
				int i = scanner.nextInt();
			
				System.out.println("Insira o nome do novo produto: ");
				String produto = scanner.next();
			
				System.out.println("Insira o nº de série do produto: ");
				int numSerie = scanner.nextInt();
				System.out.println("PRODUTO ATUALIZADO!!!");
			
				estoque.set(i, new Estoque(produto, numSerie));			
			} 
			
			else if (press == 4) {	
				System.out.println("PRODUTOS ESTOQUE: ");
				System.out.println();	
				}

		
			else {
			System.out.println("FECHANDO O PROGRAMA!!! \n\nPRODUTOS ESTOQUE:");
			}
		
			for (int i = 0; i < estoque.size(); i++ ) {
			System.out.println(i + "|" + estoque.get(i));	
			System.out.println();
			}
		}
		scanner.close();
	}
}


	
