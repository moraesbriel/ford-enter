# 3. Faça um programa onde o usuário entre com um valor de início, uma raiz e um valor de finalização, e o programa mostre a P.A. (Progressão Aritmética).

valorInicio = int(input("Digite um valor de início: "))
razao = int(input("Digite a razão da P.A.: "))
valorFinal = int(input("Digite um valor de finalização: "))

while valorInicio <= valorFinal:
    print(valorInicio)
    valorInicio = valorInicio + razao