package dsa;
public class PriorityQueue {
	private int n;
	private int arr[];
	private int items;
	public PriorityQueue() {
		n=5; 
		arr=new int [n];
		items=0; 
	}
	public void insert(int val) {
		int i=0;
		if(items==0) {
			arr[0]=val;
			items++;
			return;
		}
		for(i=items-1;i>=0;i--) {
			if(val<arr[i]) {
				arr[i+1]=arr[i];
			}else {
				break;
			}
		}
		arr[i+1]=val;
		items++;
	}
	public void display() {
		for(int i=0;i<items;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public int remove() {
		return arr[--items];
	}
	public int peek() {
		return arr[items-1];
	}
	public boolean isempty() {
		return items==0;
	}
	public static void main(String[] args) {
		PriorityQueue p =new PriorityQueue();
		p.insert(12);
		p.insert(2);
		p.insert(13);
		p.insert(0);
		p.display();

	}

}