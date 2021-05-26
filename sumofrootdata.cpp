//Author- SAJAL AGRAWAL
//sajal.agrawal1997@gmail.com

#include <bits/stdc++.h>
using namespace std;
struct Node
{
	int data;
	struct Node *left;
	struct Node *right;
	
	Node(int x){
	    data = x;
	    left = NULL;
	    right = NULL;
	}
};

Node *insert(Node *r,int num);
int sumOfLeafNodes(Node *r);
void preOrderDisplay(Node *r);
void inOrderDisplay(Node *r);
void postOrderDisplay(Node *r);
int search(Node *r, int num);

int main(void) {
    int t,n,data;
    scanf("%d",&t);
    while(t--){
        Node *root=NULL;
        scanf("%d",&n);
        //printf("n=%d\n",n);
        while(n--){
            scanf("%d",&data);
            //printf("data=%d\n",data);
            root=insert(root,data);
        }
        //inOrderDisplay(root);
        printf("%d\n",sumOfLeafNodes(root));
    }
	return 0;
}

Node *insert(Node *r,int num){
    if(r==NULL){
        r = new Node(num);
    }else{
        if(num<r->data){
            r->left=insert(r->left,num);
        }else{
            r->right=insert(r->right,num);
        }
    }
    return r;
}

void preOrderDisplay(Node *r){
    if(r!=NULL){
        printf("%d ",r->data);
        preOrderDisplay(r->left);
        preOrderDisplay(r->right);
    }
}

void inOrderDisplay(Node *r){
    if(r!=NULL){
        inOrderDisplay(r->left);
        printf("%d ",r->data);
        inOrderDisplay(r->right);
    }
}

void postOrderDisplay(Node *r){
    if(r!=NULL){
        postOrderDisplay(r->left);
        postOrderDisplay(r->right);
        printf("%d ",r->data);
    }
}

int search(Node *r,int num){
    if(r==NULL)return 0;
    else if(r->data==num)return 0;
    else if(r->data > num)
        search(r->left,num);
    else 
        search(r->right,num);
}// } Driver Code Ends


/* The structure of Node
struct Node{
    int data;
    Node *left,*right;
}; */


/*You are required to complete below method */
int sumOfLeafNodes(Node *r ){
     /*Your code here */
     if(r==NULL){
         return 0;
     }
     queue<Node *> q;
     q.push(r);
     q.push(NULL);
     int prev;
     while(!q.empty()){
         if(q.front()!=NULL){
            prev=0;
         while(q.front()!=NULL){
            Node *temp=q.front();
             prev=prev+temp->data;
             //cout<<"prev"<<prev<<endl;
             if(temp->left){
                   q.push(temp->left);
               }
               if(temp->right){
                   q.push(temp->right);
               }
             q.pop();
         }
         //cout<<prev<<endl;
         q.push(NULL);
         }
         q.pop();
     }
     return prev;
}