package Collection;
import java.util.*;
public class VectorToList {

	public static void main(String[] args) {
		Vector <String> car=new Vector<String>();
		car.add("Volvo");
		car.add("BMW");
		car.add("Mercedes-Benz");
		car.add("Datsun GO+");
		car.add("Hyundai i20");
		System.out.println("...........1)Vector List...........");
		System.out.println(car);
		System.out.println("___________________________________________________\n");
		
		ArrayList <String> arr=new ArrayList<String>();
		arr.add("Volvo");
		arr.add("BMW");
		arr.add("Mercedes-Benz");
		arr.add("Datsun GO+");
		arr.add("Hyundai i20");
		System.out.println("...........2)ArrayList...........");
		System.out.println(arr);
		System.out.println("___________________________________________________\n");
		
		LinkedList <String> ll=new LinkedList <String>();
		ll.add("Volvo");
		ll.add("BMW");
		ll.add("Mercedes-Benz");
		ll.add("Datsun GO+");
		ll.add("Hyundai i20");
		System.out.println("...........3)LinkedList...........");
		System.out.println(ll);
		System.out.println("___________________________________________________\n");
		
		TreeSet <String> ts=new TreeSet<String>();
		ts.add("Volvo");
		ts.add("BMW");
		ts.add("Mercedes-Benz");
		ts.add("Datsun GO+");
		ts.add("Hyundai i20");
		System.out.println("...........4)TreeSet...........");
		System.out.println(ts);
		System.out.println("___________________________________________________\n");
		
		SortedSet <String> ss=new TreeSet <String>(); //sorted set derived from treeSet
		ss.add("Volvo");
		ss.add("BMW");
		ss.add("Mercedes-Benz");
		ss.add("Datsun GO+");
		ss.add("Hyundai i20");
		System.out.println("...........5)SortedSet...........");
		System.out.println(ss);
		System.out.println("___________________________________________________\n");
		
		HashMap<Integer,String> HM=new HashMap<Integer,String>();
		HM.put(1,"Volvo");
		HM.put(2,"BMW");
		HM.put(3,"Mercedes-Benz");
		HM.put(4,"Datsun GO+");	//put method in HashMap
		HM.put(5,"Hyundai i20");
		System.out.println("...........6)HashMap...........");
		System.out.println(HM);
		System.out.println("___________________________________________________________\n");
		
		LinkedHashSet <String> lhs= new LinkedHashSet <String>();
		lhs.add("Volvo");
		lhs.add("BMW");
		lhs.add("Mercedes-Benz");
		lhs.add("Datsun GO+");
		lhs.add("Hyundai i20");
		System.out.println("...........7)LinkedHashSet...........");
		System.out.println(lhs);
		System.out.println("___________________________________________________\n");
		
		ArrayDeque <String> ad=new ArrayDeque <String>();
		ad.add("Volvo");
		ad.add("BMW");
		ad.add("Mercedes-Benz");
		ad.add("Datsun GO+");
		ad.add("Hyundai i20");
		System.out.println("...........8)ArrayDeque...........");
		System.out.println(ad);
		System.out.println("___________________________________________________\n");
		
		HashSet <String> hs=new HashSet<String>();
		hs.add("Volvo");
		hs.add("BMW");
		hs.add("Mercedes-Benz");
		hs.add("Datsun GO+");
		hs.add("Hyundai i20");
		System.out.println("...........9)HashSet..........");
		System.out.println(hs);
		System.out.println("___________________________________________________\n");
	}

}
