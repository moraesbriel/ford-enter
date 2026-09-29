# 2. Faça um programa onde o usuário  entre com um número e o programa mostre se é um número par ou ímpar, em seguida o programa deverá perguntar se o usuário deseja repetir o processo.

num = int(input("Digite um número: "))

while num % 2 == 0 or num % 2 != 0:
    if num % 2 == 0:
        print(f"O número {num} é par.")

    elif num % 2 != 0:
        print(f"O número {num} é ímpar.")
        
    num = int(input("Digite outro número caso queira repetir o processo: "))