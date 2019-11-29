i = 1
for n in range(0, 7):
    while True:
        num = input('请输入一个1--50之间的整数：')
        num = int(num)
        if num in range(1, 50):
            break
    for i in range(1, num + 1):
        print('*')
    print(' ')