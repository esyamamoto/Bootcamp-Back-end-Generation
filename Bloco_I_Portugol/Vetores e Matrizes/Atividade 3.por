programa
{
	
	funcao inicio()
	{
		real N1[4][6], N2 [4][6], M1[4][6], M2[4][6]
		inteiro linha, coluna

		para (linha = 0; linha < 4; linha++){

			para(coluna = 0; coluna < 6; coluna ++){
				escreva("Valor da posição de N1 [ " ,linha+1, " ] [ ",coluna+1," ] :")
				leia(N1[linha][coluna])
				
			}				
		}
				limpa()

		para (linha = 0; linha < 4; linha++){

			para(coluna = 0; coluna < 6; coluna ++){
				escreva("Valor da posição de N2 [ " ,linha+1, " ] [ ",coluna+1," ] :")
				leia(N2[linha][coluna])
			}
		}
		limpa()

		escreva("N1 + N2 = M1: \n")
		para (linha = 0; linha <4; linha++){

			para (coluna = 0; coluna <6; coluna++){
				M1[linha][coluna] = N1[linha][coluna] + N2[linha][coluna]
				escreva("[ " + M1[linha][coluna] + " ]")
			}
			escreva("\n")
		}
		escreva("\n\nN1 - N2 = M2:\n")
		
		para (linha = 0; linha <4; linha++){

			para (coluna = 0; coluna <6; coluna++){
				M2[linha][coluna] = N1[linha][coluna] - N2[linha][coluna]
				escreva("[ " + M2[linha][coluna] + " ]")
			}
			escreva("\n")
		}

		
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1040; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */