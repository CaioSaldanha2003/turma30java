programa{
	
	funcao inicio(){
	inteiro lancamento [10]
	inteiro maiorPont=0,media=0,somaPont

	para(inteiro indice = 0; indice<=9; indice++){
	escreva("Entre com os lançamentos: ")
	leia(lancamento[indice])
	}

	limpa()
	para(inteiro indice = 0; indice<=9; indice++){
	somaPont = media + (lancamento[indice])
	media = somaPont/10
	}

	para(inteiro indice = 0; indice<=9; indice++){
	se(lancamento[indice] > maiorPont){
	maiorPont = lancamento[indice]
	}
	}

	escreva("\nA média é: ",media)
	escreva("\nO maior lançamento é: 1",maiorPont)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */