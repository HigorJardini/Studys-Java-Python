def matriculaInteiro():
  x = 0
  try:
    matricula = int(input('Número da Matricula: '))
    return x
  except Exception:
    print('Digite um Valor Valido')
    x = 1
    return x
  return matricula


qtdeHumanos = int(input('Quantidade De Alunos: '))
qtdeHumanos += 1

x = 1;

arquivo = open('ReidosStarks.txt','w')
for i in range(1,qtdeHumanos):
  nome = input('Nome Completo: ')
  while(x == 1):
    matriculaInteiro()
  arquivo.write("%s;" % nome)
arquivo.close()