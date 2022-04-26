def palin(x):
    return str(x) == str(x)[::-1]

max = 0
for i in range(100,999):
    for j in range(i+1,1000):
        p = i*j
        if palin(p) and p > max:
            max = p
print(max)