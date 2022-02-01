programa
{
	
	funcao inicio()
	{
		inteiro mat[3][3], linha,coluna, soma=0, somaDiagonal=0
		
		para (linha=0;linha<3;linha++)
		{
			para (coluna=0;coluna<3;coluna++)
			{
				escreva("Digite um número: ")
				leia (mat[linha][coluna])
			}

			
		}
		para(linha=0;linha<3;linha++)
		{
			para(coluna=0;coluna<3;coluna++)
			{
				soma+=mat[linha][coluna]
			}
			
			escreva("A soma de todos valores é: " +soma)
				para (linha=0;linha<3;linha++)
					para (coluna=0;coluna<3;coluna++)

				se (linha==coluna)
				{
					somaDiagonal+=mat[linha][coluna]
				}
						escreva("\nA soma do valor da diagonal principal é: "+somaDiagonal)
		}	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 584; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */