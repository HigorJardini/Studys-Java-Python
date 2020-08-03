stopword_letras = open('stopwords.txt','r')
stopword_letras = stopword_letras.read()
stopword_letras = stopword_letras.split('\n')

# nome_arquivo = input("Digite o Caminho do Arquivo: ")
# arquivo = open(nome_arquivo,'r')
arquivo = open('stopwords.txt','r')
arquivo = arquivo.read()
arquivo = arquivo.split('\n')

dict = {}
print(dict)

for palavra in arquivo:
      dict[palavra] = 0
      if palavra in dict:
        dict.pop(palavra)
        print('Deletou')
      elif palavra not in dict:
        dict[palavra] += 1 
print(dict)

