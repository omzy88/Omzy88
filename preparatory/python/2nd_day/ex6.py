list1 = [0,0,0]
list2 = [0,0,0]
list3 = [0,0,0]
inp_dig = [list1,list2,list3]
for i in range(0,3):
    for x in range(0,3):
        if x == 0:
            inp_dig[x][i] = input("Enter a 1-digit number: ")
        elif x == 1:
            inp_dig[x][i] = input("Enter a 2-digit number: ")
        else:
            inp_dig[x][i] = input("Enter a 3-digit number: ")




print("  "+list1[0]+"|  "+list1[1]+"|  "+list1[2])
print(" "+list2[0]+"| "+list2[1]+"| "+list2[2])
print(list3[0]+"|"+list3[1]+"|"+list3[2])
    
    
        


                  
