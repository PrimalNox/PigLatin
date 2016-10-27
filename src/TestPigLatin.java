import java.io.*;
import java.util.*;
import java.lang.Math;
public class TestPigLatin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbReader = new Scanner(System.in);
		System.out.println("Enter your sentence: ");
		String ini = kbReader.nextLine();
		String fin = PigLatin.translate(ini);
		System.out.println(fin);
	}

}
