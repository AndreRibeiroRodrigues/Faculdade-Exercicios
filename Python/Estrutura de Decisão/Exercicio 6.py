carga = int (input('Digite o peso: '))
código = int(input('Digite o código'))

kilo = carga * 1000
print(kilo)
if código >= 10 or código <= 20:
    preço = 100 * kilo
    print(f'O preço da carga de {kilo} é de {preço}')
elif código >=21 or código <=30:
    preço = 250 * kilo
    print(f'o preço da carga de {kilo} é R${preço}')
elif código >=31 or código <= 40:
    preço = 330 * kilo
    print(f'O preço da carga de {kilo} é de {preço}')