package array;
import java.util.Scanner;

public class Array_1D {
	
	public static void main(String[] args) {
		int array[]= {1,2,3,4,5};
		int size=array.length;
		Scanner scan= new Scanner(System.in);
		System.out.println("Orginal array :");
		for(int i:array)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Enter the element to search: ");
		int element = scan.nextInt();
		int value=search(array,element,size);
			if(value!=-1) 
			{
				System.out.println("presented");
			}
			else
			{
				System.out.println("not presented");
			}
		System.out.println("Enter the Element to delete: ");
		element = scan.nextInt();
		size=delete(array,size,element);
		printArr(array,size);
		System.out.println();
		System.out.println("Enter the element to search: ");
		element = scan.nextInt();
		value=search(array,element,size);
			if(value!=-1) 
			{
				System.out.println("presented");
			}
			else
			{
				System.out.println("not presented");
			}
			System.out.println("Enter no of elements to add: ");
			int len=scan.nextInt();
			System.out.println("Enter the index position: ");
			int index=scan.nextInt();
		array=insertar(len,array,size,index);
		size=size+len;
		printArr(array,size);
		System.out.println();
		System.out.println("Enter the Element to delete: ");
		element = scan.nextInt();
		size=delete(array,size,element);
		printArr(array,size);	
		scan.close();
	}
	public static int []insertar(int len,int array[],int size,int index)
	{
		Scanner scan = new Scanner(System.in);
		int newarr[]=new int [size+len];
		for(int i=0;i<index;i++)
		{
			newarr[i]=array[i];
		}
		for(int i=index;i<index+len;i++)
		{
			System.out.println("Enter the element: ");
			newarr[i]=scan.nextInt();
		}
		for(int i=index+len;i<size+len;i++)
		{
			newarr[i]=array[i-len];
		}
		scan.close();
		return newarr;
	}
	static void  printArr(int array[],int size)
	{
		for(int i=0;i<size;i++)
		{
			System.out.print(array[i]+ " ");
		}
	}

	public static int delete(int array[],int size,int element)
	{
		int index = search(array,element,size);
		if(index!=-1) {
		for(int i =index;i<size-1;i++)
		{
			array[i]=array[i+1];
		}
		return size-1;
		}
		return size;
	}
	public static int search(int array[],int element,int size){
		for(int i=0;i<size;i++)
		{
			if(element==array[i])
			{
				return i;
			}
		}
		return -1;
	}

}
