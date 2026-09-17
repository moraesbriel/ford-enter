# 8. Faça um programa que solicite dois números ao usuário (com decimais). Em seguida, solicite que o usuário informe a operação matemática (soma, subtração, multiplicação e divisão)

num1 = float(input("Digite um número:"))
num2 = float(input("Digite outro número: "))
operacao = input("Informe a operação matemática (Adição, Subtração, Multiplicação, Divisão): ")

if operacao == "Adição":
    print(num1 + num2)

elif operacao == "Subtração":
    print(num1 - num2)

elif operacao == "Multiplicação":
    print(num1 * num2)

elif operacao == "Divisão":
    if num2 == 0:
        print("Não é possível dividir por zero.")
    else:
        print(num1 / num2)