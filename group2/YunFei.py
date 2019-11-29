m=int(input('请输入:'))
if m<0:
    print("输入不合法")
else:
    if m<20:
        print(m*0.35)
    if m>=20 and m<=100:
        price=m*0.35+(m-20)*0.5
        print(price)
    else:
        price = m * 0.35 + (m - 20) * 0.5 + (m - 100) * 0.8
        print(price)


