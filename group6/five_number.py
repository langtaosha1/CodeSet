s = input("请输入一个正整数：")
ss = str(s)
ch = list(ss)
j = len(ch)
print(s + "是一个" + str(j) + "位数。")
print("按逆序输出是：")
for i in range(j-1, -1, -1):
    print(ch[i], end='')