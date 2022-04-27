x =1
y=1
z = 0
r = 0
while z < 4000000:
   z = (x+y)         
   if z%2 == 0:
       r = r + z
   x = y
   y = z

print(r)