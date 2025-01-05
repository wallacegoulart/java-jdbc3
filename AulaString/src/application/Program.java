package application;

public class Program {

	public static void main(String[] args) {
		
		String original = "abcbd  HFGHHJ adbm AHSH bcahsd    ";
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(4,12);
		String s05 = original.replace('a', 'X');
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		
		String s = "potato apple lemon orange";
		String[] vect = s.split(" ");
		
		System.out.println("Original: - "+original + " - ");
		System.out.println("toLowCase: - "+s01 + " - ");
		System.out.println("toUpperCase: - "+s02 + " - ");
		System.out.println("trim: - "+s03 + " - ");
		System.out.println("Substring: - "+s04 + " - ");
		System.out.println("replace: - "+s05+" - ");
		System.out.println("Index of bc: - "+i);
		System.out.println("LastIndex of bc: - "+j);
		
		System.out.println();
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);
	}

}
