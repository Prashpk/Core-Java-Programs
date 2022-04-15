import java.util.Scanner;

public class WordOccurence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		int c = 0;
		System.out.println("Enter a sentence :");
		s = sc.nextLine();
		String ch[] = s.split(" ");
		System.out.println("enter word to search ");
	    String w = sc.nextLine();
		
	    for(int i=0;i<ch.length;i++) {
	    	if(ch[i].equals(w)) {
	    		c++;
	    	}
	    }
	    System.out.println("Occurence of word " +c);
	    String s1 = "Hello hi hi";
	    System.out.println(s1.replaceAll("hi","hello"));
	}

}
