bin = input("Enter binary number (8 digits): ")

sum = 0

for i in range(0,7):
    dig = int(bin[i])
    if dig == 1:
        sum += 1

dig8 = int(bin[7])

if dig8 == 0:
    if sum % 2 == 0:
        print("Parity check OK.")
    else:
        print("Parity check not OK.")
else:
    if sum % 2 == 0:
        print("Parity check not OK.")
    else:
        print("Parity check OK.")



                  
