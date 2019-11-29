s = 1
sum_ = 4
for i in range(1, 9):
    if i == 1:
        s = 4
    elif i == 2:
        s = 4 * 7
    if i > 2:
        s *= 8
    sum_ += s

    print("%d位数的奇数个数为%d"% (i, s))

print('总和为：sum=%d' % sum_)
