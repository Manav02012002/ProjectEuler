for i in range(334,500):
    for j in range(1, int((1000-i)/2)):
        k = (1000-i)-j
        if j**2 + k**2 == i**2:
            print(i*j*k)
