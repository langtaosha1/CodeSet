import numpy as np
a=np.zeros(20)
print("请输入多个正整数（输入-1表示结束）：")
i=1
a[0] = (int(input()))
while (a[i-1]!=-1):
    a[i] = (int(input()))
    i+=1
print("\n数组逆序输出为：")
for j in range(i-2,-1,-1):
    print(a[j])