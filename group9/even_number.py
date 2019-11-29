number = input('请输入一个偶数：')
number =int(number)
count = 0
tmp = number
while tmp%2 == 0:
    tmp = tmp/2
    count = count + 1
print('数字%d'%number+'被2整除个数为%d' % count)
