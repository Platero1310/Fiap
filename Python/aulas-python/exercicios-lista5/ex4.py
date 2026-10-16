num = int(input("Informe um número: "))

operacao = int(input("""Escoha a operação desejada: 

1- O Dobro
2- A Metade
3- 10% do número

"""))

match operacao:
        
    case 1:
        print("O dobro é:", num * 2)

    case 2:
        print("A metade é: ", num / 2)

    case 3:
        print("10% é: ", num * 0.10 )