num = int(input("请输入要分解的正整数："))
    k=2
    while k<=num:
        if k==num:
            print(num)
            break
        elif num % k==0:
            print(k,end=' ')
            num = int(num/k)
        else:
            k+=1