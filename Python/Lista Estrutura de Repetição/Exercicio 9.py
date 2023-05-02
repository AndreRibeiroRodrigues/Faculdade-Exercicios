i = int(input("Digite o primeiro termo: "))
f = int(input("Digite o quantidade de termos que voce quer apresentar: "))
r = int(input("Digite a razão: "))
t = i + (f - 1) * r
for c in range(i,t + r, r):
    print(f"{i}/{c}", end="->")
print("ACABOU")