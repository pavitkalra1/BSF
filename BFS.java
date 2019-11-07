import java.util.*;

class Node
{
   int data;
   Node left,right;
         public Node(int a)
        {
         data=a;
         left=right=null;
         }
}
class BFS
{
      void printFunc()
      {

       }     
      void depthFunc(Node root,int d)
    { 
        if(root==null)
           return;
          if(d==1)
          System.out.println(root.data);
         else if(d > 1)
          {
             printFunc(root.left,d-1);
             printFunc(root.right,d-1);
           }
   
     }

      public static void main(String args[])
      {
        BFS tree=new BFS();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
         tree.root.right=new Node(3);
         tree.root.right.left=new Node(4);
         tree.root.right.right=new Node(5);

          tree.printFunc();
       }
  
}
