# 4. Faça um programa onde o usuário entre com um valor de início, a razão e um valor de finalização, e o programa mostre a P. G. (Progressão Geométrica).

valorInicio = int(input("Digite um valor de início: "))
razao = int(input("Digite a razão: "))
valorFinal = int(input("Digite um valor de finalização: "))

while valorInicio <= valorFinal:
    print(valorInicio)
    valorInicio = valorInicio * razao