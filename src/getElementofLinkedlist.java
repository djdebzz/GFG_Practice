import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class getElementofLinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> newLinkedList = new LinkedList<>();
		
		newLinkedList.add("Swastik");
		newLinkedList.add("Minature");
		newLinkedList.add("Apoorva");
		newLinkedList.add("Debjeet");
		
		System.out.println("The Elements of the LinkedList : ");
		
		for(int i=0; i<newLinkedList.size(); i++) {
			System.out.println("Element at Index "+ i + " is " + newLinkedList.get(i));
		}
		
		ListIterator<String> i = newLinkedList.listIterator();
		
		System.out.print("\nThe elements of LinkedList in forward order\n");
		
		int j=0;
		
		while(i.hasNext()) {
			System.out.print("The element at index "+ j +" is: ");
			String str = i.next();
			System.out.print(str);
			System.out.print(" \n");
			++j;
		}
		j--;
		
		System.out.print("\nThe elements of LinkedList in reverse order\n");
		
		
		
		while(i.hasPrevious()) {
			System.out.print("The element at index "+ j +" is: ");
			String rstr = i.previous();
			System.out.print(rstr);
			System.out.print("\n");
			j--;
		}
		
		
		
		
		
	
	}

}
