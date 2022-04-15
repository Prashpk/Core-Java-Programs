
public class FindingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "prashianith";
		
		System.out.println(s.substring(2));
		
		//include starting index exclude end
		System.out.println(s.substring(2,6));
		
		//indexOf position of character from left to right
		System.out.println(s.indexOf('i'));
		
		//indexOf position of character from right to left
		System.out.println(s.lastIndexOf('i'));

	}

}
