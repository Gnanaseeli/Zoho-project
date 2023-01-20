package samples;
import java.util.ArrayList;
public class Arraylist {

	public static void main(String[] args) {
//		ArrayList<Integer> input = new ArrayList<Integer>(Arrays.asList(56,14,89,53,57,21));
		ArrayList<Integer> input = new ArrayList<Integer>();
		input.add(5);
		input.add(4);
		input.add(6);
		input.add(9);
		System.out.println(input);
		input.remove(2);
		System.out.println(input);
	}

}
