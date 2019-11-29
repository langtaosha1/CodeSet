for Man in range(9):
    for Woman in range(12):
        if(Man * 4 + Woman * 3 + (36 - Man - Woman) / 2 == 36):
            print("Man:%s" %Man , "Woman:%s" %Woman, " Childen:%s" % (36 - Man - Woman))
