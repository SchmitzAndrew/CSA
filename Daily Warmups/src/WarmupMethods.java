import apcslib.*; //Imports the apcs library that allows for access to the paper and pencil class, with the Sketch Pad and DrawingTool objects

import java.awt.*; //Color
import java.lang.*;
import java.util.*;


public class WarmupMethods {
    public void multTable(int size) {

        for (int c = 1; c <= size; c++) {
            for (int m = 1; m <= size; m++) {

                System.out.print(c * m);

            }
            System.out.print("\n");
        }

    }

    public void starTree(int lines) {
        int indent = 100; //starts indent with max of what it could be
        for (int level = 1; level <= lines; level++) {
            for (int i = indent; i > 0; i--) { //prints spaces until 0 reached
                System.out.print(" "); //prints spaces
            }
            indent--; //reduces indent for next line
            for (int s = (2 * level) + -2; s >= 0; s--) {
                System.out.print("*"); //prints the number of star based on current level
            }
            System.out.print("\n"); //goes to next line
        }
    }

    public void colorWheel() {
        DrawingTool pen = new DrawingTool(new SketchPad(800, 800));
        for (int line = 0; line < 360; line++) {
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

    public void makeSquare(int size) {
        for (int stars = 0; stars < size; stars++) {
            System.out.print("*");
            System.out.print("   ");
        }
        System.out.print("\n");
        for (int lines = 0; lines < (size - 2); lines++) {
            System.out.print("*");
            for (int spaces = 0; spaces < (size); spaces++) {
                System.out.print("   ");
            }
            System.out.print("*");
            System.out.print("\n");
        }
        for (int stars = 0; stars < size; stars++) {
            System.out.print("*");
            System.out.print("   ");
        }
    }

    public void reverseString(String str) {
        String newBackwardStr = "";

        for (int i = str.length(); i > 0; i--) {
            newBackwardStr += str.charAt(i - 1);
        }

        System.out.println(newBackwardStr);
    }

    public void changeCapital(String str) {
        String lowerString = str.toLowerCase().charAt(0) + str.substring(1);
        String upperString = str.toUpperCase().charAt(0) + str.substring(1);

        if (lowerString.equals(str)) {
            System.out.println("Here is the changed string:" + upperString);
        } else {
            System.out.println("Here is the changed string:" + lowerString);
        }
    }

    public String reverseWords(String str) {
        int startWord = 0;
        String word = "";
        if (str.length() == 0) {
            return word;
        } else if (str.indexOf(" ") == -1) {
            return str;
        } else {
            int endWord = str.indexOf(" ");
            word += reverseWords(str.substring(endWord + 1)) + " " + str.substring(startWord, endWord);
        }
        return word;
    }

    public String flipHalves(String str) {
        int half = str.length() / 2;
        String firstHalf = str.substring(0, half);
        String secondHalf = str.substring(half, str.length());
        return secondHalf + firstHalf;
    }

    public String flipThirds(String str) {
        return str.substring(str.length() / 3 * 2, str.length()) + str.substring(0, str.length() / 3);
    }

    public String printArray(int[] array) {
        if (array.length <= 10) {
            StringBuilder arrayString = new StringBuilder();
            for (int i = 0; i < array.length - 1; i++) {
                arrayString.append(array[i]).append(", ");
            }
            arrayString.append(array[array.length - 1]);
            return "Numbers in array:" + arrayString;
        } else {
            StringBuilder arrayString = new StringBuilder();
            for (int i = 0; i < 9; i++) {
                arrayString.append(array[i]).append(", ");
            }
            arrayString.append(array[10]);
            return "Numbers in array: " + arrayString + "\n" + printArray(Arrays.copyOfRange(array, 10, array.length));
        }
    }

    public double averageArray(int[] array2) {
        double sum = 0;
        double count = 0;
        for (int num : array2) {
            sum += num;
            count++;
        }
        return sum / count;
    }

    public int largestInArray(int[] array3) {
        int largest = array3[0];
        for (int i : array3) {
            if (i > largest) {
                largest = i;
            }
        }
        return largest;
    }

    public int smallestInArray(int[] array4) {
        int smallest = array4[0];
        for (int i : array4) {
            if (i < smallest) {
                smallest = i;
            }
        }
        return smallest;
    }

    public void swapPositions(int[] array5, int pos1, int pos2) {
        int firstInt = array5[pos1];
        int secondInt = array5[pos2];
        array5[pos1] = secondInt;
        array5[pos2] = firstInt;
    }

    public int checkForNeighbors(int[][] myMatrix, int cellRow, int cellCol) {
        int neighbors = 0;
        for (int row = cellRow - 1; row < cellRow + 2; row++) {
            for (int col = cellCol - 1; col < cellCol + 2; col++) {
                neighbors = neighbors + myMatrix[row][col];
            }
        }
        if (myMatrix[cellRow][cellCol] == 1) {
            neighbors = neighbors - 1;
        }
        return neighbors;
    }

    public void arrayTransferList(int[] myArray, ArrayList<Integer> myArrayList) {
        for (int i = 0; i < myArray.length; i++) {
            myArrayList.add(myArray[i]);
        }
    }

    public int[] mergeIt(int[] mergeArray1, int[] mergeArray2) {
        int[] intArray = new int[mergeArray1.length + mergeArray2.length];
        int count = 0;
        int index1 = 0;
        int index2 = 1;
        while (count < intArray.length) {
            if ((index2 == mergeArray2.length) || ((index1 != mergeArray1.length) && (mergeArray1[index1] <= mergeArray2[index2]))) {
                intArray[count] = mergeArray1[index1++];
            } else {
                intArray[count] = mergeArray2[index2++];
            }
            count++;
        }
        return intArray;
    }
}
    




