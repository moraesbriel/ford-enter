# 3. Faça um programa que verifique o estado civil de uma pessoa. Se a letra digitada é "C" (Casado), "S" (Solteiro), "D" (Divorciado), "V" (Viúvo) ou "O" (Outros). Conforme a letra escrita pelo usuário, seu programa deve escrever o estado civil, exemplo:
# Usuário digita: C
# Seu programa deve responder: C - Casado

estadoCivil = input("Digite umas das opções: abaixo\n c = casado\n s = solteiro\n d = divorciado\n v = viuvo\n o = outros.\n")

if estadoCivil == "c":
    print("Casado")

elif estadoCivil == "s":
    print("Solteiro")

elif estadoCivil == "d":
    print("Divorciado")

elif estadoCivil == "v":
    print("Viúvo")

elif estadoCivil == "o":
    print("Outros")