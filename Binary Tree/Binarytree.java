public class Binarytree
{
	public static class Node{
	 	int data;
	 	Node left;
	 	Node right;

	 	Node(int data, Node left, Node right)
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

	public static void preorder(Node root , ArrayList<Integer> ans)
	{
		if(root == null)
		{
			return;
		}

		ans.add(root.data);
		preorder(root.left , ans);
		preorder(root.rigth , ans);
	}
	public static void Inorder(Node root , ArrayList<Integer> ans)
	{
		if(root == null)
		{
			return;
		}
		Inorder(root.left , ans);
		ans.add(root.data);
		Inorder(root.rigth , ans);
	}
	public static void postorder(Node root , ArrayList<Integer> ans)
	{
		if(root == null)
		{
			return;
		}
		postorder(root.left , ans);
		postorder(root.right , ans);
		ans.add(root.data);
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
	public static int Sum(Node node)
	{
		if(node == null)
		{
			return 0;
		}
		int leftSum = Sum(node.left);
		int rightSum = Sum(node.right);

		return leftSum + rightSum + node.data;
	}
	public static int max(Node node)
	{
		if(node == null)
		{
			return -(int)1e9;
		}

		int leftmax = max(node.left);
		int rightmax = max(node.right);

		return Math.max(Math.max(leftmax , rightmax) , node.data);
	}
	public static int min(Node node)
	{
		if(node == null)
		{
			return (int)1e9;
		}

		int leftmin = min(node.left);
		int rightmin = min(node.right);

		return Math.min(Math.min(leftMin, rightMin), node.data);
	}
	 // Height in Terms of Edges return -1 at null, Height in terms of Nodes return 0
    // at null
    public static int height(Node node) {
        return node == null ? -1 : Math.max(height(node.left), height(node.right)) + 1;
    }
    public static int countLeaves(Node node)
    {
    	if(node == null)
    	{
    		return 0;
    	}
    	if(node.left == null && node.right == null)
    	{
    		return 1;
    	}

    	return countLeaves(node.left) + countLeaves(node.right);
    }
    // Print the nodes having exactly one child in a Binary tree
    public static void exactlyonechile(Node node , ArrayList<Integer> ans)
    {
    	if(node == null ||(node.left == null && node.right == null))
    	{
    		return;
    	}
    	if(node.left == null || node.right == null)
    	{
    		 ans.add(node.data);
    	}

    	exactlyonechile(node.left , ans);
    	exactlyonechile(node.right , ans);
    }
    public static int countexactlyonechild(Node node)
    {
    	if(node == null ||(node.left == null && node.right == null))
    	{
    		return 0;
    	}

    	int left = countexactlyonechild(node.left);
    	int right = countexactlyonechild(node.right);

    	int sum = left + right;
    	if(node.left == null || node.right == null)
    	{
    		 sum += 1;
    	}

    	return sum;
    }
    public static boolean finddata(Node node , int data)
    {
    	 if(node == null)
    	 {
    	 	 return false;
    	 }

    	 if(node.data == data)
    	 {
    	 	return true;
    	 }

    	 return finddata(node.left , data) || finddata(node.right , data)
    	 
    }
    public static boolean nodetorootpath(Node node , int data , ArrayList<Node> ans)
    {
    	 if(node == null)
    	 {
    	 	return false;
    	 }
    	 if(node.data == data)
    	 {
    	 	ans.add(node);
    	 	return true;
    	 }

    	 boolean res = nodetorootpath(node.left , data , ans) ||
    	               nodetorootpath(node.right , data , ans);

    	 if(res)
    	 {
    	 	ans.add(node);
    	 }

    	 return res;
    }
    public static ArrayList<Node> nodetorootpath(Node node , int data)
    {
    	ArrayList<Node> ans = new ArrayList<>();
    	nodetorootpath(node , data , ans);
    	return ans;
    }
    public static ArrayList<Node> nodetorootpath2(Node node , int data)
    {
         if(node == null)
         {
         	return null;
         }

         if(node.data == data)
         {
         	ArrayList<Node> list = new ArrayList<>();
         	list.add(node);
         	return list;
         }

         ArrayList<Node> left = nodetorootpath2(node.left , data);
         if(left != null)
         {
         	 left.add(node);
         	 return left;
         }

         ArrayList<Node> right = nodetorootpath2(node.right , data);
         if(right != null)
         {
         	 right.add(node);
         	 return right;
         }


        return null;
    }
    public static ArrayList<Node> nodetorootpath02(Node node , int data)
    {
         ArrayList<Node> ans = nodetorootpath2(node , data);
         return ans != null ? ans : new ArrayList<>();
    }
    public static void KleveDown(Node node , int k , Node block , ArrayList<Integer> ans)
    {
    	if(node == null || k < 0 || node == block)
    	{
    		return;
    	}

    	if(k == 0)
    	{
    		ans.add(node.data)
    		return;
    	}

    	KleveDown(node.left, k - 1, block , ans);
    	KleveDown(node.right , k - 1, block , ans);
    }
    public static ArrayList<Integer> Kaway(Node data , int data , int k)
    {
    	ArrayList<Node> list = new ArrayList<>();
    	nodetorootpath(node , data , list);

    	ArrayList<Integer> ans = new ArrayList<>();
    	Node block = null;
    	for(int i = 0; i < list.size(); i++)
    	{
    		KleveDown(list.get(i) , k - i , block , ans);
    		block = list.get(i);
    	}

    	return ans;

    }
    static Node prev = null;
    public static boolean isBST(Node node)
    {
    	 if(node  == null)
    	 {
    	 	return true;
    	 }
         
         if(!isBST(node.left))
         {
         	return fase;
         }

         if(prev != null && prev.data > node.data)
         {
            return false;
         }
         prev = node;

         if(!isBST(node.right))
         {
         	return false;
         }

         return true;
    }
    public static class isBSTpair()
    {
    	boolean isBST = true;
    	int maxele = -(int)1e9;
    	int minele = (int)1e9;
    }
    public static isBSTpair isBST_02(Node node)
    {
    	 if(node == null)
    	 {
    	 	 return new isBSTpair();
    	 }

    	 isBSTpair left = isBST_02(node.left);
    	 if(!left.isBST)
    	 {
    	 	return left;
    	 }

    	 isBSTpair right = isBST_02(node.right);
    	 if(!right.isBST)
    	 {
    	 	return right;
    	 }

    	 isBSTpair self = new isBSTpair();
    	 self.isBST = false;

    	 if(left.maxele < node.data && right.minele > node.data)
    	 {
    	 	 self.maxele = Math.max(right.maxele , node.data);
    	 	 self.minele = Math.min(left.minele , node,data);
    	 	 self.isBST = true;
    	 }

    	 return self;
    }
    public static int height(Node node)
    {
    	if(node == null)
    	{
    		return -1;
    	}

    	int leftheight = height(node.left);
    	int rightheight = height(node.right);

    	int res = Math.max(leftheight , rightheight);

    	return res  + 1;
    }
    public static boolean isBal(Node node)
    {
    	if(node == null)
    	{
    		return true;
    	}

    	if(!isBal(node.left))
    	{
    		return false;
    	}

    	if(!isBal(node.right))
    	{
    		return false;
    	}

    	int lh = height(node.left);
    	int rh = height(node.right);

    	int diff = Math.abs(lh - rh);
    	if(diff > 1)
    	{
    		return false;
    	}
    	return true;
    }
    public static class balpair
    {
    	int height = -1;
    	boolean isBal = true;
    }
    public static balpair isBal2(Node node)
    {
    	if(node == null)
    	{
    		return new balpair();
    	}

    	balpair lpair = isBal2(node.left);
    	if(!lpair.isBal)
    	{
    		return lpair;
    	}

    	balpair rpair = isBal2(node.right);
    	if(!rpair.isBal)
    	{
    		return rpair;
    	}

    	balpair myans = new balpair();
    	if(Math.abs(lpair.height - rpair.height) > 1)
    	{
    		myans.isBal = false;
    		return myans;
    	}

    	myans.height = Math.max(lpair.height , rpair.height) + 1;
    	return myans;
    }
    public static class tiltpair
    {
    	int tiltsf = 0;
    	int sum = 0;

    }
    public static tiltpair findtilt(Node node)
    {
    	if(node == null)
    	{
    		return new tiltpair();
    	}

    	tiltpair left = findtilt(node.left);
    	tiltpair right = findtilt(node.right);

    	tiltpair myans = new tiltpair();
    	myans.tiltsf = left.tiltsf + right.tiltsf + Math.abs(left.sum - right.sum);
    	myans.sum = left.sum + right.sum + node.val;

    	return myans;
    }
    public int[] findtilt2(Node node)
    {
    	if(node == null)
    	{
    		return new int[2];
    	}

    	int[] left = findtilt2(node.left);
    	int[] right = findtilt2(node.right);

    	int[] ans = new int[2];
    	ans[0] = left[0] + right[0] + Math.abs(left[1] - right[1]);
    	ans[1] = left[1] + right[1] + node.val;

    	return ans;
    }
    public static int diameterOfBinaryTree_(Node node)
    {
    	if(node == null)
    	{
    		return 0;
    	}

    	int ld = diameterOfBinaryTree_(node.left);
    	int rd = diameterOfBinaryTree_(node.right);

    	int lh = height(node.left);
    	int rh = height(node.right);

    	return Math.max(Math.max(ld , rd) lh + rh + 2);
    }
    public static int[] diameterOfBinaryTree_02(Node node)
    {
    	 if(node == null)
    	 {
    	 	 return new int[]{0 , -1};
    	 }

    	 int[] ld = diameterOfBinaryTree_02(node.left);
    	 int[] rd = diameterOfBinaryTree_02(node.right);

         int[] myans = new int[2];
         myans[0] = Math.max(Math.max(ld[0] , rd[0]) , ld[1] + rd[1] + 2);
         myans[1] = Math.max(ld[1] , rd[1]) + 1;

         return myans;
    }
    public int diameter = 0 ;
    public static int diameterOfBinaryTree_03(Node node)
    {
    	if(node == null)
    	{
    		return -1;
    	}
        
        int ld = diameterOfBinaryTree_03(node.left);
    	int rd = diameterOfBinaryTree_03(node.right);

    	diameter = Math.max(diameter , ld + rd + 2);
    	return Math.max(ld , rd) + 1;

    }
    public static class lBSTpair
    {
    	boolean isBST = true;
    	int max = -(int)1e9;
    	int min = (int)1e9;

    	int maxsize = 0;
    	Node MaxBSTNode = null;

    }
    public static lBSTpair largestBST(Node node)
    {
    	if(node == null)
    	{
    		return new lBSTpair();

    	}

    	lBSTpair left = largestBST(node.left);
    	lBSTpair right = largestBST(node.right);

    	lBSTpair myans = new lBSTpair();
    	if(left.isBST && right.isBST && left.max < node.data && node.data < right.min)
    	{
    		myans.isBST = true;
    		myans.max = Math.max(right.max , node.data);
    		myans.min = Math.min(left.min , node.data);

    		myans.maxsize = left.maxsize + right.maxsize + 1;
    		myans.MaxBSTNode = node;
    	}
    	else
    	{
    		myans.isBST = false;
    		myans.maxsize = Math.max(left.maxsize , right.maxsize);
    		myans.MaxBSTNode = left.maxsize > right.maxsize ? left.MaxBSTNode : right.MaxBSTNode;
    	}

    	return myans;
    }
    public static void levelOrder(Node node)
    {
    	LinkedList<Node> que = new LinkedList<>();
    	que.addLast(node);
    	int level = 0;

    	while(que.size() != 0)
    	{
    		int size = que.size();
    		while(size-- > 0)
    		{
    			Node rn = que.removeFirst();
    			System.out.print(rn.data + " ");

    			if(rn.left != null)
    			{
    				que.addLast(rn.left);
    			}
    			if(rn.right != null)
    			{
    				que.addLast(rn.right);
    			}
    		}
    		level++;
    		System.out.println();
    	}
    }
    public List<List<Integer>> zigZag(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null)
            return ans;
        LinkedList<Node> que = new LinkedList<>(); // removeFirst, addLast
        LinkedList<Node> st = new LinkedList<>(); // removeFirst, addFirst

        que.addLast(root);
        int level = 0;

        while (que.size() != 0) {
            int size = que.size();
            List<Integer> smallAns = new ArrayList<>();
            while (size-- > 0) {
                Node rn = que.removeFirst();
                smallAns.add(rn.data);

                if (level % 2 == 0) {
                    if (rn.left != null)
                        st.addFirst(rn.left);
                    if (rn.right != null)
                        st.addFirst(rn.right);
                } else {
                    if (rn.right != null)
                        st.addFirst(rn.right);
                    if (rn.left != null)
                        st.addFirst(rn.left);
                }
            }
            level++;
            ans.add(smallAns);
            LinkedList<Node> temp = que;
            que = st;
            st = temp;
        }

        return ans;

    }
}