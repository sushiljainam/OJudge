package expCodechef;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Collec {
	List<Node> lis = new ArrayList<Node>();
	public static void main(String[] args) {
		Collec ob = new Collec();
		
		ob.add(1);
		ob.add(2);ob.println();
		ob.add(3,4,5);ob.println();
		ob.addEdge(1, 2);ob.println();
		ob.addEdge(1, 3);ob.println();
		ob.addEdge(2, 4);ob.println();
		ob.addEdge(2, 5);
		ob.println();
	}
	private void println() {
		for (Iterator j = lis.iterator(); j.hasNext();) {
			Node node = (Node) j.next();
			System.out.println(node);
		}
		System.out.println();
	}
	private void addEdge(int i, int j) {
		lis.get(i-1).next = j;
	}
	private void add(int... a) {
		for (int i : a) {
			lis.add(new Node(i));
		}
	}
}
class Node{
	int value;
	int next;
	public Node(int v) {
		value = v;
	}
	@Override
	public String toString() {
		return value+": "+next;
	}
}