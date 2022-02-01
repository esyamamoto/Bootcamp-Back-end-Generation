programa
{
	
	funcao inicio()
	{

		//Desenvolver um sistema que efetue a soma de todos os números ímpares que são múltiplos de três e que se encontram no conjunto dos números de 1 até 500.
		
		inteiro soma = 0,contador = 1

		para(contador; contador <= 500; contador++)
		{
			se(contador%3 == 0)
			{
				escreva("\n",soma,"+",contador,"=",soma+contador)
				soma += contador
				
			}
		}
		escreva("\nFim da soma de todos o snúmeros ímpares que são multiplos de três.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 479; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */