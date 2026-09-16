#1. Faça um programa que peça dois números ao usuário e mostre qual o maior e qual o menor número. 

num1 = int(input("Digite um número: "))
num2 = int(input("Digite outro número: "))

if num1 > num2:
    print(num1, "é maior que", num2)

else:
    print(num1, "é menor que", num2)