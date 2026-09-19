senha = input("Digite a senha: ")
usuario = input("Digite o nome do usuario: ")

if senha != "fiap" and usuario != "admin":
    print("Senha incoreta")
else:
    print("Acesso permitido!")

# OU

#condição invertida
if senha == "fiap" and usuario == "admin":
    print("Acesso permitido")
else:
    print("Senha OU Usuario incorretos")