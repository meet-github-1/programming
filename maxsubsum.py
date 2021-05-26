import sys
def returnind(l):
	maxcurrent=l[0]
	maxglobal=l[0]
	for i in range(1,len(l)):
		maxcurrent=max(maxcurrent+l[i],l[i])
		if(maxcurrent>maxglobal):
			maxglobal=maxcurrent
	return maxglobal
if __name__=="__main__":
	l=list(map(int,input().split()))
	print(returnind(l))
	