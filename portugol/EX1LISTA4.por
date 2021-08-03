programa{
	
	funcao inicio(){
	inteiro pontuacao[5]
	inteiro maiorPont = 0

	para(inteiro indice = 0; indice<=4; indice++){
	escreva("Informe o valor: ")
	leia(pontuacao[indice])
	}
	para(inteiro indice = 0; indice<=4; indice++){
	escreva("\n--> ",pontuacao[indice])
	}
	para(inteiro indice = 0; indice<=4; indice++){
	se(pontuacao[indice] > maiorPont){
	maiorPont = pontuacao[indice]
	escreva("\nA maior pontuação é: ",maiorPont)
	}
	}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 437; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */