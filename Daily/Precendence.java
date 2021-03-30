
import chn.util.*;

public class Precendence {
    public static void main(String[] args) {
    
        ConsoleIO console = new ConsoleIO();
        
        int num = console.readInt();
        
        System.out.println("\nnum = " + num + " ++num = " + (++num));
        System.out.println("num =" + num + "--num =" +(--num));
        System.out.println("\nnum = "+ num + "num++ =" + (num++));
        System.out.println("num = " + num + "num--= " + (num--));
    }
}
