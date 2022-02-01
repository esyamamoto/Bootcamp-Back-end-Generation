programa
{
	//7. Escreva um algoritimo que lê os coeficientes	 a, b, c, d, e,  f, e calcule os valores x e y
	
	funcao inicio() 	
	{

	real a, b, c, d, E, f, x, y
	
		escreva("Digite o valor de a: ")
		leia(a)

		escreva("Digite o valor de b: ")
		leia(b)

		
		escreva("Digite o valor de c: ")
		leia(c)

		
		escreva("Digite o valor de d: ")
		leia(d)

		
		escreva("Digite o valor de e: ")
		leia(E)

		
		escreva("Digite o valor de f: ")	
		leia(f)

				// x = ce - bf / ae - bd
			
			x = ((c*E) - (b*f)) / ((a*E)-(b*d))

				// y = af - cd / ae - bd
						 
			y = ((a*f) - (c*d)) / ((a*E) - (b*d))

		escreva ("O valor de X é :" + x + "\n")
		escreva ("O valor de y é :" +y)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 649; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */