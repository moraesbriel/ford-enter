# Elabore um algoritmo que dada a idade de um nadador, classifique-o em uma das seguintes categorias:

# Infantil A = 5 a 7 anos
# Infantil B = 8 a 11 anos
# Juvenil A = 12 a 13 anos
# Juvenil B = 14 a 17 anos
# Adultos = Maiores de 18 anos

idadeNadador = int(input("Digite a idade do nadador: "))

if idadeNadador >= 5 and idadeNadador <= 7:
    print("Infantil A")

elif idadeNadador >= 8 and idadeNadador <= 11:
    print("Infantil B")

elif idadeNadador >= 12 and idadeNadador <= 13:
    print("Juvenil A")

elif idadeNadador >= 14 and idadeNadador <= 17:
    print("Juvenil B")

elif idadeNadador >= 18:
    print("Adultos")