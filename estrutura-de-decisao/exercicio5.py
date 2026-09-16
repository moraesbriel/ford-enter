# 5. Refaça o programa anterior mostrando entrada proibida se o usuário for menor  de 18 anos, e seja bem vindo se o usuário tiver 18 anos ou mais.

idade = int(input("Digite sua idade: "))

if idade < 18:
    print("Entrada proibida")

else:
    print("Seja bem vindo")