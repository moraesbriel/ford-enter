# 2. Crie um programa onde o usuário irá escrever dois números inteiros quaisquer e o programa irá imprimir:

# a) A soma dos dois números;
# b) A subtração dos dois números;
# c) A divisão dos dois números;
# d) A multiplicação dos dois números;
# e) A exponenciação dos dois números;
# f) A divisão inteira dos dois números;
# g) O módulo dos dois números;

# print o resultado de cada operação.

num1 = int(input("Escreva um número inteiro: "))
num2 = int(input("Escreva outro número inteiro: "))

print("A soma dos dois números é igual a",num1 + num2)
print("A subtração dos dois números é igual a",num1 - num2)
print("A divisão dos dois números é igual a",num1 / num2)
print("A multiplicação dos dois números é igual a",num1 * num2)
print("A exponenciação dos dois números é igual a",num1 ** num2)
print("A divisão inteira dos dois números é igual a", num1 // num2)
print("O módulo dos dois números é igual a",num1 %  num2)