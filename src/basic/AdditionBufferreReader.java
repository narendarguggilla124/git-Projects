package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdditionBufferreReader {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int a,b,c;
		BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter two numbers:");
		a=Integer.parseInt(r.readLine());
		b=Integer.parseInt(r.readLine());
		c=a+b;
		System.out.println("Addition :"+c);

	}

}
