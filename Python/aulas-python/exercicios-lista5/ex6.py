codigo = int(input("Digite o código do prato (1 a 6): "))

match codigo:
    case 1:
        nome_prato = "Hamburguer"
        preco = 40.00
    case 2:
        nome_prato = "Lasanha"
        preco = 60.00
    case 3:
        nome_prato = "Bife acebolado"
        preco = 30.00
    case 4:
        nome_prato = "Strogonoff"
        preco = 35.00
    case 5:
        nome_prato = "Picanha"
        preco = 60.00
    case 6:
        nome_prato = "Churrasco"
        preco = 60.00
    case _:
        nome_prato = None
        preco = 0.00

if nome_prato is not None:

    taxa = input("Deseja incluir a taxa de serviço de 10%? (Sim ou Não): ")
    
    if taxa == "Sim" or taxa == "sim":
        total = preco * 1.10
    else:
        total = preco
        
    print("Prato escolhido:", nome_prato)
    print("Valor total a pagar: R$", total)
else:
    print("Prato não encontrado.")