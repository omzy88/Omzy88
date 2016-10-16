tin = input("What's your Tax Identification Number? (9 digits): ")

sum = 0

for i in range(0,8):
    dig = int(tin[7-i]) * (2**(i+1))
    sum += dig

tot = sum % 11
tin2 = int(tin[8])
tax = tin2 % 10

if tot == tax:
    print("Tax Identification Number valid.")
else:
    print("Tax Identification Number not valid.")


                  
