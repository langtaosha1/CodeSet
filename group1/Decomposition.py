num = int(input("������Ҫ�ֽ����������"))
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