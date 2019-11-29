n=input('请输入一个成绩：')
m=int(n)
if m>=90:
    grade='A'
else:
    if m<=89 and m>=60:
        grade='B'
    else:
        grade='C'
print('等级为：',grade)