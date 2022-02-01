programa
{
	inclua biblioteca Matematica --> math
	
	funcao inicio()
	{
		real x1, x2, y1, y2, dx, dy, dxy, distanciaEntrePontos
        		escreva("Qual o valor de x1?: ")
        		leia(x1)        	
        		escreva("Qual o valor de y1?: ")
        		leia(y1)        	
        		escreva("Qual o valor de x2?: ")
        		leia(x2)        	
        		escreva("Qual o valor de y2?: ")
        		leia(y2)
      		dx = math.potencia((x2-x1), 2)
        		dy = math.potencia((y2-y1), 2)
              	dxy = dx+dy

        		distanciaEntrePontos = math.raiz(dxy, 2)

escreva("A distância entre os pontos é de ", math.arredondar(distanciaEntrePontos, 2))

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 172; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */