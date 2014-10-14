package linkedlist;

public class Node {
	int data;
	Node next;
	Node prev;
	void setData(int x) {
		this.data = x;
	}
	int getData() {
		return data;
	}
	Node getNext(){
		return this.next;
	}
	Node getPrev() {
		return this.prev;
	}
	void setNext(Node n) {
		this.next = n;
	}
	void setPrev(Node n) {
		this.prev = n;
	}
}
