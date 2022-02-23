package email;
import java.util.Scanner;

public class emailvalidation {

	public static void main(String[] args) {
		String n;
		String array[]= {"ritu@gmail.com","aman@gmail.com","rakesh@gmail.com","madhavi@yahoo.com","nilam@yhoo.com"};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your correct Email:");
		n=sc.next();
		if(array[0].equals(n)){
			System.out.println("User Authenticated");	
		}
		else if(array[1].equals(n))
		{
			System.out.println("User Authenticated");
		}
		else if(array[2].equals(n))
		{
			System.out.println("User Authenticated");
		}
		else if(array[3].equals(n))
		{
			System.out.println("User Authenticated");
		}
		else if(array[4].equals(n))
		{
			System.out.println("User Authenticated");
		}
		
		else
		{
			System.out.println("User is not Authenticated");
		}	
	}


		

	}


