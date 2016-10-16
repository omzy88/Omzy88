inp = input("Enter number sequence: ")

len = len(inp)
sum = 0


if len % 2 == 0:
    for i in range(0,len):
        if i%2 == 0:
            temp2 = int(inp[i])
            temp3 = int(inp[i+1])
            sum +=  temp2 * temp3
elif len % 2 != 0:
    temp1 = len - 1
    for i in range(0,temp1):
        if i%2 == 0:
            temp2 = int(inp[i])
            temp3 = int(inp[i+1])
            sum +=  temp2 * temp3
    sum += int(inp[temp1])


print(sum)


    
        


                  
