m = 0
    for i in range(100,200):
        for j in range(1,i+1):
            n = i%j
            if n == 0:
                m += 1
        if m == 2:
            print(i,end=" ")
        m = 0