import java.util.LinkedList;

public class clearLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Object> newLinkedList = new LinkedList<>();
		
		newLinkedList.add("Swastik");
		newLinkedList.add("Apoorva");
		newLinkedList.add("Debjeet");
		newLinkedList.add("Laxmi");
		newLinkedList.add("20");
		newLinkedList.add("22");
		
		System.out.print("Original LinkedList : \n"+ newLinkedList);
		
		newLinkedList.clear();
		
		System.out.print("LinkedList after cleaning : \n"+ newLinkedList);
		
		newLinkedList.add("Swastik");

		
		
		
		
		

	}

}
