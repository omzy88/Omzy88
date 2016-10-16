inp_year = input("Enter year: ")

y = int(inp_year)

a = y % 4
b = y % 7
c = y % 19
d = (19*c + 15) % 30
e = (2*a + 4*b - d + 34) % 7

month = (d + e + 114) // 31
day = ((d + e + 114) % 31) + 1

day += 13
if day > 30:
    if month % 2 == 0 and day == 31:
        month += 1
        day = 1
    elif month % 2 == 0 and day > 31:
        month += 1
        day -= 30
    elif month % 2 == 1 and day > 31:
        month += 1
        day -= 31
        

print("Day: ", day , "Month: ", month)

    
    
        


                  
