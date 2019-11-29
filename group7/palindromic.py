try:
    str = input('输入任意5位数:')
    if len(str) > 5:
        print('输入数字长度错误！')
    else:
        if str[0] == str[4] and str[1] == str[3]:
            print('这是一个回文数！')
        else:
            print('这不是一个回文数，请重新输入!')
except ValueError:
    print('输入类型错误，请重新输入！')
