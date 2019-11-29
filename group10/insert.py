from __future__ import print_function
a = [1, 2, 6, 14, 25, 36, 37, 55]
b = [0] * (len(a) + 1)
t1 = 0
t2 = 0
i = 0
s = input("请输入一个整数：")
num = int(s)
if num >= a[len(a)-1]:
    b[len(b)-1] = num
    for i in range(0, len(a)):
        b[i] = a[i]
else:
    for i in range(0, len(a)):
        if num >= a[i]:
            b[i] = a[i]
        else:
            b[i] = num
            break

    for j in range(i+1, len(b)):
        b[j] = a[j-1]

for i in range(0, len(b)):
    print(str(b[i]) + " ", end="")
