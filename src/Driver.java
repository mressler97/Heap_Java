
/*
 * Michael Ressler
 * Java
 * Heap Assignment
 */

public class Driver {
	public static void main(String [] args) {
		Heap heap = new Heap();
		heap.add(15);
		heap.add(5);
		heap.add(8);
		heap.add(4);
		heap.add(9);
		heap.add(22);
		heap.add(17);
		heap.add(6);
		heap.add(14);
		heap.print();
		
		heap.remove(); 
		heap.remove();
		heap.print(); 
		
		heap.add(18);
		heap.add(12);
		heap.print();
		
		heap.remove();
		heap.remove();
		heap.remove();
		heap.print();
		
	}
}
