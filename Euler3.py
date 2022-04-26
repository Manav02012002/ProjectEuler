from re import I


n = 13195
c = 2
while c*c < n:
    while n%c==0:
        n=n/c
    c+=1
print(n)