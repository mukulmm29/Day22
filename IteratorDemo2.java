import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class IteratorDemo2 {
	void Display(List<String> list) {
		Iterator<String> m = list.iterator();
		while(m.hasNext()) {
			System.out.println("The Element is:- " +m.next());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> m = new LinkedList<>();
		m.add("HEY");
		m.add("GOOD");
		m.add("MORNING");
		m.add("HAVE");
		m.add("NICE");
		m.add("DAY");
		System.out.println("The Element is:- " +m);
		
		IteratorDemo2 mm = new IteratorDemo2();
		mm.sort(null);
		mm.Display(m);
		System.out.println("************* ");
		Collections.reverse(m);
		mm.Display(m);
	}

}
