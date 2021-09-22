package util;

import java.io.InputStream;

public class Scanner {

	public Scanner(InputStream in) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		  
        // String input
        String name = sc.nextLine();
  
        // Character input
        char gender = sc.next().charAt(0);
  
        // Numerical data input
        // byte, short and float can be read
        // using similar-named functions.
        int age = sc.nextInt();
        long mobileNo = sc.nextLong();
        double cgpa = sc.nextDouble();
  
        // Print the values to check if the input was correctly obtained.
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
        System.out.println("Mobile Number: "+mobileNo);
        System.out.println("CGPA: "+cgpa);

	}

	private String nextLine() {
		// TODO Auto-generated method stub
		return null;
	}

	private String next() {
		// TODO Auto-generated method stub
		return null;
	}

	private int nextInt() {
		// TODO Auto-generated method stub
		return 0;
	}

	private double nextDouble() {
		// TODO Auto-generated method stub
		return 0;
	}

	private long nextLong() {
		// TODO Auto-generated method stub
		return 0;
	}

}
