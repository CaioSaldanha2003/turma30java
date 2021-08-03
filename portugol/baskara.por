programa{

	inclua biblioteca Matematica --> m
	funcao inicio(){
	inteiro a
     inteiro b
	inteiro c
	inteiro delta
	inteiro x1
	inteiro x2
	
	escreva("\nInforme pro pai aq de: ")
	escreva("\na: ")
	leia(a)
	escreva("\nb: ")
	leia(b)
	escreva("\nc: ")
	leia(c)

	delta = m.potencia(b,2) - 4*a*c
	
	x1 = (-1*b + m.raiz(delta,2))/(2*a)
	x2 = (-1*b - m.raiz(delta,2))/(2*a)


	escreva("\nAqui está os valores de: ")
	escreva("\nDelta: "+delta)
	escreva("\nX1: "+x1)
	escreva("\nX2: "+x2)
	
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 376; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */