# coding:utf-8
s = input('请输入一个int类型的整数：')
n = int(s)
sum = 0
n1 = 0
while n != 0:
    sum += n % 2
    n = n / 2
print('%d的二进制位中共有%d位为1' % (n1, sum))