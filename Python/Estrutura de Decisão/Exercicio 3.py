print('{:=^40}'.format('CALCULADORA'))
n = int(input('Digite um numero: '))
n2 = int(input('Digite o segundo valor'))
print('''Escolha
[ + ] Soma
[ - ] Subtração
[ * ] Multiplicação
[ / ] Divisão
[ ** ] Potenciação
''')
c = str(input('Sua escolha: '))

if c == '+':
    soma = n + n2
    print(f'O valor da soma entre {n} e {n2} é {soma}')

elif c == '-':
    sub = n - n2
    print(f'o valor da subtração entre {n} e {n2} é {sub}')

elif c == '*':
    mult = n * n2
    print(f'o valor da multplicação entre {n} e {n2} é {mult}')

elif c == '/':
    div = n / n2
    print(f'o valor da divisão entre {n} e {n2} é {div}')

elif c == '**':
    pot = n ** n2
    print(f'o valor da potenciação entre {n} e {n2} é {pot}')

else:
    print('erro, Opção invalida')