package TreeSet;
import java.util.*;

class StudentTreeSet2{
	int sid;
	String name;
	int marks;
	public StudentTreeSet2(int sid, String name, int marks) {
		super();
		this.sid = sid;
		this.name = name;
		this.marks = marks;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
}
class StudentMarksCompare1 implements Comparator<StudentTreeSet2>{

	@Override
	public int compare(StudentTreeSet2 o1, StudentTreeSet2 o2) {
		
		return o1.marks-o2.marks;
	}
}
class StudentNameCompare1 implements Comparator<StudentTreeSet2>{

	@Override
	public int compare(StudentTreeSet2 o1, StudentTreeSet2 o2) {
		
		return o1.getName().compareTo(o2.getName());
	}
}
class StudentIdCompare1 implements Comparator<StudentTreeSet2>{

	@Override
	public int compare(StudentTreeSet2 o1, StudentTreeSet2 o2) {
		
		return o1.sid-o2.sid;
	}
}
public class P8_ArrayListSort {

	public static void main(String[] args) {
		ArrayList<StudentTreeSet2> ob=new ArrayList< StudentTreeSet2>( );
		StudentTreeSet2 tob1=new StudentTreeSet2(1, "akshay",540);
		StudentTreeSet2 tob2=new StudentTreeSet2(2, "bashaa",530);
		StudentTreeSet2 tob3=new StudentTreeSet2(3, "siddua",520);
		StudentTreeSet2 tob44=new StudentTreeSet2(4, "Lucky",320);
		ob.add(tob1);
		ob.add(tob2);
		ob.add(tob3);
		ob.add(tob44);
		
		System.out.println("Sorting based on the Marks");
		System.out.print("");
		
		Collections.sort(ob, new StudentMarksCompare1());
		Iterator<StudentTreeSet2> it=ob.iterator();
		while (it.hasNext()) {
			StudentTreeSet2 sob=it.next();
			System.out.println("sid=  "+sob.getSid()+"  name=  "+sob.getName()+"   marks=  "+sob.getMarks());
		}
		
		ArrayList<StudentTreeSet2> ob1=new ArrayList<StudentTreeSet2>();
		StudentTreeSet2 tob4=new StudentTreeSet2(1, "chandu",540);
		StudentTreeSet2 tob5=new StudentTreeSet2(2, "Ashwath",512);
		StudentTreeSet2 tob6=new StudentTreeSet2(3, "base",500);
		ob1.add(tob4);
		ob1.add(tob5);
		ob1.add(tob6);
		
		 System.out.println("Sorting Based on the Name");
		 
		 Collections.sort(ob1, new StudentNameCompare1());
		 
		Iterator<StudentTreeSet2> it1=ob1.iterator();
		while(it1.hasNext()) {
			StudentTreeSet2 sob1=it1.next();
			System.out.println("sid=  "+sob1.getSid()+"       name= "+sob1.getName()+"      marks=  "+sob1.getMarks());
		}
		
		ArrayList<StudentTreeSet2> ob2=new ArrayList<StudentTreeSet2>();
		StudentTreeSet2 tob7=new StudentTreeSet2(2, "prash",540);
		StudentTreeSet2 tob8=new StudentTreeSet2(4, "base",512);
		StudentTreeSet2 tob9=new StudentTreeSet2(3, "Aandy",500);
		ob2.add(tob7);
		ob2.add(tob8);
		ob2.add(tob9);
		
		System.out.println("Sorting based on the id");
		
		Collections.sort(ob2, new StudentIdCompare1());
		
		Iterator<StudentTreeSet2> it2=ob2.iterator();
		while(it2.hasNext()) {
		StudentTreeSet2 sob2=it2.next();
		System.out.println("sid=  "+sob2.getSid()+"         name=  "+sob2.getName()+"  marks=  "+sob2.getMarks());
	}
}
}