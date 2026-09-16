print(" c = casado\n s = solteiro\n d = divorciado\n v = viuvo\n o = outros.")
usuario = input("Digite a letra indicada acima que corresponde ao seu estado civil:")

casado = "c"
solteiro = "s"
divorciado = "d"
viuvo = "v"
outros = "o"

if usuario == "c":
    print("Casado")

elif usuario == "s":
    print("Solteiro")

elif usuario == "d":
    print("Divorciado")

elif usuario == "v":
    print("Viúvo")

elif usuario == "o":
    print("Outros")