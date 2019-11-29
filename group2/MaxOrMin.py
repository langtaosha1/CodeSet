# /*
#  * 读入三个整数，输出这三个整数中最大的一个.
#  */
# 第二种方式:

import re
f=input('请输入三个数:')
h=re.split(',',f)
w1=h[0]
w2=h[1]
w3=h[2]

if (w1 >= w2 and w1 >= w3):
    print("最大整数：%s"%w1 )
elif (w2 >= w1 and w2 >=w3 ):
    print("最大整数：%s" %w2)
else:
    print("最大整数：%s"%w3)






#
# num1 = float(input('请输入第一个数：'))
# num2 = float(input('请输入第二个数：'))
# num3 = float(input('请输入第三个数：'))
# if num1 < num3 and num2 < num3:
#     big_num = num3
# elif num1 < num2 and num3 < num2:
#     big_num = num2
# else:
#     big_num = num1
# print('三个数中最大数为：%s' % big_num)
