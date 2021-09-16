import java.util.Iterator;
import java.util.LinkedList;
import java.util.*;

public class demolist {
	public static void main(String[] args) {
		LinkedList<String> ll =new LinkedList<String>();
		ll.add("pranita");
		ll.add("shraddha");
		ll.add("Shweta");
		
		System.out.println(ll);
		
		ll.remove("Shweta");
		System.out.println(ll);
		
		
		ll.add("i lives in pune");
		ll.add("laptop");
		System.out.println(ll);
		
		//iterator
		System.out.println("---------------ITERATOR---------------");
		
		Iterator<String>itr =ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("--------------------listiterator----------");
		ListIterator<String> litr=ll.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		System.out.println("----------------list iterator previous-------------------");
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
		System.out.println("--------------------enhance loop----------");
		for(String s:ll)
			System.out.println(ll);
		//----------------------------------------------------------------
		System.out.println("------------------------------for each method-------------------");
		ll.forEach(p->System.out.println(ll));

	
	}

}
