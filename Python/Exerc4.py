def valorPagamento(valor,dias):
  if (valor == 0):
    print("Programa finalizado")
    return(valor)
  if (dias != 0):
    dias = (dias*(valor*0.001))
    valor += (valor*0.03)
    return (valor+dias)

contador = 1    
diasEmAtraso = 0
a = 0
b = 0
valorSerPago = 0
valorPrestacao = 0
prestacoesPagas = 0
valorTotal = 0

while(contador != 0):
  valorPrestacao = int(input("Digite o valor da prestação (para finalizar digitar 0): "))
  if(valorPrestacao == 0):
    contador = 0
  diasEmAtraso = int(input("Digite o numero de dias em atraso: "))

  if(diasEmAtraso != 0):
     valorSerPago = valorPagamento(valorPrestacao,diasEmAtraso)
  if(diasEmAtraso == 0):
     valorSerPago = valorPrestacao
  
  if(valorPrestacao != 0):
   prestacoesPagas += 1
  valorTotal += valorSerPago
  print("O valor a ser pago nestá prestação é", valorSerPago)
  if (valorPrestacao == 0):
    print("----------------Relatorio Do Dia----------------")
    print("")
    print("A quantiade de prestações pagas neste dia é", prestacoesPagas)
    print("")
    print("E o valor total de todas as prestações é %.2f"         %valorTotal)