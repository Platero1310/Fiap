def n_par(numero):
    return numero % 2 == 0

for n in range(5):
    n_usuario = int(input(f"Digite o {n+1}º número: "))

    if n_par(n_usuario):
        print(f"O número {n_usuario} é Par.")
    else:
        print(f"O número {n_usuario} é Impar.")