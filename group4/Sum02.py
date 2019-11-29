# coding:utf-8
s = input('请输入一个int类型的整数：')
t = int(s)
sum = 0
while t != 0:
    sum += t % 10
    t = t / 10
print('各位数字的和：%d' % sum)

