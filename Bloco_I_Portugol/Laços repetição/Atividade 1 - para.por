programa
{
	
	funcao inicio()
	{
		real salario, filhos, maiorSalario = 0.0, menosQueCem = 0.0
		real mediaSalario = 0.0, mediaFilhos = 0.0
		inteiro contador

		para (contador = 0; contador < 20; contador++){

			escreva("\nDigite o salário do ",contador+1,"º habitante\n")
				leia(salario)
			mediaSalario += salario

			se(salario > maiorSalario){
				maiorSalario = salario
			}

			se(salario <= 100.0){
				menosQueCem++
			}

			escreva("\nDigite o número de filhos do ",contador+1, "º habitante\n")
				leia(filhos)
			mediaFilhos += filhos
			
		}
		escreva("\nA média salarial é de R$",mediaSalario/contador,", composto por :",contador," familias")
		escreva("\nO maior salário foi: R$"+maiorSalario)
		escreva("\nA média de filhos por familia foi de: ",mediaFilhos/contador," filhos")
		escreva("\nO percentual de familias com um salário menor que R$100 é:",(menosQueCem/contador)*100,
			"% composto por ",menosQueCem," familias")
		
	}
}
	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 953; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */