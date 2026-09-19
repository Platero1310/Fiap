nome = input("Digite o nome do vendedor: ")
qtd_prod = int(input("Digite a quantidade de produtos vendidos: "))
vlt = float(input("Digite o valor total das vendas: R$"))

salario_base=1800
comissao_prod=150*qtd_prod
comissao_venda=vlt*0.03

salario = salario_base+comissao_prod+comissao_venda

print("O seu salário é: R$", salario)
print("Comissão por Produto: R$", comissao_prod)
print("Comissão por venda: R$",comissao_venda)