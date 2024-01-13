import java.util.Collections;
import java.util.Vector;

public class VectorBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> newVector = new Vector<>(); 
		
		newVector.add("24");
		newVector.add("A");
		newVector.add("10");
		newVector.add("V");
		newVector.add("Z");
		
		Collections.sort(newVector);
		
		System.out.println("Sorted Vector = " + newVector);
		
		int index = Collections.binarySearch(newVector, "Z");
		
		System.out.println("The element is found at index = " + index);
		

	}

}
