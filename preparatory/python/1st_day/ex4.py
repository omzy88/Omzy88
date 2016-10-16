import math

input_a = input("a = how much? ")
input_b = input("b = how much? ")
input_c = input("c = how much? ")

a = float(input_a)
b = float(input_b)
c = float(input_c)

total = b ** 2 - 4 * a * c

if total > 0:
    sum = math.sqrt(b ** 2 - 4 * a * c)
    x_1 = (-b + sum) / (2 * a)
    x_2 = (-b - sum) / (2 * a)
    print ("the roots are: ", x_1, "and ", x_2)
elif total == 0:
    x = (-b) / (2 * a)
else:
    print("roots do not exist for this quadratic equation")


        
