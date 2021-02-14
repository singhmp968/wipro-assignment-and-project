package Set;
import java.util.Set;
import java.util.Iterator;
//import javax.swing.text.html.HTMLDocument.Iterator;
public class TreeSet {
	public static void main(String args[]){
	    TreeSet<String> t1= new TreeSet<String>();//create a Treesetobjectt1.add("One");
	    t1.add("Two");
	    t1.add("Three");
	    t1.add("Four");
	    t1.add("Five");
	    System.out.println("Contents of treeset");
	    Iterator it1= t1.iterator(); //obtaining iterator object
	    while(it1.hasNext()){
	    	// to iterate thru collection.
	    Object o1=it1.next();
	    System.out.print(o1+"\t"); } }
}
