programa
{
	
	funcao inicio()
	{
		inteiro dado[10], cont, maiorDado = 0, qntsMaiorDado = 0
		real media = 0.0, soma = 0.0
		logico dadoValido = falso

		para (cont = 0; cont < 10; cont++){
						
			enquanto(dadoValido != verdadeiro){
				escreva(cont + 1, "ª lançamento: ")
				leia(dado[cont])

					se(dado[cont] > 0 e dado[cont] <=6){
						dadoValido = verdadeiro

						soma += dado[cont]
						media = soma/10
				
						se(dado[cont] > maiorDado){
							maiorDado = dado[cont]
							qntsMaiorDado = 0
							
							}
						se (dado[cont] == maiorDado){
							qntsMaiorDado++
						}													
						
					} senao {
						dadoValido = falso
						escreva("Valor inválido!\n")
						}
				}
				
				dadoValido = falso
			}	
				escreva("\nA média aritmética é:" + media)
				escreva("\n\nO maior dado foi " + maiorDado + " e ele se repetiu " + qntsMaiorDado +" vezes.\n\n")
				
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 898; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */