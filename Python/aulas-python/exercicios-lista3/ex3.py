h = int(input("Digite as horas aqui: "))
m = int(input("Digite os minutos agora: "))

if h > 0 and h < 23:
    print("As horas são válidas")
else:
    print("As horas estão fora dos valores permitidos")

if m > 0 and m < 59:
    print("Os minutos são válidos")
else:
    print("Os minutos estão fora dos valores permitidos")