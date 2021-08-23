x = 0

while x < 10:
    if x > 5:
        print("If statement: ", x)
        break
    else:
        x +=11
        print(f"Else statement: {x}")
else:
    print("Completed While")
