import apcslib.*; //Imports the apcs library that allows for access to the paper and pencil class, with the Sketch Pad and DrawingTool objects
import java.awt.*; //Color
import java.util.Random; //used for color
import java.lang.*;

public class WarmupMethods{
    public void multTable(int size){

        for (int c = 1; c <= size; c++){ 
            for (int m = 1; m <= size; m++) {

                System.out.print(c * m);

            }
            System.out.print("\n");
        }

    }

    public void starTree(int lines) {
        int indent = 100; //starts indent with max of what it could be
        for (int level = 1; level <= lines; level++) { 
            for (int  i = indent; i > 0; i--){ //prints spaces until 0 reached
                System.out.print(" "); //prints spaces
            }
            indent --; //reduces indent for next line
            for (int s = (2 * level) + - 2; s >= 0; s--){
                System.out.print("*"); //prints the number of star based on current level
            }
            System.out.print("\n"); //goes to next line
        }
    }    

    public void colorWheel() {
        DrawingTool pen = new DrawingTool(new SketchPad(800, 800));
        for (int line = 0; line < 360; line++){
            Random rand = new Random();
            float red = rand.nextFloat();
            float green = rand.nextFloat();
            float blue = rand.nextFloat();
            Color randomColor = new Color(red, green, blue);
            pen.setColor(randomColor);

            pen.forward(200);
            pen.backward(200);
            pen.turnRight(1);
        }
    }

    public void makeSquare(int size){
        for (int stars = 0; stars < size; stars++){
            System.out.print("*");
            System.out.print("   ");
        }
        System.out.print("\n");
        for (int lines = 0; lines < (size - 2); lines++){
            System.out.print("*");
            for (int spaces = 0; spaces < (size); spaces++) {
                System.out.print("   ");
            }
            System.out.print("*");
            System.out.print("\n");
        }
        for (int stars = 0; stars < size; stars++){
            System.out.print("*");
            System.out.print("   ");
        }        
    }

    public void reverseString(String str){
        String newBackwardStr = "";
        
        for (int i = str.length(); i > 0; i--) {
            newBackwardStr += str.charAt(i -1);
        }    
     
        System.out.println(newBackwardStr);   
    }               
}
