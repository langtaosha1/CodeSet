temp = 1
    imput1, input2 = eval(input('please input two number:'))
    multiple = imput1 * input2
    if input2 > imput1:
        temp = input2
        input2 = imput1
        imput1 = temp
    while(temp != 0):
        temp = imput1 % input2
        imput1 = input2
        input2 = temp
    multiple = multiple / imput1
    print("Greatest common divisor is: %s" % imput1, end="\n")
    print("Minimum common multiple is: %s" % multiple,end="\n")