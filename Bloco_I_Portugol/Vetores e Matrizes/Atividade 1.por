programa
{
	
	funcao inicio()
	{
		inteiro contagem
		real nota[5], maiorNota =0.0

		para (contagem = 0; contagem <5; contagem++)
		{
			escreva("Insira a nota da sua atividade: ")
			leia(nota[contagem])

			se(nota[contagem] > maiorNota) 
			{
				maiorNota = nota[contagem]
			}
		}
		
		
		para (contagem = 0; contagem <5; contagem++)
			{
			escreva("\nA ", contagem+1 , " nota é: " + nota[contagem]+ "\n")
			}
					
		escreva("\nA maior nota é: " + maiorNota+ "\n")
			
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 206; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */