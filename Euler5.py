a = [11,13,14,16,17,18,19,20]
def f(x):
    for i in range(x,999999999,x):
        if all(i%j==0 for j in a):
            return i
    return None

if __name__ == '__main__':
    ans = f(20)
    print(ans)