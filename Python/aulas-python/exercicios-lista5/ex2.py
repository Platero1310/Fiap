valor = float(input("Digite o valor em R$: "))

sigla = input("Digite o tipo de moeda (USD, EUR, GBP.): ")

match sigla:

    case "USD":
        print(valor * 0.20)

    case "EUR":
        print(valor * 0.18)

    case "GBP":
        print(valor * 0.15)

    case _:
        print("Moeda não suportada")