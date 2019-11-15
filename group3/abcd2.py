for Num in range(1000, 10000):
	a = int(Num / 1000)  # 千位
	b = int((Num - a * 1000) / 100)  # 百位
	c = int((Num - a * 1000 - b * 100)) / 10  # 十位
	d = int(Num - a * 1000 - b * 100 - c * 10)  # 个位

	ab = (a * 10 + b)
	cd = (c * 10 + d)
	abcd = (ab + cd) * (ab + cd)

	if abcd == Num:
		print(Num,end=" ")