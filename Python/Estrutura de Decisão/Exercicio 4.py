nome = str(input('Digite o nome do funcionario: '))
salario = float(input('Digite o salario do funcionario: '))
cargo = int(input('Código do Cargo: '))


if cargo == 101:
    gerente = salario * 0.10
    gs = gerente + salario
    print(f'O funcionario {nome} receberá um aumento de {gerente} e o seu novo salario será {gs}')
elif cargo == 102:
    engenheiro = salario * 0.20
    es = salario + engenheiro
    print(f'O funcionario {nome} receberá um aumento de {engenheiro} e o seu novo salario será {es}')
elif cargo == 103:
    técnico = salario * 0.30
    ts = salario + técnico
    print(f'O funcionario {nome} receberá um aumento de {técnico} e o seu novo salario será {ts}')
else:
    seila = salario * 0.05
    ss = salario + seila
    print(f'o funcionario {nome} receberá um almento de {seila} e o seu novo salario será {ss} ')
