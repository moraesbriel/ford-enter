# 9. Elabore um programa utilizando operadores lógicos onde o usuário digite uma letra e o programa informe se a letra é uma vogal ou uma consoante.

letra = input("Digite uma letra maiúscula: ")

if letra == "A" or letra == "E" or letra == "I" or letra == "O" or letra =="U":
    print("A letra",letra,"é uma vogal.")

else:
    print("A letra",letra,"é uma consoante.")