import java.util.*;

class Node
{
    int data;
    Node left;
    Node right;
}
class tree
{
    public static Node insert(Node root,int data)
    {
        if(root == null)
        {
            root = new Node();
            root.data = data;
        }
        else if(root.data > data)
        {
            root.left = insert(root.left,data);
        }
        else
        {
            root.right = insert(root.right,data);
        }
        return root;
    }
    public static boolean search(Node root,int key)
    {
        if(root==null)
        {
            return false ;
        }
        else if(root.data == key)
        {
            inordertraversal(root);
            return true;
        }
        else if(root.data > key)
        {
            return search(root.left,key); 
        }
        else
        {
            return search(root.right,key);
        }
    }
    public static void inordertraversal(Node root)
    {
        if(root == null)
            return;
        inordertraversal(root.left);
        System.out.print(root.data+" ");
        inordertraversal(root.right);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Node root = new Node();
        int el = sc.nextInt();
        while(el!= -1)
        {
            root = insert(root,el);
            el = sc.nextInt();
        }
        
        int key = sc.nextInt();
        //1
        if(!search(root,key))
            System.out.println("Not Found");
        
    }
    
}