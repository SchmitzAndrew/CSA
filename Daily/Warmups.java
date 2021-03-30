import chn.util.*;
public class Warmups{
    public static void main(String[] args){
        ConsoleIO console = new ConsoleIO();
        double numa, numb;
        boolean done = false;

        WarmupMethods warmup = new WarmupMethods();
        while (!done) {     
            System.out.println("\n\t1- Multipication Table");
            System.out.println("\n\t2- Star plot");
            System.out.println("\n\t3- Color Wheel");
            System.out.println("\n\t4- Make Square");
            System.out.println("\n\t5- Reverse String");
            

            System.out.println("Which warmup would you like to do?");
            int warmupSelection = console.readInt();

            final int MULTTABLE = 1;
            final int STARTREE = 2;
            final int COLORWHEEL = 3;
            final int MAKESQUARE = 4;
            final int REVERSESTRING = 5;
            
            switch(warmupSelection){
                case MULTTABLE:
                System.out.println("Enter the size of the multtable");
                warmup.multTable(console.readInt());
                break;

                case STARTREE:
                System.out.println("Enter the size of the startree");
                warmup.starTree(console.readInt());
                break;

                case COLORWHEEL:
                warmup.colorWheel(); 
                break;

                case MAKESQUARE:
                System.out.println("Enter the size of the square");
                warmup.makeSquare(console.readInt());
                break;
                
                case REVERSESTRING:
                System.out.println("Enter the string");
                warmup.reverseString(console.readLine());
                break;
                
                default:
                System.out.println("Not a valid response- end input");
                break;
            }    

            System.out.println("Do you wish to continue doing warmups?");
            String statusStr = console.readToken(); 
            if (statusStr.charAt(0) == 'n' || statusStr.charAt(0) == 'n') {
                done = true;
                System.out.println("Warmups are done"); 
            }
        }
    }
}    