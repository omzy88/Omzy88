dates = input("Enter dates: ")
list1 = dates.split(" ")

date1 = list1[0].split("/")
date2 = list1[1].split("/")

d1 = int(date1[0])
m1 = int(date1[1])
y1 = int(date1[2])
d2 = int(date2[0])
m2 = int(date2[1])
y2 = int(date2[2])

c1 = 365*y1 + (y1//4) - (y1//100) + (y1//400) + ((306*m1 + 5)//10) + (d1 - 1)
c2 = 365*y2 + (y2//4) - (y2//100) + (y2//400) + ((306*m2 + 5)//10) + (d2 - 1)
res = c2 - c1

if res < 0:
    res = res * (-1)

print(res)
    
        


                  
