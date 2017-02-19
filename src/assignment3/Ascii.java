      // VLAUE TO CHARACTER
package assignment3;
import java.util.Scanner;
public class Ascii {

	public static void main(String[] args) {
		/* CHARACTER CORRESPOND TO NUMBER*/
		char c;
			System.out.println("enter the character");
					
		Scanner obj =new Scanner(System.in);
		c=obj.next().charAt(0);
			
		
			int d=c;
			/* NO CORRESPOND TO CHARACTER*/
			System.out.println("no correspond to character is " +d) ;
		
					System.out.println("enter the number");
					int a=obj.nextInt();
					char b;
					// TYPE CASTING VALUE OF INT TO CHAR
					b=(char)a;
					System.out.println("character corresponding to your no is "  +b);
					for(int i=65;i<=90;i++){
						//TYPE CASTING
					char y=(char)i;
						
						System.out.println(y +"-" + i);
					}

	}

}
