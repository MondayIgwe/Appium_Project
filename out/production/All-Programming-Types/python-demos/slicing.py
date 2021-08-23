list1 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
# --  [start:end:step]
print(list1[0:len(list1)])

print(list1[:])
print("Reverse: ", list1[::-1])
print("Reverse: ", list1[::-2])
print(list1[::2])
print(list1[::])
print(list1[1::])
print(list1[1:-1:])
print(list1[-1:-1:])

list = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
print("=========")
print(list[:7])
list.append(11)
list.insert(5, 500)
print(list)

union = list + list1
print(union)
print("=============")

for x in sorted(list1):
    list.append(list1)
    print("Appending:", list)
    print("Sorted:c", x)
    print(10 not in list1)
