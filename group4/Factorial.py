m=input("请输入一个10以内的数字：")
n=int(m)
sum=1
if (n <10 and n > 0):
    for i in range(1,n+1):
        sum *= i

    print('%s'%sum)

else:
    print("输入错误！")