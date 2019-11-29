

def abc():
    print("请输入3个数：")
    a = input()
    b = input()
    c = input()
    if(a < b):
        t = a
        a = b
        b = t
    if(a < c):
        t = a
        a = c
        c = t
    if(b < c):
        t = b
        b = c
        c = t
    print("从小到大的顺序输出：")
    print(a + " "+ b + " " + c)