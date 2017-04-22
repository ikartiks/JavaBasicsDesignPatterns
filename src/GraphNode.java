

class node
{
	node next;
	int data;
}
public class GraphNode
{
	node first;
	void insert(int val)
	{
		node x=new node();
		x.data=val; 
		if (first==null)
			first=x;
			else
			{
				node temp=first;
				while(temp.next!=null)
					temp=temp.next;
					temp.next=x;
			}
	}
	void display()
	{
		node temp=first;
		while(temp!=null)//note
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	void count()
	{
		int count=0;
		node temp=first;
		while(temp!=null)//note
		{
			temp=temp.next;
			count++;
		}
		System.out.println("count is "+count);
	}
	boolean search(int v)
	{
		boolean flag =false;
		node temp=first;
		while(temp!=null)//note
		{
			if(v==temp.data)
			return true;
				else
			           temp=temp.next;
		}
			return false;//note dont write conditions now
	}
	void insertafter (int val ,int after) throws Exception
	{
		boolean assume=true;
		node prev=null;//note no need
		node x=new node();
		x.data=val;
		node temp=first;
		while(temp!=null)//note not.next it will insert to last pos even if after doesnt exists
		{
			if(after==temp.data)
			{
				x.next=temp.next;
				temp.next=x;
				assume =false;
			}
			temp=temp.next;
		}
		if(assume)
			throw new Exception("value not found");
	}
	void insertatpos(int val,int pos)//mistake
	{
		node temp=first;
		int count=1;
		node x=new node();
		x.data=val;
		while (count<(pos-1))//note********************************************
		{
			temp=temp.next;
			count=count+1;
		}
     	x.next=temp.next;
		temp.next=x;
			
	}
	void insertinorder(int val)
	{
		node prev=null;//note se excecution of first last and middle(check conditions (they r not same))
		node x=new node();
		x.data=val;
		node temp=first;
		while(temp!=null)
		{
			if(temp.data>val)
				break;
				else
				{
					prev=temp;
					temp=temp.next;
				}
					
		}
		if(temp==first)
		{
			x.next=temp;
			first=x;
		}
		else
		{
			x.next=prev.next;
			prev.next=x;
		}
	}
	GraphNode copy()//note
	{
		GraphNode sa=new GraphNode();
		node temp=first;//by default l ka first , it is parameter
		while(temp!=null)
		{
			sa.insert(temp.data);
			temp=temp.next;
		}
		return sa;
	}
	GraphNode intersection(GraphNode t)
	{
		GraphNode l=new GraphNode();
		node temp1=first;
		node temp2=t.first;
		while(temp1!=null)//since we want all elements
		{
			while(temp2!=null)
			{
				if (temp1.data==temp2.data)
					l.insert(temp2.data);
					temp2=temp2.next;
			}
			temp1=temp1.next;
			temp2=t.first;
		}
		return l;
	}
	GraphNode union(GraphNode t)
	{
		GraphNode l=new GraphNode();
		node temp1=first;
		node temp2=t.first;
		while(temp1.next!=null)
			{
				l.insert(temp1.data);
				temp1=temp1.next;
			}
		while(temp1!=null)//since we want all elements
		{
			while(temp2!=null)
			{
				if (temp1.data==temp2.data)
				{temp2=temp2.next;}
				else
				{
					l.insert(temp2.data);
					temp2=temp2.next;	
				}
					
			}
			temp1=temp1.next;
			temp2=t.first;
		}
		return l;
	}
	
	public static boolean findPath(node start, node end){
		
		node startNode=start;
		while (start.next!=null) {
			if(start.next.data==end.data){
				return true;
			}
			start=start.next;
			
		}
		return false;
	}
	
	public static void  main(String arg[])
	{
		GraphNode l=new GraphNode();
		l.insert(25);
		l.insert(35);
		l.insert(25);
		l.insert(55);
		//l.display();
		l.count();//note
		System.out.println(l.search(15));
		try{
			l.insertafter(11,2566);
		}
		catch(Exception e){System.out.println(e);}
		try{l.insertatpos(87,3);
			}
			catch(Exception e){System.out.println(e);}
		l.display();
		/*
		l.insertinorder(20);
		l.insertinorder(30);
		l.insertinorder(99);
		ll s=l.copy();
		ll b=new ll();
		b.insert(20);
		b.insert(77);
		b.insert(111);
		b.insert(35);
		ll a=s.intersection(b);
		ll d=l.union(b);//mistake
		d.display();
		*/
	}
}