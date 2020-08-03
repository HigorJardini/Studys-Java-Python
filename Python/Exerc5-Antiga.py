import os
palavra = input("Digite a Palavra: ")
qtde = len(palavra)
os.system('clear')

vidas = []

vidas.append(" (°º°) ")
vidas.append("0|   |0")
vidas.append(" o   o")

def boneco(morte):
  for i in range(0,morte):
    print(vidas[i])

h = 1
j = 0
pontos = 0
morte = 3

print("Você terá apenas 3 Chances para conseguir acertar a palavra")
print("Para Iniciar o Jogo Digite Sim, ou para Não Começar para o JOGO")

while(h > 0):
 start = input("Deseja Iniciar o Jogo: ")

 if(start == "Sim") or (start == "sim"):
   os.system('clear')
   j = 1
   break
 if(start == "Não") or (start == "não"):
   os.system('clear')
   print("Jogo Não Iniciado")
   break
 else:
   print("Comando Invalido")

while(j > 0):
  letra = input("Digite a Letra (ou Terminar para encerrar o Programa): ")

  if(letra == "Terminar") or (letra == "terminar"):
     print("Jogo Terminado")
     break
  
  contador = 0

  for i in range (0,qtde):
    if(letra == palavra[i]):
      pontos += 1
      
      if((qtde-pontos) != 0):
       print("Falta Apenas: ",(qtde-pontos)," letras")

      break
     

    contador += 1
  
  if(contador == qtde):
    morte -= 1
    boneco(morte)
    if(morte > 0):
     print("Letra errada, vezes restante: ",morte)
    if(morte == 0):
      print("Você Perdeu o JOGO")
      j = 0
  if(pontos == qtde):
    print("Parabéns, você Venceu o JOGO!")
    j = 0