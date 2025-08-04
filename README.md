# Controle de Fluxo

O sistema deverá receber dois parâmetros via terminal que representarão dois números inteiros, com estes dois números obteremos a quantidade de interações (for) e realizaremos a impressão no console (System.out.print) dos números incrementados, exemplo:
--
Se passados os números 12 e 30, logo teremos uma interação (for) com 18 ocorrências para imprimir os números, exemplo: "Imprimindo o número 1", "Imprimindo o número 2" e assim por diante.
Se o primeiro parâmetro for MAIOR que o segundo parâmetro, deverá ser lançada a exceção customizada chamada de ParametrosInvalidosException com a segunda mensagem: "O segundo parâmetro deve ser maior que o primeiro"

Dentro do projeto, temos a classe Contador.java para realizar toda a codificação do nosso programa.
E a classe ParametrosInvalidosException que representará a exceção de negócio no sistema.
