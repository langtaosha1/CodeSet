print("请输入一个7位以上的正整数：")
a =input()
j=len(a)
print(j)
if (j<7):
    print("输入错误！")
else:
    print("截取从右端开始的4～7位是：{} {} {} {}".format(a[j-7],a[j-6],a[j-5],a[j-4]))
