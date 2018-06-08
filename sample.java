
import java.util.*;
public class sample {
public static void main(String[] args) 
{
Scanner input=new Scanner(System.in);
int x=1;
do
{try
{
	System.out.println("enter first no: ");
	int n1=input.nextInt();
	System.out.println("enter second no: ");
    int n2=input.nextInt();
    int number=n1/n2;
    System.out.println(number);
}
catch(Exception e)
{
	  System.out.println("Arithmetic exception");
	}
   }while(x==1);

	}
}
