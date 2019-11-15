    for i in range(1, 1000):
        sum = 0
        for j in range(1, int(i/2)+1):
            if i%j == 0:
                sum += j
                if i==sum:
                    print(i,end=' ')