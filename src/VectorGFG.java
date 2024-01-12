import java.util.Collections;
import java.util.Vector;

public class VectorGFG {

	public static void main(String[] args) {
				
		Vector<Integer> newVector = new Vector<Integer>();
			
		newVector.add(107);
		newVector.add(35);
		newVector.add(56);
		newVector.add(78);
		newVector.add(77);
		newVector.add(34);
		newVector.add(4);
		
		int maxVal = Collections.max(newVector);
		System.out.print(maxVal);
		

		}

	}


