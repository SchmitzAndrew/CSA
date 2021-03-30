import chn.util.*;

public class PreTest{
    public static void main(String[] args) {
        System.out.println("Input a word:");
        
        ConsoleIO console = new ConsoleIO();
        
        String word = console.readLine();
        
        char firstChar  = word.charAt(0);
        
        int asciiOne = (int) firstChar;
        
        System.out.println("The first character in the word" + word + "has and ACII valuie of: " + asciiOne);
    }  
}        