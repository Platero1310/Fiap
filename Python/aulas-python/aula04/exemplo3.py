#Trabalhando com texto através do print

#Texto em Python pode ser aspas simples ' ' ou compostas " "
nome = "Francisco Douglas"
curso = 'ADS'
idade = 30
print(nome, curso)

# Juntar texto ou concatenar texto
# é utilizado o operador +
print("Nome: "+nome+" Curso: "+curso)

# f-string (format-string), dentro de um texto { }
print(f"Nome: {nome} Curso: {curso} Idade: {idade}")

# Quebras de linhas: \n
print(f"Nome: {nome}\nCurso: {curso}\nIdade: {idade}")

#Utilizando aspas dentro do texto, inverter o uso das aspas
#Utilizando aspas simples para definição de texto e aspas duplas dentro do texto
print('Nome: '+nome+'" Curso: "' + curso)

# Tabulação pode utilizar \t
print('Nome:\tFrancisco\tDouglas')
