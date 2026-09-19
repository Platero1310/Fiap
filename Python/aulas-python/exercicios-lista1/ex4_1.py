salario = int(input("Digite seu salario aqui: "))
porcentagem_de_aumento = float(input("Digite a porcentagem de aumento: "))


aumento = salario * ( porcentagem_de_aumento/100 )

novo_salario = salario + aumento

print("Novo salario", novo_salario)