import random
def Funcao(vet):
  Maior = vet[0]
  segundoMaior = vet[0]
  print(f"----------- A SEQUENCIA É -----------\n\n{vet}")
  
  for i in range(1, len(vet)):
    if vet[i] > Maior:
      Maior =vet[i]
    elif vet[i] > segundoMaior and vet[i] < Maior:
      segundoMaior = vet[i]
  print("")
  print("--------- O MAIOR NUMERO É ---------")
  print("")
  print("                ",Maior)
  print("")
  print("----- O SEGUNDO MAIOR NUMERO É -----")
  print("")
  print("                ",segundoMaior)
vetor = []
for i in range(30):
  vetor.append(random.randint(1, 100))
print(vetor[i])
Funcao(vetor)