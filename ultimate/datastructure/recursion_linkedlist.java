/*public class recursion_linkedlist {

    public static node head=new node(10);
    public static class node{
        int data;
        node next;
        public node(int data){
            this.data=data;
            this.next=null;
        }
        public node(int data,node next){
            this.data=data;
            this.next=next;
        }

    }
    public static void add_rec(int data,int index){
        head=add_at_pos(data, index, head);
    }
    public static node add_at_pos(int data,int index,node link){
        if(index==0){
            node newnode=new node(data,link);
            return newnode;
        }
        link.next=add_at_pos(data, index--,link.next);
        return link;
    }
    public static void main(String[] args) {
        node first=new node(20);
        node second=new node(30);
        node third=new node(40);
        node four=new node(50);
        node five=new node(60);

        head.next=first;
        first.next=second;
        second.next=third;
        third.next=four;
        four.next=five;

        add_rec(100, 3);
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }

    }
}

*/

// Java code to insert a node at a given
//position in singly linked list
public class recursion_linkedlist{

// Structure of the node of linked list
static class node
{
	int item;
	node nxt;
	
	node(int item, node t)
	{
		this.item = item;
		this.nxt = t;
	}
};


static node insertAtFirst(node listHead, node x)
{
	x.nxt = listHead;
	listHead = null;
	listHead = x;
	return listHead;
}

static node insertAtEnd(node listHead, node x)
{
	if (listHead.nxt == null)
	{
		listHead.nxt = x;
		return listHead;
	}
	listHead.nxt = insertAtEnd(listHead.nxt, x);
	return listHead;
}

static node insertInBetween(node temp, node x,
							int pos)
{
	if (pos == 2)
	{
		if (temp != null)
		{
			x.nxt = temp.nxt;
			temp.nxt = x;
		}
		return temp;
	}
	if (temp == null)
	{
		return temp;
	}
	temp.nxt = insertInBetween(temp.nxt, x, --pos);
	return temp;
}

static void print(node head)
{
	if (head == null)
	{
		return;
	}
	System.out.print(head.item + " ");
	print(head.nxt);
}
public static void main(String[] args)
{
	node head = new node(1, null);

	for(int i = 3; i < 5; i++)
		insertAtEnd(head, new node(i, null));
	head = insertInBetween(head,new node(105, null), 2);
	head = insertInBetween(head,new node(106, null), 4);

	head = insertAtFirst(head, new node(100, null));

	print(head);
}
}

// This code is contributed by shikhasingrajput

