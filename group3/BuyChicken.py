for i in range(1,34):
    for y in range(0,51):
        if(i * 3 + y * 2 + (100 - i- y)/3.0 == 100):
            print("公鸡：%s" % i,"母鸡：%s" %y,"小鸡：%s"%(100 - i- y) )
