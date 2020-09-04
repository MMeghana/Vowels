package pkg1;
import java.util.*;
public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 0,d = 0;
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the word: ");
		String n = ob.nextLine();
		int l = n.length();
		String s = n.toLowerCase();
		for(int i=0;i<=l-1;i++)
		{
			char ch = s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				System.out.println("vowels   : "+ch+"\t");
				System.out.println("Position : "+(i+1)+"\t");
				c++;
			}
			else
			{
				System.out.println("Consnants :"+ch);
				System.out.println("Position  :"+(i+1));
				d++;
			}
		}
		System.out.println("Number of Vowels     : "+c);
		System.out.println("Number of Consonants : "+d);
		
	}

}
