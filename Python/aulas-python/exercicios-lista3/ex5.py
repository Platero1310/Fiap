n1 = int(input("Digite o primeiro número: "))
n2 = int(input("Digite o segundo número: "))
n3 = int(input("Digite o segundo número: "))

if n1 < n2 < n3:
    print("O primeiro número é o menor:", n1)
elif n2 < n1 < n3:
    print("O segundo número é menor:", n2)
elif n3 < n2 < n1:
    print("O terceiro número é menor:", n3)
else:
    print("Os números são iguais")