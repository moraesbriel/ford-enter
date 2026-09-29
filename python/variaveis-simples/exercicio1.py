# 1. Crie três variáveis e peça para o usuário:

# a) Uma chamada cidade que guarde o nome da sua cidade;
# b) Uma chamada ano que guarde o ano atual;
# c) Uma chamada temperatura que guarde um valor numérico representando a temperatura média da sua cidade.

# Em seguida, imprima uma frase completa usando esssas variáveis.

cidade = input("Digite sua cidade: ")
ano = input("Digite o ano atual: ")
temperatura = float(input("Digite a temperatura média da sua cidade: "))
print("Hoje em ",cidade, ", ano de",ano, ", a média da temperatura é de",temperatura, "graus.")