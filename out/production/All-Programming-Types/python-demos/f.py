lst = [[x for x in range(3)] for y in range(3)]

print(lst)

for r in range(3):
    for c in range(3):
        if lst[r][c] % 2 != 0:
            print("#")
            print(2 // 5)


def c(a, b, c, f=10):
    global URL
    URL = "https://api"
    var = "inside a function"
    print(b, a, f, c, URL, var)


URL = "food is cool"
var = "outside function"
print(URL)
c(1, 2, 3, 5)
print(URL)
print(var)

l = ["id", True, 2, 3.2, None]
for elem in l:
    print(elem)

for i in range(len(l)):
    print(i)