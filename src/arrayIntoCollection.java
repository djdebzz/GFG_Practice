import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class arrayIntoCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"Sunday","Monday","Tuesday","Wednusday"};
		String[] months = {"January","February","March"};
		
		System.out.println("Input Array is : " + Arrays.toString(arr));
		List<String> stringList = new ArrayList<>(Arrays.asList(months));
		
		stringList.add("April");
		
		/*
		 * List<String> days = Arrays.asList(arr); List<String> Months =
		 * Arrays.asList(months); days.add(1,"Thursday");
		 */
				
		System.out.println("Converted elements:  " + stringList);
		String[] bikes = {"Pulsar","Karizma","Gixxer","CBR"};
		
		List<String> stringList1 = new ArrayList<>();
		Collections.addAll(stringList1, bikes);
		
		System.out.print(stringList1);
		

	}

}
