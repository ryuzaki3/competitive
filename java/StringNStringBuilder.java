
import java.util.Scanner;

public class StringNStringBuilder {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
	//	boolean x=ispalindrome("ababa");
	//	System.out.println(x);
	//	String str=modify1("baderg");
	//	System.out.println(str);
		
//		String str=toggleCase("AbCd#");
//		System.out.println(str);
		
	//	System.out.println((int));
		
//		String str=modify2("adzx");
//		System.out.println(str);
		
		String str=compress1("abcdd");
		System.out.println(str);
		
		 str=compress2("aaabbcdd");
		System.out.println(str);
	}
	
	public static boolean ispalindrome(String str){
		for(int i=0, j=str.length()-1; i<=j; i++, j--){
			if(str.charAt(i)!=str.charAt(j)){
				return false;
			}
		}
		return true;
	}

	public static String toggleCase(String str){
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=0; i<str.length(); i++){
			
			char ch=str.charAt(i);
			
			if(ch>='A' && ch<='Z'){
				char charAdd=(char)(str.charAt(i)+('a'-'A'));
				sb.append(charAdd+"");
			}
			else if(ch>='a' && ch<='z'){
				char charAdd=(char)(str.charAt(i)-('a'-'A'));
				sb.append(charAdd+"");
			}
			else
				sb.append(str.charAt(i)+"");
		}
		
		return sb.toString();
		
	}
	
	public static String modify1(String str){
		
		StringBuilder sb=new StringBuilder("");
		
		for(int i=0; i<str.length(); i++){
			if(i%2==0){
				
				int chval=str.charAt(i)-1;
				char ch=(char)chval;
				sb.append(ch + "");
			}
			else{
				int chval=str.charAt(i)+1;
				char ch=(char)chval;
				sb.append(ch + "");
			}
		}
		
		return sb.toString();
		
	}
	
	public static String modify2(String str){
		
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<str.length()-1; i++){
			char ch=str.charAt(i);
			char chNext=str.charAt(i+1);
			int diffnum=chNext-ch;
			
			sb.append(ch+"");
			sb.append(diffnum+"");
		}
		char lastchar=str.charAt(str.length()-1);
		sb.append(lastchar+"");
		
		return sb.toString();
		
	}
	
	public static String compress1(String str){
		
		StringBuilder sb=new StringBuilder();
		int i=0;
		while(i<str.length()){
			char ch=str.charAt(i);
			sb.append(ch+"");
			for(int j=i; j<str.length(); j++){
				if(ch==str.charAt(j)){
					i++;
				}
				else{
					break;
				}
			}
		}
		return sb.toString();
	}

	public static String compress2(String str){
		
		StringBuilder sb=new StringBuilder();
		int i=0;
		while(i<str.length()){
			int count=0;
			char ch=str.charAt(i);
			sb.append(ch+"");
			for(int j=i; j<str.length(); j++){
				if(ch==str.charAt(j)){
					count++;
					i++;
				}
				else{
					break;
				}
			}
			sb.append(count+"");
		}
		return sb.toString();
	}
}

