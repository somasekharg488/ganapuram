package javaprograms;

public class ReverseStringwithspace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="somasekhar how r u";
		
		
		String[] words=str.split(" ");
		String reverse=" ";
		for(int i=0;i<words.length;i++) {
			
			String x=words[i];
			String reword="";
			
			for(int j=x.length()-1;j>=0;j--) {
				reword=reword+x.charAt(j);
				
			}
			reverse=reverse+reword+" ";
		}
		System.out.println(reverse);
		

	}

}
