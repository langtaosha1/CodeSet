m=input("请输入一个三位数：")
n=int(m)
if(n >= 100 and n <= 999):
    n1 = int(n / 100)
    n2 = int((n - n1 * 100) / 10)
    n3 = int(n - ((n1 * 100) + n2 * 10))
    Sum = n1 + n2 + n3
    print ('%s'%n,"各位数字之和为:%s" %Sum)
else:
    print("您输入的不是3位数！")