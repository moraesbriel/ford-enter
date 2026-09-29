# Faça um programa onde o usuário entre com seu peso e altura, e o programa mostre o seu IMC e uma das seguintes frases:

# IMC menor de 17: Muito abaixo do peso.
# IMC maior que 17 e menor que 18.5: Abaixo do peso.
# IMC maior que 18.5 e menor que 25: Parabéns! Peso ideal.
# IMC maior que 25 e menor que 30: Acima do peso.
# IMC maior que 30 e menor que 35: Obesidade 1.
# IMC maior que 35 e menor que 40: Obesidade 2 (severa).
# IMC acima de 40: Obesidade 3 (mórbida).

peso = float(input("Digite seu peso: "))
altura = float(input("Digite sua altura: "))
imc = peso / (altura * altura)
print("Seu IMC é de",imc)

if imc < 17:
    print("Muito abaixo do peso.")

elif imc > 17 and imc < 18.5:
    print("Abaixo do peso.")

elif imc > 18.5 and imc < 25:
    print("Parabéns! Peso ideal.")

elif imc > 25 and imc < 30:
    print("Acima do peso.")

elif imc > 30 and imc < 35:
    print("Obesidade 1")

elif imc > 35 and imc < 40:
    print("Obesidade 2 (severa).")

elif imc > 40:
    print("Obesidade 3 (mórbida).")