n=int(input())
N=[]
for i in range(n):
     s=str(input())
     count=0
     for j in s:
     	if(j=='S'):
     		if(len(N)>0 and N[-1]==1):
     			N.pop()
     			count=count+1
     		else:
     			count=count+5
     			N.append(3)
     	elif(j=='W'):
     		if(len(N)>0 and N[-1]==4):
     			N.pop()
     			count=count+1
     		else:
     			count=count+5
     			N.append(0)
     	elif(j=='N'):
     		if(len(N)>0 and N[-1]==3):
     			N.pop()
     			count=count+1
     		else:
     			count=count+5
     			N.append(1)
     	elif(j=='E'):
     		if(len(N)>0 and N[-1]==0):
     			#print(count)
     			N.pop()
     			count=count+1
     		else:
     			print(N)
     			count=count+5
     			N.append(4)
     print(count)

