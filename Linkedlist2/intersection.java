public int lengthll(Node node)
	  {
	  	  if(node == null)
	  	  {
	  	  	  return 0;
	  	  }

	  	  Node curr = node;
	  	  int count = 0;
	  	  while(curr != null)
	  	  {
	  	  	 count++:
	  	  	 curr = curr.next;
	  	  }

	  	  return count;
	  }
	  public int findintersection(Node one , Node two)
	  {
	  	  int a = lengthll(one);
	  	  int b = lengthll(two);

	  	  Node biggerNode = a > b ? one : two;
	  	  Node smallerNode = a < b ? one : two;
	  	  int diff = Math.abs(a - b);

	  	  while(diff-- > 0)
	  	  {
	  	  	  biggerNode = biggerNode.next;

	  	  }

	  	  while(biggerNode != smallerNode)
	  	  {
	  	  	  biggerNode = biggerNode.next;
	  	  	  smallerNode = smallerNode.next;
	  	  }

	  	  return smallerNode != null ? smallerNode.data : -1;
	  }
	  public int Intersection(Node one, Node two)
	  {
        return findIntersection(one.head, two.head);
      }