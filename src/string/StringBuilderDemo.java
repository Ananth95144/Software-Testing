package string;

public class StringBuilderDemo {

	public static void main(String[] args) {

		StringBuilder sb1=new StringBuilder("Ananth");
		System.out.println(sb1);
		sb1.append(" trainer");
		System.out.println(sb1);
		sb1.insert(7, "___");
		System.out.println(sb1);
		sb1.replace(6, 14, " ");
		System.out.println(sb1);
		sb1.delete(6, 14);
		System.out.println(sb1);
		sb1.reverse();
		System.out.println(sb1);
		sb1.setCharAt(0,'a');
		System.out.println(sb1);
		String str=sb1.toString();
		System.out.println(str);
	}

}
