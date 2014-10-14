package linkedlist;

import java.util.*;

public class RemoveDuplicatesFromUnsorted {
	public static void main(String args[]) {
		int inputArray[] = {23,10,33,23,25,5,42,5,1,2,10};
		MyLinkedList l = new MyLinkedList();
		l.create(inputArray);
		l.display();
		RemoveDuplicatesFromUnsorted rm = new RemoveDuplicatesFromUnsorted();
		rm.remove(l);
	}

	private void remove(MyLinkedList l) {
		HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
		Node p = l.start;
		int index=0;
		while(p.next!=null) {
			if(!m.containsKey(p.data)) {
				m.put(p.data, p.data);
			}
			else {
				l.delete_between(index);
				index--;
			}
			index++;
			p = p.next;
		}
		l.display();
	}

}