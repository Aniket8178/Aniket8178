public class demo
{
    public class linkedlist
    {
        private class Node() 
        {
            int data = 0;
            Node next = null;
            
            Node(int data)
            {
                this.data = data;
            }
        }

        private Node head = null;
        private Node tail = null;
        private int size = 0;

        public int size()
        {
            return this.size;
        }
        public boolean isEmpty()
        {
            return this.size == 0;
        }

        private void addFirstNode(Node newnode)
        {
            if(this.size == 0)
            {
                this.head == this.tail == newnode;
            }
            else
            {
                  newnode.next = this.head;
                  this.head = newnode;
            }
            this.size++;
        }
        private void addLastNode(Node newnode)
        {
            if(this.size == 0)
            {
                this.head == this.tail == newnode;
            }
            else
            {
                  this.tail.next = newnode;
                  this.tail = newnode;
            }
            this.size++;
        }
        public void addfirst(int data)
        {
            Node newnode = new Node(data);
            addFirstNode(newnode);
        }
        public void addlast(int data)
        {
            Node newnode = new Node(data);
            addLastNode(newnode);
        }
        private void addNodeAt(Node newnode,int idx)
        {
            if(idx == 1)
            {
                addFirstNode(newnode);
            }
            else if(idx == this.size)
            {
                addLastNode(newnode);
            }
            else
            {
                Node prevnode = GetIndexAt(idx - 1);
                Node forwdnode = prevnode.next;
                prevnode.next = newnode;
                newnode.next = forwdnode;
                this.size++;
            }
        }
        public void addnodeat(int idx)
        {
            if(idx < 0 || idx > this.size)
            {
                return -1;
            }
            Node newnode = new Node();
            addNodeAt(newnode , idx);
        }
        private Node GetIndexAt(int idx)
        {
            Node curr = this.head;
            while(idx > 0)
            {
                curr = curr.next;
                idx--;
            }

            return curr;
        }
        public int getAt(int idx)
        {
             if(idx < 0 || idx >= this.size)
             {
                 return -1;
             }
             return GetIndexAt(idx).data;
        }
        private Node removeFirstNode()
        {
            Node curr = this.head;
            if(this.size == 1)
            {
                this.head = this.tail = null;
            }
            else
            {
                this.head = this.head.next;
                curr.next = null;
            }
            this.size--;
            return curr;
        }
        public int removerfirst()
        {
            if(this.size == 0)
            {
                return -1;
            }
            Node curr = removeFirstNode();
            return curr.data;
        }
        private Node removeLastNode()
        {
            Node node = this.tail;
            if(this.size == 1)
            {
                this.head == this.tail == null;
            }
            else
            {
                 Node secondlast = GetIndexAt(this.size - 2);
                 secondlast.next = null;
                 this.tail = secondlast;
            }
            this.size--;
        }
        public int removelast()
        {
            if(this.size == 0)
            {
                return -1;
            }
            Node node = removeLastNode();
            return node.data;
        }
        private Node removeAt(int idx)
        {
            if(idx == 1)
            {
                removeFirstNode();
            }
            else if(idx == this.size)
            {
                removeLastNode();
            }
            else
            {
                Node prevnode = GetIndexAt(idx - 1);
                Node forwdnode = prevnode.next;
                prevnode.next = forwdnode.next;
                forwdnode.next = null;
                this.size--;  
            }
        }
        public int removeat(int idx)
        {
            if(idx < 0 || idx >= this.size)
            {
                return  -1;
            }
            Node curr = removeAt(idx);
            return curr.data;

        }
        private Node getFirstnode()
        {
            return this.head;
        }
        public int getfirst()
        {
            if(this.size == 0)
            {
                return -1;
            }
            return getFirstnode().data;
        }
        private Node getLastNode()
        {
            return this.tail;
        }
        public int getlast()
        {
            if(this.size == 0)
            {
                return -1;
            }
            return getLastNode().data;
        }

    }
}