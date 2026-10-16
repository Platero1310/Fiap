salario_fixo = float(input("Digite o salário fixo: "))
valor_vendas = float(input("Digite o valor de vendas: "))

if valor_vendas <= 5000.00:
    comissao = valor_vendas * 0.05
else:
    comissao = (5000.00 * 0.05) + ((valor_vendas - 5000.00) * 0.07)

salario_total = salario_fixo + comissao

print("Comissão a receber: R$", comissao)
print("Salário total do vendedor: R$", salario_total)