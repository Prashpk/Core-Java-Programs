// sorting for user defined class using comparator
package ArrayList;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Students {
    int id;
    String name;
    int marks;
    public Students(int id, String name, int marks) {
        this.id = id;
        this.marks = marks;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
//sorting by comparing the marks
class sortedMarks implements Comparator<Students>{
    @Override
   public int compare(Students o1, Students o2) {
       return o1. getMarks() - o2. getMarks();
   }
}
class sortedName implements Comparator<Students>{
    @Override
    public int compare(Students o1, Students o2) {
        return o1.getName().compareTo(o2. getName());
    }
}

class sortedId implements Comparator<Students>{
    public int compare(Students o1, Students o2){
return o1.id - o2.id;
    }
}

public class ArrayListSorting {
    public static void main(String[] args) {
        ArrayList<Students> st= new ArrayList<>();
        Students sts = new Students(4,"Abdul",600);
        Students sts1 = new Students(5,"Sam",500);
        Students sts2 = new Students(6,"Ceded",300);
        Students sts3 = new Students(3,"Rahul",200);
        Students sts4 = new Students(2,"Bahubali",100);
        st.add(sts);
        st.add(sts1);
        st.add(sts2);
        st.add(sts3);
        st.add(sts4);

       //************* MARKS **********
         Collections.sort(st, new sortedMarks());
        System.out.println("MARKS  After Sorting :");
        Iterator<Students> it = st.iterator();
        while(it.hasNext()){
            Students s = it.next();
            System.out.println(s.getId()+ "  " +s.getName()+ "  " +s.getMarks());
        }

        //*********** NAME ***************
        Collections.sort(st, new sortedName());
        System.out.println("Name  After Sorting :");
        Iterator<Students> it1 = st.iterator();
        while(it1.hasNext()){
            Students s1 = it1.next();
            System.out.println(s1.getId()+ "  " +s1.getName()+ "  " +s1.getMarks());
        }

        //************** ID *************
        System.out.println("ID After Sorting :");
        Collections.sort(st, new sortedId());
        Iterator<Students>  it3 = st.iterator();
        while(it3.hasNext()){
            Students s4 = it3.next();
            System.out.println(s4.getId()+ "  " +s4.getName()+ "  " +s4.getMarks());
        }
    }
}
