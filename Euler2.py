x=0
y=1
a=0
while y<= 4000000:
    if(y%2==0):
        a+=y
    x,y = y,x+y
print(a)