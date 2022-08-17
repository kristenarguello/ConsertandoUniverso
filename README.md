# ConsertandoUniverso
O Elon Musk acaba de me avisar de um dos seus funcionários sabe como consertar o multiverso criado.
Assim como no "O guia do mochileiro das galáxias" a resposta do universo é 42 o funcionário, durante uma epifania, criou um programa que
segundo ele descobre a resposta de como dar "rollback" nesse problema criado.

Porém após o fim da epifania ele percebeu que o programa estava escrito em assembly, e ele não sabe muito bem como fazer para isso ser executado.
Pelo menos ele sabe do que se trata e o mais importante: Ele sabe as regras de cada instrução! No código fornecido por ele (o input do problema)
aparecem, obviamente, as instruções, mas também alguns números imediatos e no máximo 4 caracteres (que devem ser os registradores).
Esses registradores se chamam respectivamente "a", "b", "c" e "d" e todos começam em 0.

A lista de instruções está abaixo:

cpy x y --> copia "x" (x pode ser tanto um valor decimal quanto um registrador) para o registrador "y".
inc x   --> aumenta o valor do registrador "x" em 1.
dec x   --> diminui o valor do registrador "x" em 1.
jnz x y --> pula para a instrução "y" adiante (positivo significa que é para frente e negativo significa que é para tras).
	    mas o salto só acontece se o valor de "x" for diferente de 0.

A instrução de salto (jnz) é relativo à instrução atual, então se "y" for -1 o código deve continuar a partir da última instrução executada,
enquanto que se "y" for 2 deve ser pulada a próxima instrução, por exemplo.

O maluco que trabalha pro Elon Musk garante que o número mágico a ser obtido está dentro do registrador "a" quando esse programa que
ele escreveu terminar de ser executado, então a pergunta que fica é:

Ao final do programa, qual é o número dentro do registrador "a"?

INPUT:
cpy 1 a
cpy 1 b
cpy 26 d
jnz c 2
jnz 1 5
cpy 7 c
inc d
dec c
jnz c -2
cpy a c
inc a
dec b
jnz b -2
cpy c b
dec d
jnz d -6
cpy 16 c
cpy 12 d
inc a
dec d
jnz d -2
dec c
jnz c -5
