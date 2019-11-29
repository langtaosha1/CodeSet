# coding:utf-8
import numpy as np
s = int(input('请输入一个整数n：'))
a = np.zeros(s)
a[0] = 0
a[1] = 1
print (a[0])
print (a[1])
if s < 2:
    print ('请输入大于2的整数！')
else:
    for i in range(2, s):
        a[i] = a[i-1] + a[i-2]
        print (a[i])
