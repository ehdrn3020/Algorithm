count = int(input())

while count > 0:
    total = int(input())
    number = input()
    number = number.split()
    sum = 0
    for i in range(0, len(number)):
        sum = int(number[i]) + sum

    if sum>total :
        print("NO")
    else :
        print("YES")
    count = count - 1
