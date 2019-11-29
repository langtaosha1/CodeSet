while True:
    num = input('请输入一个4位正整数：')
    num = int(num)
    if 1000 <= num <= 9999:
        break
a = [0] * 4
a[0] = num // 1000
a[1] = (num // 100) % 10
a[2] = (num // 10) % 10
a[3] = num % 10
for j in (0, 1):
    temp = a[j]
    a[j] = a[3 - j]
    a[3 - j] = temp
print('加密后的数字为：')
for i in range(0, 4):
    print(a[j])
