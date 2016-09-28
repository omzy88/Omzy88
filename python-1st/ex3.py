import math

input_a = input("a = how much? ")
input_b = input("b = how much? ")
input_c = input("c = how much? ")

a = float(input_a)
b = float(input_b)
c = float(input_c)

if ((a+b+c)*(-a+b+c)*(a-b+c)*(a+b-c)) >= 0:
    sum = math.sqrt((a+b+c)*(-a+b+c)*(a-b+c)*(a+b-c))
    area = 1/4*sum
    print(area)
else:
    print("the values you have put are wrong")
