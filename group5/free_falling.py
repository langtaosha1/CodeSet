h=100
s=100
for i in range(1,10,1):
    s+=h
    h=h/2
print('经过路程：'+str(s))
print('反弹高度：'+str(h/2))