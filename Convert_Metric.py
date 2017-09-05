##Convert_Metric python code

list_re = ['kg', 'lb', 'l', 'g']
cal = [2.2046, 0.4536, 0.2642, 3.7854]
cal_re = ['lb', 'kg', 'g', 'l']

k = 0
count = float(input())

while count > 0:
    k = k + 1
    count = count - 1
    number = input()
    number = number.split()

    for i in range(0, len(cal)):
        if number[1] == list_re[i]:
            result = float(number[0]) * cal[i]
            print(k, '%.4f'%result, cal_re[i])

