import chn.util.*;
import apcslib.*;

public class Tree{
    public static void main(String[] args){
    
    ConsoleIO console = new ConsoleIO();
    
    int size = console.readInt();
    
    System.out.println(Format.right("*", size + 1));
    for(int cnt = size; cnt > 1; cnt--) {
        System.out.println(Format.right("*",cnt) + Format.right("*",((size+1)-cnt)*2));
    }
    for (int cnt = (size*2)+1; cnt > 0; cnt--) {
        System.out.print("*");
    }
  }
}