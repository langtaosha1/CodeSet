
num = int(input("请输入人数n(n>0):"))
L = list(range(1, num + 1))


def reserve(L, num):
    if num == 1 or num == 2:
        return L[num - 1]
    else:
        index = num % 3
        m = num // 3
        for i in range(m, 0, -1):
            L.remove(L[3 * i - 1])
            LN = L[-index:] + L[:-index]
        return reserve(LN, num - m)

re = reserve(L, num)
print("最后留下来的是原来第{"
      "}号的那位".format(re))