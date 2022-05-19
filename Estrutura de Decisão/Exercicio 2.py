n = int(input('Digite um numero: '))

if (n % 2) == 0 and n != 0:
    print(f'O numero {n} é par')
elif n == 0:
    print('O valor é zero')
else:
    print(f'O numero {n} é impar')
