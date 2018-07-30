
import java.util.*;

class SList<E> {

	public Link<E> headLink = new Link<E>(null);
	SListIterator<E> iterator() { 
              return new SListIterator<E>(headLink); }       //creating instance of SlistIterator
	public String toString() { 
		if(headLink.next == null) return "SList: []";
		System.out.println("SList: [");
		SListIterator<E> it = this.iterator();
		StringBuilder s = new StringBuilder(); 
		while(it.hasNext()) {
			s.append(it.next() + (it.hasNext() ? ", " : ""));
		}
		return s + "]";
	}		
}

class SListIterator<E> {
	Link<E> current;
	SListIterator(Link<E> link) {
		current = link;
	}
	public boolean hasNext() {
		return current.next != null;
	}
	public Link<E> next() {
		current = current.next;
		return current;
	}
	public void insert(E e) {        // insert method
		current.next = new Link<E>(e, current.next);
		current = current.next;
	}	
	public void remove() {           // remove method
		if(current.next != null) {
			current.next = current.next.next;
		}
	}
}

class Link<E> {
	E e;
	Link<E> next;
	Link(E e, Link<E> next) { 
		this.e = e;
		this.next = next; 
	}
	Link(E e) {
		this(e, null);
	} 	
	public String toString() {
		if(e == null) return "null";
		return e.toString();
	}
}

public class TestSlist {
	public static void main(String[] args) {
		SList<Integer> sl = new SList<Integer>();
		System.out.println(sl);
		SListIterator<Integer> sit = sl.iterator();
                System.out.println("Inserting elements : ");
		sit.insert(1);                   // inserting elements in linked list
                sit.insert(2);
                sit.insert(3);
		System.out.println(sl);
                System.out.println("Removing one element");
                SListIterator<Integer> sit1 = sl.iterator();
                sit1.remove();                   // removing element from linked list
                System.out.println(sl);
			
	}
}
     
