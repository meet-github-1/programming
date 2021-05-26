import operator
d={0:1,1:5,2:3,3:4,4:5}
d1=dict(sorted(d.items(),key=operator.itemgetter(1)))
d2=dict(sorted(d.items(),key=operator.itemgetter(0)))
print(d1)
print(d2)
