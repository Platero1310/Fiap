v1 = int(input("Digite o primeiro valor: "))
v2 = int(input("Digite o segundo valor: "))
v3 = int(input("Digite o terceiro valor: "))

if v1 == v2 == v3:
    print("Números iguais")
elif v1 <= v2 and v1 <= v3:
    print(v1)
elif v2 <= v1 and v2 <= v3:
    print(v2)
else:
    print(v3)