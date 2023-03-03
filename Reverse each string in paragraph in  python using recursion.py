In Paragraph reverse each string in python using recursion
def reverse(n):
    if len(n)==0:
        return " "
    else:
        k=n.split()
        reversed_firstword=k[0][::-1]
        restofn=(" ".join(k[1:]))
        reverse_restofn=reverse(restofn)
        return  reversed_firstword+" "+ reverse_restofn
n=input("enter the paragraph: ")
print(reverse(n))


