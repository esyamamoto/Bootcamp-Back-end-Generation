programa
{

	funcao inicio()
    {
        inteiro numero, somaNumero = 0, media, contador = 0

        escreva("\nEntre com um número: ")
        leia(numero)

        enquanto (numero > 0)
        {
            somaNumero += numero 
            escreva("\nEntre com um número: ")
            leia(numero)
            contador++

        }

        media = somaNumero/contador

        limpa()
        escreva("\nSomatório dos números lidos foi de: ",somaNumero)
        escreva("\nA média da somatória foi de: ",media)
        escreva("\nInseridos um total de ",contador," números")
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 585; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */