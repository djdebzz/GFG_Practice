import java.util.ArrayList;
import java.util.List;

public class collectionsIntoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> newList = new ArrayList<String>();
		
		newList.add("Sunday");
		newList.add("Monday");
		newList.add("Tuesday");
		newList.add("Wednesday");
		
		System.out.print("Printing as List" + newList + "\n");
		
		String[] newStrArray =  newList.toArray(new String[0]);
		
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i]+ " ");
		}

	}

}
