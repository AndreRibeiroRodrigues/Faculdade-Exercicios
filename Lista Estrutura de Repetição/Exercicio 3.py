c = 1
soma = 0
count = 0

while c >= 0:
    c = int(input('digite um numero: '))
    soma += c
    count += 1

print(soma - (-1))
print(count - 1)
media = soma - (-1)%count - 1
if c == -1:
    print(media)