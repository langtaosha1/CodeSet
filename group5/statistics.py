digital = 0
character = 0
other = 0
blank = 0
i=input()

for ch in i:
    if (ch >= '0' and ch <= '9'):
        digital +=1
    elif ((ch >= 'a' and ch <= 'z') or (ch > 'A' and ch <= 'Z')):
        character +=1
    elif (ch == ' '):
        blank +=1
    else:
        other +=1
print('数字个数:'+str(digital))
print('英文字母个数:'+str(character))
print('空格个数: '+str(blank))
print('其他字符个数:'+str(other))