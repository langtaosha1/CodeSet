m=0
j=0
for i in range(4,10000,4):
    count = 0
    m = i
    for k in range(0,5):
        j = i / 4 * 5 + 1
        i = j
        if (j % 4 == 0):
            count+=1
        else:
            break
    i= m
    if (count == 4):
        print("原有桃子 {} 个".format(j))
        break