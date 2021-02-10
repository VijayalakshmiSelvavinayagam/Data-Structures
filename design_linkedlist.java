
class design_linkedlist {

    class Node
    {
        int value;
        Node next;
        public Node(int val)
        {
            this.value=val;
            this.next=null;
        }
    }
    
    Node head;
    Node tail;
    int count;
    /** Initialize your data structure here. */
    public design_linkedlist() {
        int val;
        count = 0;
        head = new Node(-1);
        tail = new Node(-1);
        head.next = tail;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        Node n=head.next;
        int cnt=0;
        while(cnt<index)
        {
            cnt++;
            n=n.next;
        }
        return n.value;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        /*head.value = val;
        head.next = tail;*/
        Node cur = new Node(val);
        cur.next = head.next;
        head.next=cur;
        count++;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        /*tail.value = val;
        tail.next = null;*/
        Node cur = new Node(val);
        Node n=head.next;
        if(n.next != null)
        {while(n.next!=null)
        {
            n=n.next;
        }}
        else if(n.next==null)
        {
        	head.next = cur;
        	cur.next=tail;
        }
        cur.next = tail;
        n.next = cur;
        count++;
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        if(index <0 || index > count)
            return;
        if(index==count)
            addAtTail(val);
        else if(index ==0)
            addAtHead(val);
        else if(index<count)
        {
            int cnt=0;
            Node n=head.next;
            Node prev=null;
            while(cnt<index)
            {
                cnt++;
                prev = n;
                n=n.next;
            }
            Node cur=new Node(val);
            cur.next=n;
            prev.next=cur;
            count++;
        }
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(index < 0 || index>count)
        {
            return;
        }
        if(index == 0)
        {
            head.next = head.next.next;
            head.next.next = null;
            return;
        }
        Node n=head.next;
        Node prev=null;
        int cnt=0;
        while(cnt<index)
        {
            prev=n;
            cnt++;
            n=n.next;
        }
        prev.next=n.next;
        n.next = null;
        count--;
    }
   /* public void print()
	{
		Node n=head.next;
		while(n.next!= null) {
			System.out.print(n.value+" ");
			n=n.next;
		}
	}*/
    public static void main(String[] args)
    {
    	design_linkedlist obj = new design_linkedlist();
    	obj.addAtHead(2);
    	obj.deleteAtIndex(1);
    	obj.addAtHead(2);
    	obj.addAtHead(7);
    	obj.addAtHead(3);
    	obj.addAtHead(2);
    	obj.addAtHead(5);
    	obj.addAtTail(5);
    	int param_1 = obj.get(5);
    	System.out.println(param_1);
    	obj.deleteAtIndex(6);
    	obj.deleteAtIndex(4);
    	//obj.print();
    }
}

/**
 ["MyLinkedList","addAtHead","deleteAtIndex","addAtHead","addAtHead","addAtHead","addAtHead","addAtHead","addAtTail","get","deleteAtIndex","deleteAtIndex"]
[[],[2],[1],[2],[7],[3],[2],[5],[5],[5],[6],[4]]
 */