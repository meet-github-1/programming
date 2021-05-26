# cook your dish here
n=int(input())
l=list(map(int,input().split()))
ln=len(l)
l1=[]
def checktriangle(n,r,z):
	if(n+r>z or n+z>r or r+z>n):
		return True
	return False

for i in range(0,ln-2):
	for j in range(i+1,ln-1):
		for k in range(j+1,ln):
			if(checktriangele(l[i],l[j],l[k])):
				l1.append([l[i],l[j],l[k]])
if(len(l1)>=0):
	print("YES")
	print(*l1.sort()[-1])