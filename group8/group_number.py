count =0
for x in range (1,5):
    for y in range(1,5):
        for z in range(1,5):
            if (x!=y and y!=z and x!=z):
                count +=1
                print(x*100+y*10+z)
print('共有',count,'个三位数')