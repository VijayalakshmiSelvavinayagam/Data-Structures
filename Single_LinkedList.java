class Single_LinkedList {

    class Node
    {
        int value;
        Node next;
        public Node(int val)
        {
            this.value=val;
        }
    }
    
    Node head;
    Node tail;
    int count;
    /** Initialize your data structure here. */
    public Single_LinkedList() {
        count = 0;
        head = null;
        tail = null;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index>=count)
		return -1;
	Node n=head;
	for(int i=0; i<index; i++)
		n=n.next;
        return n.value;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
	Node cur = new Node(val);
    if(head == null)
	{
		head=cur;
		tail=cur;
	}
	else
	{
		cur.next = head;
		head=cur;
	}
        count++;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
	Node cur=new Node(val);
        if(count ==0 && tail==null)
	{
		tail = cur;
		head = cur;
	}
	else
	{
		tail.next = cur;
		tail = cur;
	}
        count++;
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(index <0 || index > count)
            return;
        if(index==count)
        {
            addAtTail(val);
        }
        else if(index ==0)
        {
            addAtHead(val);
        }
        else 
        {
           // int cnt=0;
            Node n=head;
            for(int i=0; i<index-1; i++)
	    {
		n=n.next;
	    }
            Node cur=new Node(val);
	    Node prev = n;
   	    n=n.next;
   	    prev.next=cur;
            cur.next=n;
           // prev.next=cur;
            count++;
        }
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(index < 0 || index>count || count == 0)
        {
            return;
        }
        if(index == 0)
        {
            head = head.next;
            count--;
	    if(count == 0)
		tail=null;
        }
	else
	{
	    Node n=head;
            for(int i=0; i<index-1; i++)
		n=n.next;
	    n.next = n.next.next;
	    count--;
	    if(n.next==null)
                 tail=n;
	}
        
    }
    
    public void print()
	{
		Node n=head;
		/*while(n!= null) {
			System.out.print(n.value+" ");
			n=n.next;
		}*/
		for(int i=0; i<count; i++)
		{
			System.out.print(n.value+" ");
			n=n.next;
		}
	}
    public static void main(String[] args)
    {
    	Single_LinkedList obj = new Single_LinkedList();
    	obj.addAtHead(1);
    	//obj.print();
    	obj.addAtTail(3);
    	obj.addAtIndex(1,2);
    	obj.print();
    	obj.deleteAtIndex(1);
    	//obj.print();
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */