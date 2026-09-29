# 5. Faça um programa onde o usuário entre com um número e o programa calcule o fatorial desse número.
# num! = x * (num - fatorial)

num = int(input("Digite um número: "))
fatorial = 1
x = num

while x >= 1:
    fatorial = fatorial * x
    x = x - 1

print(f"O fatorial de {num} é igual a {fatorial}.")
