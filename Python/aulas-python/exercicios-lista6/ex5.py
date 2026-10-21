def calcular_preco_final(preco, percentual):
    
    valor_desconto = preco * (percentual / 100)
    
    preco_final = preco - valor_desconto
    return preco_final

preco_original = float(input("Digite o preço original do produto: "))
percentual_desconto = float(input("Digite a porcentagem de desconto: "))

valor_desconto = preco_original * (percentual_desconto / 100)

preco_final = calcular_preco_final(preco_original, percentual_desconto)

print("\n--- Resumo da Compra ---")
print(f"Preço original: R$ {preco_original:.2f}")
print(f"Valor do desconto: R$ {valor_desconto:.2f}")
print(f"Preço final com desconto: R$ {preco_final:.2f}")