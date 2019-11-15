    for i in range(100, 1000):
        t = int(i/100)
        m = int((i-t*100)/10)
        n = int(i-t*100-m*10)
        su = t**3 + m**3 + n**3
        if su == i:
            print(su, end=" ")