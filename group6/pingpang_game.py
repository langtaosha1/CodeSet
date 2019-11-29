m = ['a', 'b', 'c']
n = ['x', 'y', 'z']
for i in range(len(m)):
    for j in range(len(n)):
        if (m[i] == 'a') & (n[j] == 'x'):
            continue
        elif (m[i] == 'a') & (n[j] == 'y'):
            continue
        elif ((m[i] == 'c') & (n[j] == 'x')) | ((m[i] == 'c') & (n[j] == 'z')):
            continue
        elif ((m[i] == 'b') & (n[j] == 'z')) | ((m[i] == 'b') & (n[j] == 'y')):
            continue
        else:
            print(m[i] + " vs " + n[j])