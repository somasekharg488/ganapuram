package javaprograms;

public class Stringlength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	How to find out the part of the string from a string
		 String str = "sampleString";
	      int i = 0;
	      for(char c: str.toCharArray()) {
	         i++;
	      }
	      System.out.println("Length of the given string ::"+i);

	}

}
