inp = [0,0,0,0,0]

for i in range(0,5):
    inp[i] = input("Enter row: ")


'''
S = Enter Gate
G = Leave Gate
X = block
_ = emply cell
M = cell we already been in
'''


for i in range(0,5):
    for x in range(0,5):
        if inp[i][x] == "S":
            vert0 = i
            hor0 =  x
            S = str(i)+":"+str(x)
            list1 = [S]


#in (i:x) i = vertical numbering and x = horizontal numbering

def search(i,x):
    if inp[i][x]== "G":
        temp = str(i)+":"+str(x)
        list1.append(temp)
        return True
    elif inp[i][x]== "X":
        return False
    elif inp[i][x]== "M":
        return False
    else:
        inp[i][x] = "M"
        temp1 = str(i)+":"+str(x)
        list1.append(temp1)
        
        if((i<4 and search(i+1,x))
            or (x>0 and search(i,x+1))
            or (i>0 and search(i-1,x))
            or (x<4 and search(i,x+1))):
                print(list1)
#not found yet a way to not get into the list the unecesairy cells
                return True
        else:
            return False

search(vert0,hor0)

#it has some errors. didn t have the time to fix
