H = 7
W = 7
for i in range((H+1)//2):
    for j in range(W//2-i):
        print(" ", end="")
    for k in range(1, (i+1)*2):
        print('*', end="")
    print()
for i in range(1, H//2):
    for j in range(1, i+1):
        print(" ", end="")
    for k in range(1, W-2*i+1):
        print('*', end="")
    print()
