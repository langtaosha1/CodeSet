a = 4.0

PI = float(0)
b = -1
count = 0
for i in range (10000):
    b += 2
    PI = PI + float(a / b)
    b += 2
    PI = PI - float(a / b)
    if (PI >= 3.1415927 or PI <= 3.1415926):
        break
print(i)

