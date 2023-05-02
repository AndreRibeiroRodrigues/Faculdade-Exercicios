n1 = int(input('Digite o primeiro numero: '))
n2 = int(input('Digite o segundo numero'))
div = n1/n2
if n1 == 0:
    print('A divisão será indeterminada')
elif n1 > 0:
    print(f'A divisao de {n1} com {n2} é {div}')