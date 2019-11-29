count=0
for x in range(1,5,1):
    for y in range(1,5,1):
       for z in range(1,5,1):
        if(x != y and y != z and x != z):
            count =count+1
print('共有'+str(count)+'个三位数')