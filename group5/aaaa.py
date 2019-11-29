# -*- coding:utf-8 -*-
b=0
sum=0
a=int(input('输入数字a的值：'))
n=int(input('输入相加的项数：'))
i=0
while i<n:
    b+=a
    sum+=b
    a*=10
    i+=1
print(sum)