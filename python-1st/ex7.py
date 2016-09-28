input_num = input("Enter number of pronic numbers: ")
num = int(input_num) + 1
sum = 0

for i in range (1,num):
    sum = (i * (i + 1))
    print(int(sum), end = ",")



