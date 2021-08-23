ls = ["id", "unisa", 1, 2.3, -9, True, None]
k = ls[:]
print("Before", k)
del k[1]
print("After", k)
print(ls[-1:-1])
print(ls[::-1])


def loop(num):
    for i in range(num):
        yield i
        print("test")


print(loop(3))
