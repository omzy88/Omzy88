inp1 = input("Enter limit: ")
inp1 = int(inp1)
temp1 = 0
k = 1
list1 = [0]
while k <= inp1:
    k = k*2
    list1.append(2**temp1)
    temp1 += 1
for i in range(0,inp1+1):
    if i not in list1:
        print(i,end=" ")
