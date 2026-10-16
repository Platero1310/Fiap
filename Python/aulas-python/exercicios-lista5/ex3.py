mes = input("Insira aqui o mes atual: ")

match mes:

    case "Dezembro"| "Janeiro" | "Fevereiro" :
            print("Verão")

    case "Março" | "Abril" | "Maio":
            print("Outono")

    case "Junho" | "Julho" | "Agosto":
              print("Inverno")

    case "Setembro" | "Outubro" | "Novembro":
                print("Primavera")

    case _:
                print("Mês inválido")