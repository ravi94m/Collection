import java.util.*;
class LinkedListDemo{
	public static void main(String aa[]){
		
		LinkedList l=new LinkedList();
		l.add("Ravi");
		l.add("Maurys");
		l.add(50);
		l.add(null);
		l.addFirst("Mr.");
		l.addLast("Maurya");
		System.out.println(l);
		l.removeFirst();
		l.removeLast();
		System.out.println(l);
		Object o=l.getFirst();
		Object o1=l.getLast();
		System.out.println(o);
		System.out.println(o1);
	}
	
}