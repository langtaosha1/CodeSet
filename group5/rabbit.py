print('第1个月的兔子对数：1')
print('第2个月的兔子对数：1')
f1=1
f2=1
M=24
for i in range(3,M+1,1):
    f=f2
    f2=f1+f2
    f1=f
    print('第'+str(i)+'个月的兔子对数'+str(f2))