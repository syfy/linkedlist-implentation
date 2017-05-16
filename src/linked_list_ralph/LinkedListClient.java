package linked_list_ralph;

public class LinkedListClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			LinkedList linkedList = new LinkedList(3);
			linkedList.addItem(2);
			linkedList.addItem(1);
			linkedList.find(9);
			linkedList.removeHead();
			System.out.println(linkedList.getLength());
	}

}
