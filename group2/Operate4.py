#  *5、完成一个简单的计算器程序。程序要求如下:
#   1)读入两个整数
#   2)提示用户选择对这两个整数的操作，即输出
#  　　1、+
# 　　 2、-
# 　　 3、*
# 　　 4、/
#   请输入您的选择:
#   读入用户的选择，输出运算结果。
a,b=input("请输入你要输入的两个数:").split(""" """)

c =int(input(" 1、+\n 2、-\n 3、*\n 4、/\n 请输入您的选择:"))

if 1< c <4:
    print("运算方式选择错误!")
else:
    if c == 1:
        print('{} + {} = {}'.format(a, b, int(a)+int(b)))
    if c == 2:
        print('{} - {} = {}'.format(a, b, int(a)-int(b)))
    if c == 3:
        print('{} *{} = {}'.format(a, b, int(a) * int(b)))
    if c == 4:
        print('{} / {} = {}'.format(a, b, int(a)/int(b)))