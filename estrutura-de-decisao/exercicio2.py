# 2. Escreva um programa que receba um número inteiro e diga se ele é par ou ímpar.

num = int(input("Digite um número: "))

if num % 2 == 0 :
    print("O número", num, "é par.")

else:
    print("O número",num,"é ímpar.")