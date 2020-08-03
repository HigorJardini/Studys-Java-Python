def triangulo(lado1,lado2,lado3):
  if lado1 >= lado2 + lado3:
    return "triangulo nenhum é FORMADO"
  if lado1*lado1 == lado2 *lado2 + lado3 *lado3:
    return "triangulo RETANGULO"
  if lado1*lado1 > lado2*lado2 + lado3*lado3:
    return "triangulo OBTUSANGULO"
  if lado1*lado1 < lado2*lado2 + lado3*lado3:
    return "triangulo ACUTANGULO"
lado1 = float(input("digite um dos lados : "))
lado2 = float(input("digite um dos lados : "))
lado3 = float(input("digite um dos lados : "))
print(triangulo(lado1,lado2,lado3))