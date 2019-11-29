def week():
    print("请输入星期的第一个大写字母：")
    ch = getchar()
    if(ch == 'M'):
        print("Monday")
    elif(ch == 'W'):
        print("Wednesday")
    elif(ch == 'F'):
        print("Friday")
    elif(ch == 'T'):
        print("请输入星期的第二个字母：")
        ch2 = getchar()
        if(ch2 == 'U'):
            print("Tuesday")
        elif(ch2 == 'H'):
            print("Thursday")
        else:
            print("无此写法！")
    elif(ch == 'S'):
        print("请输入星期的第二个字母：")
        ch2 = getchar()
        if(ch2 == "U"):
            print("Sunday：")
        elif(ch2 == 'A'):
            print("Saturday")
        else:
            print("无此写法！")
    else:
        print("无此写法！")

def getchar():
    ch = input()
    if(ch < 'A' | ch > 'Z'):
        print("输入错误，请重新输入")
    return ch