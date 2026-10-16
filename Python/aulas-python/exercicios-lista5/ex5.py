print("--- SISTEMA DE RESERVAS ---")
print("1. Check-in")
print("2. Check-out")
print("3. Consultar Quarto")
print("4. Sair")

opcao = int(input("Digite a opção desejada (1 a 4): "))

match opcao:
    case 1:
        print("Operação selecionada: Check-in realizado com sucesso.")
    case 2:
        print("Operação selecionada: Check-out realizado com sucesso.")
    case 3:
        print("Operação selecionada: Consulta de quarto em andamento.")
    case 4:
        print("A sair do sistema. Até logo!")
    case _:
        print("""Ops! Opção inválida :( 
       
Escolha um número de 1 a 4.""")