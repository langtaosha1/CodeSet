from __future__ import print_function
import numpy as np

a = np.zeros((10, 10))
for i in range(0, 10):
    a[i][i] = 1
    a[i][0] = 1

for i in range(2, 10):
    for j in range(1, i):
        a[i][j] = a[i-1][j-1] + a[i-1][j]

for i in range(0, 10):
    for k in range(0, 2*(10-i)-1):
        print(" ", end="")
    for j in range(0, i+1):
        print(str(a[i][j]) + " ", end="")
    print()
