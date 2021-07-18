public class BinarysearchTree
{
	 public static class Node
	 {
	 	 int data;
	 	 Node left;
	 	 Node right;	

	 	 Node(int data , Node left , Node right)
	 	 {
	 	 	 this.data = data;
	 	 	 this.left = left;
	 	 	 this.right = right;
	 	 }

	 	 Node(int data)
	 	 {
	 	 	this(data , null , null);
	 	 }
	 }
	 public static int size(Node node)
	 {
	 	if(node == null)
	 	{
	 		return 0;
	 	}
	 	int leftsize = size(node.left);
	 	int rightsize = size(node.right);

	 	return leftsize + rightsize + 1;
	 }
	 public static int hight(Node node)
	 {
	 	 if(node == null)
	 	 {
	 	 	 return -1;
	 	 }

	 	 int lefthight = hight(node.left);
	 	 int righthight = hight(node.right);

	 	 int res = Math.max(lefthight , righthight);
	 	 return res;

	 	 //return node == null ? -1 : Math.max(hight(node.left), hight(node.right)) + 1;
	 }
	 public static int maximum(Node node)
	 {
	 	 
	 	 while(node.right != null)
	 	 {
	 	 	 node = node.right;
	 	 }

	 	 return node.data;

	 }
	  public static int minmum(Node node)
	 {
	 	 
	 	 while(node.left != null)
	 	 {
	 	 	 node = node.left;
	 	 }

	 	 return node.data;

	 }
	 public static boolean find(Node node , int data)
	 {
	 	  while(node != null)
	 	  {
	 	  	  if(node.data == data)
	 	  	  {
	 	  	  	  return true;
	 	  	  }
	 	  	  else if(node.data < data)
	 	  	  {
	 	  	  	  node = node.right;
	 	  	  }
	 	  	  else
	 	  	  {
	 	  	  	  node = node.left;
	 	  	  }
	 	  }

	 	return false;
	 }
	 public static int sum(Node node)
	 {
	 	 if(node == null)
	 	 {
	 	 	 return 0;
	 	 }

	 	 int leftsum = sum(node.left);
	 	 int rightsum = sum(node.right);

	 	 return leftsum + rightsum + node.data;
	 }
	 public static ArrayList<Node> nodetorootpath(Node node , int data)
	 {
	 	  ArrayList<Node> list = new ArrayList<>();
	 	  boolean flag = false;

	 	  while(node != null)
	 	  {
	 	  	  list.add(node);
	 	  	  if(node.data == data)
	 	  	  {
	 	  	  	  flag = true;
	 	  	  	  break;
	 	  	  }
	 	  	  else if(node.data < data)
	 	  	  {
	 	  	  	 node = node.right;
	 	  	  }
	 	  	  else
	 	  	  {
	 	  	  	 node = node.left;
	 	  	  }
	 	  }

	 	  if(!flag)
	 	  {
	 	  	 list.clear();
	 	  }

	 	  Collection.reverse(list);
	 	  return list;
	 } 
	 public static int lca(Node node , int d1 , int d2)
	 {
	 	 int lowestca = -1;
	 	 while(node != null)
	 	 {
	 	 	 if(node.data < d1 && node.data < d2)
	 	 	 {
	 	 	 	 node = node.right;
	 	 	 }
	 	 	 else if(node.data > d1 && node.data > d2)
	 	 	 {
	 	 	 	 node = node.left;
	 	 	 }
	 	 	 else
	 	 	 {
	 	 	 	 lowestca = node.data;
	 	 	 	 break;
	 	 	 }
	 	 }
	 	 return lowestca;
	 }
	 public static void printinrrange(Node node , int lr , int rr)
	 {
	 	  if(node == null)
	 	  {
	 	  	  return;
	 	  }

	 	  printinrrange(node.left , lr , rr);
	 	  if(node.data >= lr && node.data <= rr)
	 	  {
	 	  	 System.out.println(node.data);
	 	  }
	 	  printinrrange(node.right , lr , rr);
	 }
	 public static Node add(Node node , int data)
	 {
	 	  if(node == null)
	 	  {
	 	  	  return new Node(data , null , null);
	 	  }

	 	  if(node.data < data)
	 	  {
	 	  	  node.right = add(node.right , data);
	 	  }
	 	  else if(node.data > data)
	 	  {

	 	  	 node.left = add(node.left , data);
	 	  }
	 	  return node;
	 }
	 public static Node removenode(Node node , int data)
	 {
	 	  if(node == null)
	 	  {
	 	  	 return null;
	 	  }
	 	  if(node.data < data)
	 	  {
	 	  	  node.right = removenode(node.right , data);
	 	  }
	 	  else if(node.data > data)
	 	  {
	 	  	  node.left = removenode(node.left , data);
	 	  }
	 	  else
	 	  {
	 	  	   if(node.left == null || node.right == null)
	 	  	   {
	 	  	   	  return node.left != null ? node.left : node.right;
	 	  	   }

	 	  	   int minele = minmum(node.right);
	 	  	   node.data = minele;

	 	  	   node.right = removenode(node.right , minele);
	 	  }

	 	  return node;
	 }
	 public static void modify(Node node , int[] arr)
	 {
	 	 if(node == null)
	 	 {
	 	 	return;
	 	 }

	 	 modify(node.right , arr);
	 	  node.data += arr[0];
	 	  a[0] = root.data;
	 	 modify(node.left , arr);
	 }
	 public Node modify(Node node)
	 {
	 	 int[] arr = new int[1];
	 	 modify(node , arr);
	 	 return node;
	 }

}                                       