nome = input("Digite o seu nome: ")
print(nome,type(nome))

idade = input("Digite a sua idade: ")
print(idade, type(idade))

# Toda informação que é enviada ou recuperda do terminal é str (String, mesmo que Texto)
#Funções de conversão
#Numeros inteiros int()
#Numeros decimais float()

idade = int(input("Digite a sua idade (0 até 100): "))
print(idade, type(idade))


altura = float(input("Digite a sua altura: "))
print(altura, type(altura))

situacao = bool(input("Digite 0 para Sair ou 1 para manter Ativo: "))
print(situacao, type(situacao))
# no bool é esperado 1 - True ou 0 - False

verdadeiro = True
falso = False
print(type(verdadeiro), type(falso))

# Na programação temos as seguintes tipagens: Texto, Números e Booleanos