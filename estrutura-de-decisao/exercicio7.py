# 7. Elabore um programa onde o usuário informe a altura de duas pessoas e o programa retorne quem é mais alto ou se são da mesma altura.

altura1 = float(input("Digite a altura de Fulano: "))
altura2 = float(input("Digite a altura de Ciclano: "))

if altura1 > altura2:
    print("Fulano é maior que Ciclano")

elif altura1 == altura2:
    print("Fulano e Ciclano são da mesma altura.")

else:
    print("Ciclano é maior que Fulano")