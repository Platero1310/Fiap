idade = int(input("Digite a sua iade: "))
cnh = input("Tem CNH? (sim ou não): ")

if idade >=18 and cnh=="sim":
    print("Voe é permitido a dirigir")
elif idade>=19 and cnh=="nao":
    print("Voce tem o direito de solicitar a cnh, mas não pode dirigir")
else:
    print("Voce não tem idade paa dirigir")

#exemplo sem usar operador lógico

if idade>=18:
    if cnh=="sim":
        print("Voce pode dirigir")
    else:
        print("Voce pode ter a cnh, mas não pode dirigir")
else:
        print("Voce não tem idade pra dirigir")