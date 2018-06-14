import java.util.Scanner;

public class StringConvertIntegerThanMax {
	
    public static void main(String args[]){
    	
    	try
    	{
    		Scanner sl = new Scanner(System.in);
            System.out.println( "Enter two strings which will be converted into numbers ");
            String s1 = sl.nextLine();
            String s2 = sl.nextLine();
            int x = Integer.parseInt(s1);//FOR CONVERSION OF STRING INTO INTEGER...
            int y = Integer.parseInt(s2);
            sl.close();
            if(x>y)
                System.out.println(x + " is maximum ");
            else
                System.out.println(y + " is maximum ");
    	
    	}
    	
    	catch (Exception e)    //TO CATCH ALL EXCEPTIONS.........................................
    	{
    	System.out.println("WRONG INPUT ENTERED "+e.getMessage());
    	}
    	/*
    	 * I HAVE USED EXCEPTION HANDLING IF USER ENTERS WRONG INPUT LIKE FLOAT :-)  ...
    	 */
	
    }
}
