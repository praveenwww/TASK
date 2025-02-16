
import java.util.*;
public class Collection{
public static void main(String[] args){
ArrayList<Integer> a1 = new ArrayList<Integer>();
a1.add(2);
a1.add(31);
a1.add(14);
a1.add(7);
a1.add(1);

System.out.println("Actual ArrayList "+a1);

a1.sort(null);
System.out.println("Sorted "+a1);

a1.remove(2);
System.out.println("Removed "+a1);

Collections.shuffle(a1);
System.out.println("Shuffled "+a1);

Collections.reverse(a1);
System.out.println("Reversed "+a1);

a1.set(0,777);
System.out.println("After First Set "+a1);

a1.set(3,33);
System.out.println("After Last Set "+a1);

Integer[] Array = a1.toArray(new Integer[0]);
System.out.println("Converted Array: "+Arrays.toString(Array));

}
}