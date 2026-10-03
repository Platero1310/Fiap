salario_fixo = float(input("Digite o salario: "))
valor_vendas = float(input("Digite o valor das vendas: "))
taxa1 = valor_vendas * 0.05
taxa2 = 250 + ((valor_vendas - 5000) * 0.07) #correção do gemini na taxa 2
comissão1 = taxa1
comissão2 = taxa2


if (valor_vendas <= 5000):
    print("salario total: ", salario_fixo + taxa1)
    print("A comissão é: ", comissão1)

elif (valor_vendas > 5000):
     print("salario total: ", salario_fixo + taxa2)
     print("A comissão é: ", comissão2)

else:
     print("valor inválido")