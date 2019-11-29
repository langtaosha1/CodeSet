# -*- coding:utf-8 -*-

list = []

print('输入十个整数：')
for i in range(10):
    print('输入第%d个整数：' % i,)
    a = input()
    list.append(a)
print (list)
for i in range(9):
    min_index = i
    for j in range(i + 1, 10):
        if list[j] < list[min_index]:
            list[min_index], list[j] = list[j], list[min_index]
    print (list)
