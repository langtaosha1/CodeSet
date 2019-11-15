arr = []
    for i in range(10):
        aa = int(input("请输入一个数："))
        arr.append(aa)
    for i in range(10):
        for j in range(i+1, len(arr)):
            if arr[i] > arr[j]:
                temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
    print(arr)