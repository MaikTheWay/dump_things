# Crie uma variável chamada val1 e atribua o valor 12
# Crie uma variável chamada val2 e atribua o valor 3.75
# Crie uma variável chamada texto e atribua o valor O valor da soma é:
# Imprima o tipo da variável val1
# Imprima o tipo da variável val2
# Imprima o tipo da variável texto
# Crie uma variável chamada soma e atribua a soma de val1 e val2
# Imprima o tipo da variável soma
# Imprima a variável texto juntamente com a variável soma
val1 = 12
val2 = 3.75
texto = 'a soma é:'
print(val1)
print(val2)
print(texto)
soma = val1 + val2
print(type(soma))
print(texto, soma)



# Escreva um programa que inicialize uma variável com o valor 32 para representar a temperatura em Celsius.
# Em seguida, converta esse valor em Fahrenheit usando a fórmula F = 1.8C + 32.
# Imprima o valor Fahrenheit.
var1 = 32
f = (1.8 * var1) + 3
print(f)



# Escreveva um script que converta uma quantidade inteira de minutos em seu respectivo valor dado em horas e minutos.
# O resultado do seu script deve ser da seguinte forma:
# Horas: x
# Minutos: y
# Por exemplo, o resultado da conversão de 132 minutos deve ser:
# Horas: 2
# Minutos: 12
digitado = 132
h = int(digitado / 60)
m = int(digitado - h * 60)
s = int(round(digitado % 1 * 60))
print(h)
print(m)
print(s)



# Crie um programa que avalia se um número entre 1 e 5, fornecido pelo usuário, é um número primo
# (quando ele é divisivel por 1 e por ele mesmo)
num = int(input('VEJA SE O NUMERO É PRIMO:'))
if num >=1  and num <= 5:
  if num % 1 == 0 and num % num == 0:
    print(f'{num}, é primo')
else:
  print(f'{num}, não é primo')



# Crie um programa que receba dois números do usuário e imprima a relação entre eles (iguais, o primeiro maior que o segundo ou o primeiro menor que o segundo)
num1 = input('Digite o primeiro numero: ')
num2 = input('Digite o segundo numero: ')

if num1 == num2:
  print('Eles são iguais')
if num1 > num2:
  print(f'maior: {num1} menor: {num2}')
if num2 > num1:
  print(f'maior: {num2} menor: {num1}')



# Escreva um programa que pede para o usuário acertar o nome de uma fruta em 10 tentativas.
# A cada interação, o programa deve imprimir o número de tentativas e pedir para que o usuário escolha uma fruta. ]
# Caso o usuário acerte a fruta, o programa deve imprimir "Parabéns, você acertou!". Caso o usuário escreva "desisto", o programa deve imprimir "ok, obrigado pela participação". No caso de todas as tentativas se esgotarem, o programa deve imprimir "Suas tentativas acabaram e você não acertou".
import random

frutas = ['abacaxi','melancia']
cpu = random.choice(frutas)

tentativas = 10

while tentativas > 0:
  user = input('Tente advinhar a fruta que eu estou pensando: ')
  if user != cpu:
    print('Não é essa, tenta de novo!')
    tentativas -= 1
    pass

  if user == cpu:
    print('Parabéns, você acertou!')
    break

  if input == 'desisto':
    print('ok, obrigado pela participação')
    break

else:
  print('acabou suas tentativas!')
  print(f'essa foi a fruta escolhida {cpu}')



# Escreva um programa que retorne o fatorial de qualquer número.
# O programa deve receber um número do usuário e imprimir o valor do fatorial, caso o número fornecido seja menor que 0 a seguinte mensagem deve ser retornada:
# "O valor deve ser positivo"
num = int(input('Fala um numero ae: '))
fatorial = 1
if num < 0:
  print('O valor deve ser positivo')
else:
  for x in range(1, num+1):
    fatorial = fatorial * x

print(f'o valor fatorial é {fatorial}')



# Crie um programa que imprima as tabuadas no seguinte formato:
# 1 * 1 =  1
# 1 * 2 =  2
# 1 * 3 =  3
# 1 * 4 =  4
# 1 * 5 =  5
# 1 * 6 =  6
# 1 * 7 =  7
# 1 * 8 =  8
# 1 * 9 =  9
# 1 * 10 =  10
for x in range(9):
  for i in range(11):
    print(f'{x} * {i} = {x * i}')
  print('\n')



#Escreva um programa em criar a tabuada de um número entre 1 e 10 fornecido pelo usuário.
x = int(input('Digite o numero que voce quer a tabuada: '))
for count in range(10):
  resultado = x * (count + 1)
  print(f'{x} * {count + 1} = {resultado}') 
  
  
  
# Nos primeiros dois anos, um ano canino é igual a 10.5 anos humanos. Depois disso, cada ano do cão equivale a 4 anos humanos.
# Crie um programa que pergunte ao usuário a idade do cachorro e retorne a idade do cachorro em anos caninos.
idade = float(input('Digite a idade do cachorro: '))
if idade <= 2:
  print(idade * 10.5)
elif idade > 2:
  print((idade-2) * 4) + 21)
  


# Crie um programa que, baseado na idade do usuário, indica se este pode votar na eleição de 2022 e se o voto é facultativo ou obrigatório.
idade = int(input('Digite sua idade: '))
if idade >= 18:
  print('Voto obrigatorio!')
elif idade == 16 or idade == 17:
  print('Voto facultativo')
else:
  print('Não precisa votar... ta suave')



# Crie um programa que retorne o útimo dígito de qualquer número inteiro (Dica: Use uma das 3 formas de divisão que existem em Python)
num = input('fala um numero inteiro ae: ')
print(num[-1])



# Escreva um programa para encontrar o maior número de três números do usuário.
num1 = int(input('Digite primeiro numero: '))
num2 = int(input('Digite segundo numero: '))
num3 = int(input('Digite terceiro numero: '))

if num1 > num2 and num1 > num3:
  print(f'Maior numero: {num1}')
if num2 > num1 and num2 > num3:
  print(f'Maior numero: {num2}')
if num3 > num1 and num3 > num2:
  print(f'Maior numero: {num3}')



# Escreva um programa que receba a temperatura em graus Celsius da água e verifica em qual estado de fase a água se encontra
# (considere a pressão ambiente ao nível do mar)

temp = int(input('Digite a temperatura da agua: '))
if temp <= 0:
  print('Está em estado SOLIDO')
if temp >= 100:
  print('Está em estado GASOSO')
else:
  print('Estado em estado LIQUIDO')



# Escreva um programa para verificar se um caractere é vogal ou não.
letra = str(input('Digite uma letra: '))
if letra == 'a' or  letra == 'e' or letra == 'i' or letra == 'o' or letra == 'u':
  print('é vogal mano')
else:
  print('é consoante')



# Uma empresa decidiu conceder bônus ao funcionário de acordo com os seguintes critérios:

# Periodo de Tempo de Serviço	Bonus
# Mais de 10 anos	10%
# entre 6 e 10 anos (inclusos)	8%
# menos de 6 anos	5%

# Pergunte ao usuário seu salário e anos de serviço e imprima o valor líquido do bônus.
salario = int(input('Digite seu salario: '))
anos = int(input('Digite quantos anos de serviço voce tem: '))

if anos > 10:
  print(f'Seu bonus sera: {salario * 0.1}')
if anos < 6:
  print(f'Seu bonus sera: {salario * 0.05}')
else:
  print(f'Seu bonus sera: {salario * 0.08}')



# Escreva um programa que aceite dois números e operadores matemáticos e execute a operação de acordo.
# Exemplo:
# Digite o primeiro número: 7
# Digite o segundo número: 9
# Digite o operador: +
# Sua resposta é: 16
num1 = int(input('Digite o primeiro numero: '))
num2 = int(input('Digite o segundo numero: '))
sinal = str(input('Digite a Operação desejada'))

if sinal == '+':
  print(num1 + num2)
if sinal == '-':
  print(num1 - num2)
if sinal == '**':
  print(num1 ** num2)
if sinal == '/':
  print(num1 / num2)
if sinal == '//':
  print(num1 // num2)
if sinal == '*':
  print(num1 * num2)
if sinal == '%':
  print(num1 % num2)


 
#Escreva um programa para verificar se um triângulo é equilátero, isósceles ou escaleno.
# Um triângulo equilátero é um triângulo em que os três lados são iguais.
# Um triângulo escaleno é um triângulo que tem três lados desiguais.
# Um triângulo isósceles é um triângulo com (pelo menos) dois lados iguais. 
plado = input('1°: ')
slado = input('2°: ')
tlado = input('3°: ')

if plado == slado == tlado:
  print('Triangulo equilátero ')

elif plado != slado != tlado:
  print('Triangulo escaleno')

elif plado == slado or slado == tlado or plado == tlado:
  print('triângulo isósceles')
 
 

# Crie uma função recursiva para calcular a soma de uma lista de números.
def soma_lista_recursiva(lista):
  if len(lista) == 1:
    return lista[0]
  else:
    return lista[0] + soma_lista_recursiva(lista[1:])

soma_lista_recursiva([1,3,4,5])



# Crie uma função recursiva para obter o fatorial de um número inteiro não negativo.
def fatorial(n):
  if n < 0:
    print('Não definido. ')
  elif n <= 1:
    return 1
  else:
    return n * fatorial(n-1)

fatorial(5)



# Crie uma função recursiva para resolver a sequência de Fibonacci.
# A soma dos 2 numeros anteriores é o resultado do proximo
# Criar uma função recursiva

def fibonacci(n):
  if n == 0 or n == 1:
    return n
  else:
    return (fibonacci(n-2) + fibonacci(n-1))

fibonacci(5)



# Crie uma função recursiva para calcular a soma dos dígitos de um número inteiro positivo.
# 315 --> 9
# 3 + 1 + 5 = 9
def numero(num):
  if num == 0:
    return num
  else:
    return (num % 10) + numero(num // 10)

numero(222)



#Crie uma função recursiva que busca um elemento dentro de uma lista ordenada e retorna o índice desse elemento. 
# Caso o índice não seja encontrado a função deve retornar o valor -1. Essa função precisa estar baseada no algoritmo de busca binária.
def encontra_n_lista(n, lista, i):
  if lista[0] == n:
    return i 
  else:
    return encontra_n_lista(n, lista[1:], i + 1)

encontra_n_lista(6, [1,2,3,4,5,6,7], 0)



# Crie uma função que busca um elemento dentro de uma lista ordenada e retorna o índice desse elemento. 
# Caso o índice não seja encontrado a função deve retornar o valor -1. Essa função precisa estar baseada no algoritmo de busca binária.
# X = [2, 3, 23, 30]
# 
# correta:
# Busca (23) ---> é para retornar 2 (Indice)
#
# errada
# Busca (13) ---> não vai retornar nada, pois nâo há o 13 na lista

def binario(array, item, begin=0, end=None):
    if end is None:
        end = len(array)-1
    if begin <= end:
        m = (begin + end)//2
        if array[m] == item:
            return m
        if item < array[m]:
            return binario(array, item, begin, m-1)
        else:
            return binario(array, item, m+1, end)
    return "-1"

lista = [2,3,4,5,6,7,8,9,10]
binario(lista, 3)



# Crie uma função que faça da divisão de dois números. Utilize os algoritmos de aproximação e de busca binária para criar essa função.
# def dividir(a,b)
#      return a/b

def divisao(dividendo, divisor):

  epislon = 0.01
  inf = 0 
  sup = 100
  chute = (sup + inf)/2 
 
  while abs(chute * divisor - dividendo) >= epislon:
    if chute * divisor < dividendo: 
      inf = chute
    else: 
      sup = chute
    chute = (sup + inf)/2
  return chute 



# Crie uma função que calcule a raíz quadrada de um número utilizando os algoritmos de aproximação e de busca binária.
def raiz(raiz):

  epislon = 0.01
  inf = 0 
  sup = raiz
  chute = (sup + inf)/2 

  while abs(chute**2 - raiz) >= epislon:
    if chute**2 < raiz:
      inf = chute
    else: 
      sup = chute
    chute = (sup + inf)/2
  return chute 



# Dada uma lista de números inteiros únicos e não ordenados, crie uma função para encontrar todos os pares em que a diferença seja igual a k.
# [1, 5, 4, -2, 6, 2]
# k = 3
# -------------------
# (1, -2)
# (5, 2)
# (1, 4)
def binario(array, diferenca, item, begin=0, end=None):
    if end is None:
        end = len(array)-1
    if begin <= end:
        m = (begin + end)//2
        if array[m] - item == diferenca:
            print(f'({array[m]}, {item})')
        if item < array[m]:
            return binario(array, diferenca, item, begin, m-1)
        else:
            return binario(array, diferenca, item, m+1, end)
    return "-1"

lista = [1, 5, 4, -2, 6, 2]
lista.sort()
for num in lista: 
  binario(lista, 3, num)
  
  
  
# Você recebe uma lista com números inteiros positivos onde cada número diferente de zero representa uma coluna com largura igual a 1. 
# Imagine que água é derramada sobre as colunas. Escreva um programa que calcule a área da superfície de água que está armazenada entre as colunas.
# Dica: Você pode precisar usar as funções max() e min().

# max(3, 10)
# min(3, 10)

vet_agua = [0,0,5,0,0,6,0]
i = 0
calc_nivel = []
soma_nivel = 0
ver_esquerda = 0

for elem in vet_agua:
  if i != len(vet_agua) - 1:
    ver_direita = max(vet_agua[i+1:])
  else:
    ver_direita = 0

  if i != 0:
    ver_esquerda = max(vet_agua[:i])

  if ver_direita >= ver_esquerda:
     result = ver_esquerda - elem  
  else:
    result = ver_direita - elem                       
  if result > 0:
    soma_nivel += result

  i += 1
print(soma_nivel)



# Crie um programa que define se um número interiro positivo é divisível por 3. Não é permitido usar os operadores de divisão (/, //, %).
numero = int(input('Insira o numero: '))
msg = 'n eh divisel por 3'
while numero >= 3:
  if numero == 3:
    msg = 'eh divisivel por 3'
  
  numero -= 3

print(msg)



# Você recebe uma lista com números inteiros positivos que representam a quantidade de tempo que uma tarefa demora para ser executada.
# Apenas uma tarefa pode ser executada por vez, mas as tarefas podem ser executadas em qualquer ordem. O tempo de espera de cada tarefa é
# definido como a quantidade de tempo que a tarefa precisa esperar antes de sua execução ser iniciada.
# Escreva um programa que retorna o tempo de espera mínimo para uma lista de atividades
tempo_atv = [8,2,1,6]
tempo_espera = []
tempo_atv.sort()
soma_espera = 0

for pos in tempo_atv:
  tempo_espera.append(soma_espera)
  soma_espera += pos

print('Tempo de espera mínimo: ', sum(tempo_espera))



# Escreva um programa que recebe uma string de letras minúsculas e retorna o índice da primeira letra não repetida.
# A primeira letra não repetida é a primeira letra da string que ocorre apenas uma vez.
# Se a string não apresentar nenhuma letra não repetida, o programa deve retornar -1.
lista = ['a', 'v', 'b', 'a', 'c', 'a', 'b']
letra_distinta = '-1' 

for letra in lista:
  if lista.count(letra) == 1:
    letra_distinta = letra
    break

print(letra_distinta)
