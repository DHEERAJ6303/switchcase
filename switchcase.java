package switchcase;

import java.util.Scanner;

/**
 *
 * @author Dheeraj
 */
public class Switchcase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char input;
        System.out.println("enetr your choice a.hi ,b.hey, c.hello");
        Scanner s= new Scanner(System.in);
         
        input = s.next().charAt(0);
        switch(input)
        {
            case 'a' : System.out.println("you said hi");
                      break;
            case 'b' : System.out.println("you said hey");
                      break;
            case 'c' : System.out.println("you said hello");
                      break;
            default : System.out.println("you have entered an invalid statement");
        }
        
        
        
        
        
        
    }
    
}
