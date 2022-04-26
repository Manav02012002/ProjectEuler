ss = 0
sn = 0
for i in range(1,101):
    ss+=i**2
    sn+=i

sqs = sn**2
print(sqs-ss)