# 1. Faça um programa onde o usuário entre com dois números e possa escolher qual das operações matemáticas será realizada. Após a realização do calculo, o programa deverá perguntar se o usuário deseja realizar outro calculo, até quando o usuário quiser encerrar o programa.

num1 = float(input("Digite um número:"))
num2 = float(input("Digite outro número: "))
operacao = input("Digite a operação que deseja fazer:\n + para somar\n - para subtrair\n * para multiplicar\n / para dividir\n")

while operacao == "+" or operacao == "-" or operacao == "*" or operacao =="/":
    if operacao == "+":
        print(f"{num1} + {num2} = {num1 + num2}")

    elif operacao == "-":
        print(f"{num1} - {num2} = {num1 - num2}")

    elif operacao == "*":
        print(f"{num1} * {num2} = {num1 * num2}")

    elif operacao == "/":
        if num2 == 0:
            print("Não é possível divisão por zero")

        else:
            print(f"{num1} / {num2} = {num1 / num2}")

    operacao = input("Escolha outra operação ou pressione qualquer tecla para sair: ")

print("Fim do programa.")