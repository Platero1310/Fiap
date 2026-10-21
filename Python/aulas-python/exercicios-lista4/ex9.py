salario = float(input("Digite o salário atual: "))
percentual = float(input("Digite o percentual de reajuste: "))

aumento = salario * (percentual / 100)
novo_salario = salario + aumento

print("O valor do aumento é:", aumento)
print("O novo salário atualizado é:", novo_salario)