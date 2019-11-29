x = 2
y = 1
sum = 0
for i in range(1, 20+1):
    print(x, y)
    sum = sum + x / y
    t = y
    y = x
    x = y + t

print("前20项相加之和是： " + str(sum))
