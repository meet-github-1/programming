n=int(input())
l=[int(i) for i in input().split()]
mx=max(l);mn=min(l)
l.remove(mx);l.remove(mn)
mx=-9999;mn=99999
for num in l:
    if(num>mx):
        mx=num
    if(num<mn):
        mn=num
print(mx,mn)