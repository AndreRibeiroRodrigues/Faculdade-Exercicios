n = int(input('Digite o fim da contagem: '))

for c in range(0, n+1):
    if (c % 2) == 0:
        print(f'{c}', end=' ')
    else:
        print(f'{c}')