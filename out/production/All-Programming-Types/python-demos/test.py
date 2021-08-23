print(1 // 2)
d = {}

d['1'] = (1, 2)
d['2'] = (2, 1)

for elem in d.keys():
    print(d[elem][1], end="")