
def Display(iNo1,iNo2):

    if iNo1 == 0 or iNo2 == 0:
        if iNo1 == iNo2:
            print("Unable to Print Pattern, Both Values are Zero")
        elif iNo1 == 0:
            print("Unable to Print Pattern, Rows Count is Zero")
        elif iNo2 == 0:
            print("Unable to Print Pattern, Columns Count is Zero")    
    else:
        if iNo1 < 0:
            iNo1 = -iNo1
    
        if iNo2 < 0:
            iNo2 = -iNo2

        iCnt = 1   

        for x in range(iNo1):
            for y in range(iNo2):
                if iCnt > 9:
                    iCnt = 1
                print(iCnt,end="\t")  
                iCnt +=1
            print()

def main():

    print("Enter Count of Rows and Columns")
    iValue1 = int(input())
    iValue2 = int(input())

    Display(iValue1,iValue2)

if __name__ == "__main__":
    main()