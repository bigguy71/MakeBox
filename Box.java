import java.util.Scanner;



/**
 *
 * @author roger
 */
public class Box 
{
    public static String numGood = "no";
    public static int num;
    
    public static void main(String[]args)
    {
       do{
        Scanner Digit = Screen.getInput("Enter a positive odd number greater than zero and less than 20");
        num = Digit.nextInt();  
        doFunction(num);
        //System.out.println("doJob is "+numGood);
       
       } 
        while(numGood == "no");
       
       while(numGood == "yes")
        {
        if (num ==-1 ) break;
       //int num2;
        //if (questionNumber( num))
        //{
            switch(num)
            {
                    
                case 5, 11, 15:
                System.out.println(drawSquare(num));
                numGood = "no";
                break;
                
                case 3, 9, 17:
                System.out.println(drawBox(num));
                numGood = "no";
                break;
                
                default:
                     numGood = "no";
                    System.out.println("To be determined");
                    
                    
           // }
             }        
        
      //um = -1;
               
        }
       
        
    }
    
    public static String doFunction(int num)
    {
        if (num == -1)
        {
            numGood = "yes";
            return numGood;
        }
        if (num == 0 )
        {
            numGood = "no";
            return numGood;
        }
        
        if (num < 20 && num > 0)
        {
            if (num%2 == 0)
            {
            numGood = "no";
            return numGood;
            }
            
            numGood = "yes";
            return numGood;
        }
      
        return numGood = "no";
    }
    
    private static boolean questionNumber(int num )
    {
        if ( num < 20 && num > 0)
        {
            return true;
        }    
        
        return false;
    }
    
    public static String drawSquare(int width)
    {
        String result = "";
        int i = 0;
//        while (i < width)
//        {
//            int j = 0;
//            while (j < width)
//            {
//                result += " *";
//                j++;
//            }
//            i++;
//            result += "\n";
//        }
        for (i = 0; i< width; i++)
        {
           int j = 0;
           for ( j = 0; j < width; j++)
           {
               result +=" *";
           }
           result +="\n";
        }
         
        return result;
       
        
    }  
    
    public static String drawBox(int width)
    {
        String result = "";
        int i = 0;
        while( i < width)
        {
            int j = 0;
            while (j < width)
            {
                if (i == 0 || i == width-1) result += " *";
                else {
                        if (j == 0) result += " *";
                        else if (j == width-1) result += " *";
                        else result +="  ";
                        
                     }
                j++;
            }
            i++;
            result +="\n";
        }
        return result;
    }
  
   
    
}
