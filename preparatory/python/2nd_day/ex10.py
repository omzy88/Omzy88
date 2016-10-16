inp = input("Enter limit: ")

temp = int(inp) + 1

for i in range(3,temp):
    n = 1
    while i >= (2**n):
        if i != (2**n):
            print(i, end=" ")
        n += 1    



        


                  
