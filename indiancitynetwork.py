import networkx as nx
import  matplotlib.pyplot as plt
import random
import sys
def create_network(city_set,costs,num_edges):
    G=nx.Graph()
    for each in city_set:
        G.add_node(each)
    while(G.number_of_edges()<num_edges):
        c1=random.choice(city_set)
        c2=random.choice(city_set)
        if(c1!=c2 and G.has_edge(c1,c2)==0):
            w=random.choice(costs)
            G.add_edge(c1,c2,weight=w)
    return G
def add_random_edge(G,costs,city_set):
        c1=random.choice(city_set)
        c2=random.choice(city_set)
        if(c1!=c2 and G.has_edge(c1,c2)==0):
            w=random.choice(costs)
            G.add_edge(c1,c2,weight=w)
    
'''
#nx.draw(G)
plt.show()
#pos=nx.circular_layout(G)
#print(nx.is_connected(G))
#nx.draw(G)
#nx.draw_networkx_edge_labels(G,pos)
#plt.show()
for u in city_set:
    for v in city_set:
        print(u,v,nx.has_path(G,u,v))'''
city_set=["Delhi","Banglore","Hyderabad","Ahmedabad","Chennai","Kolkata","Surat","Pune","Jaipur"]
costs=[]
value=100
while(value<=2000):
    costs.append(value)
    value=value+100
G1=create_network(city_set, costs,0)
try:
    print(nx.dijkstra_path(G1, "Delhi", "Kolkata"))
    print(nx.dijkstra_path_length(G1, "Delhi", "Kolkata"))
except:
    l=10000
x=[0]
y=[10000]
for t in range(1,18):
    add_random_edge(G1,costs,city_set)
    x.append(t)
    try:
        l=nx.dijkstra_path_length(G1,"Delhi","Banglore")
        y.append(l)
        break
    except:
        l=10000
        y.append(l)
plt.xlabel("Time")
plt.ylabel("Travelling Cost")
plt.title("changing travelling cost as more nodes are added")
plt.plot(x,y)
plt.show()   
#nx.draw(G1)
#plt.show()
