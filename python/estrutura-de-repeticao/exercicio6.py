# 6. Faça um programa em que o usuário entre com um número de elementos que deseja que o programa mostre a sequência Fibonacci (1, 1, 2, 3, 5, 8, 13, 21, ...), em seguida, o programa deverá perguntar se o usuário deseja repetir o processo.

resp = "s"

while resp == "s" or resp == "S":

    proximo = 0
    anterior = 0
    atual = 1
    contador = 2
    limite = int(input("Quantos números da sequência Fibonacci deseja?"))
    print(atual)

    while contador <= limite:
        proximo = anterior + atual
        print(proximo)
        anterior = atual
        atual = proximo
        contador = contador + 1

    resp = str(input("Digite s para gerar outra sequência: "))