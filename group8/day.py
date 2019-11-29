d = 0
while True:
    year = input('输入年：')
    year = int(year)
    month = input('输入月：')
    month = int(month)
    day = input('输入日：')
    day = int(day)
    e = 0
    i = 1
    if year < 0 or month < 0 or month > 12 or day < 0 or day > 31:
        e = 1
        print('输入错误，请重新输入！')
    if e == 0:
        break
if month == 1:
    print(year, '-', month, '-', day, '是这年的第', day, '天。')
else:
    for i in range(1, month):
        if i in (1, 3, 5, 7, 8, 10, 12):
            days = 31
        elif i in (4, 6, 9, 11):
            days = 30
        else:
            if year % 400 == 0 or (year % 4 == 0 and year % 100 != 0):
                days = 29
            else:
                days = 28
    d = d + days
    print(year, '-', month, '-', day, '是这年的第', (d + day), '天。')