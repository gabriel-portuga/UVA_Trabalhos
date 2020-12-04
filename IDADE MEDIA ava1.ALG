Algoritmo "Idade média"
// Disciplina   : [Tópicos da computação]
// Professor   : Marco Aurelio Novaes Esteves
// Descrição   : Calcular a idade média de uma família
// Autor(a)    : Gabriel de Souza da Silva
// Data atual  : 21/02/2020
Var
i_total, i_n, i, n: real

Inicio
i_total <- 0
i <- 0
 escreval ("Quantas pessoas sua família tem?")
 leia (n)

 Repita
 
 escreval ("Escreva a idade das pessoas, uma por vez:")
 leia (i_n)
 i_total <- i_total + i_n
 i <- i + 1

 ate (i = n)

 i_total <- i_total / n
 escreval(" A idade média da sua família é: ", i_total:4:2, " anos")
Fimalgoritmo