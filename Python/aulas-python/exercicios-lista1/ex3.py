altura = float(input("Digite a sua altura: "))
peso = float(input("Digite o seu peso: "))

imc = peso / (altura*altura)
print("O meu IMC: ", imc)

#ou
print("O meu IMC: ", (peso/(altura*altura)))