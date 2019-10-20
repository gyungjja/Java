package week9;

import java.util.Iterator;
import java.util.TreeSet;

public class exam8 {
    int s;
    public static void main(String [] args) {
    	TreeSet map = new TreeSet();
    	map.add("one");
    	map.add("two");
    	map.add("three");
    	map.add("four");
    	//map.add("one");
    	
    	System.out.println(map.first());
    	System.out.println(map.last());
    	
    	Iterator it = map.iterator();
    	while (it.hasNext() ) {
    	    System.out.print( it.next() + " " );
    	}
   }
}

