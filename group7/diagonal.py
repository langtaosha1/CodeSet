import numpy as np
a =np.zeros((3,3))
print('请输入9个整数：')
for i in range(3):
    for j in range(3):
        a[i][j]=(float(input()))

sum = 0
for i in range(3):
    for j in range(3):
        if(i==j):
            sum += a[i][j]
print('对角线之和：',sum)