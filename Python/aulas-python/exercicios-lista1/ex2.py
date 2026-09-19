n1 = float(input("Digite o 1ºnumero: "))
n2 = float(input("Digite o 2ºnumero: "))

#1ª: Exibindo a operação matemática dentro do print
print("Soma:", n1+n2)
print("Multiplicação: ", n1*n2)
print("Subtração: ", n1-n2)
print("Divisão: ", n1/n2)

#2ª: Utilizando uma variavel para receber o resultado da op. matemática
res = n1 + n2
print("Soma: ", res)

res = n1 - n2
print("Subtração", res)

#3ª: É a Mesma que a 1ª, porém utilizando UM print
print("Soma: ", n1+n2, "\n Subtração: ", n1-n2)