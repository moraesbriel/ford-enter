# 4. Elaborar um programa onde o usuário digite sua idade, caso seja menor de 18, apareça a mensagem proibida a entrada.

idade = int(input("Digite sua idade: "))

if idade < 18:
    print("Entrada proibida")