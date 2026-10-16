contador = 0

for n in range (1, 11):
    idade = int(input("digite as idades aqui: "))

    if idade < 18:
            contador += 1

print("Total de menores de idade: ", contador)
print("pessoas de maiores: ", idade - contador)
