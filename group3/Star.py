roww=input("请输入：")
rows=int(roww)
row=1
while row<=rows:
    col=1
    while col<=row:
        print('★',end='')
        col+=1
    print()
    row+=1