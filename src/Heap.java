
public class Heap {

	public Integer[] tree = new Integer[24];
	
	public int last = 0;
	
	public Heap() {
		
	}
	
	public void add(int number) {
	tree[last] = number;
	rearrange(last); 
	last++;
	}
	
	public void rearrange(int index) {
		int temp = tree[index]; 
		int parent = getParent(index); 
		if (tree[index]<tree[parent]) {
			tree[index] = tree[parent];
			tree[parent] = temp;
		}
		if (parent != 0) {
		rearrange(getParent(index));
		}
	}
	public void remove() {
		int x = 0; 
		while (tree[x+1] != null) {
			tree[x] = tree[x+1];
			x++;
		}
		tree[x] = null;
		rearrange(x-1);
		rearrange(x-3);
		last--; 
 	}

	public void print() {
		int x = 0;
		int y = 0; 
		while (tree[x]!= null) {
			for(int i=0; i<(Math.pow(2, y)); i++) {
				
				if (tree[x] == null) {
					 break;
				}	
				
				System.out.print(tree[x] + " ");
				 x++;
				 
			}
			System.out.println();
			y++;
		}
		System.out.println();
	}
	
	
	public int getLeftChild(int index) {
		return (index*2+1);
	}
	
	public int getRightChild(int index) {
		return (index*2+2);
	}
	
	public int getParent(int index) {
		return ((int)((index-1)/2));
	}
}

