import chn.util.*;
import java.util.*;
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
            System.out.println("\n\t6- Change Capital");
            System.out.println("\n\t7- Reverse Words");
            System.out.println("\n\t8- Flip Halves");
            System.out.println("\n\t9- Flip Thirds");
            System.out.println("\n\t10- Print Array");
            System.out.println("\n\t11- Average Array");
            System.out.println("\n\t12- Largest In Array");
            System.out.println("\n\t13- Smallest In Array");
            System.out.println("\n\t14- Swap Two Values in Array");
            System.out.println("\n\t15- Bio Matrix");
            System.out.println("\n\t16- Transfer Array");
            System.out.println("\n\t17- Merge Array")

            System.out.println("Which warmup would you like to do?");
            int warmupSelection = console.readInt();

            final int MULTTABLE = 1;
            final int STARTREE = 2;
            final int COLORWHEEL = 3;
            final int MAKESQUARE = 4;
            final int REVERSESTRING = 5;
            final int CHANGECAPITAL = 6;
            final int REVERSEWORDS = 7;
            final int FLIPHAVES = 8;
            final int FLIPTHIRDS = 9;
            final int PRINTARRAY = 10;
            final int AVERAGEARRAY = 11;
            final int LARGESTINARRAY = 12;
            final int SMALLESTINARRAY = 13;
            final int SWAPARRAY = 14;
            final int BIOMATRIX = 15;
            final int ARRAYTRANSFER = 16;
            final int MERGEARRAY = 17;

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

                case CHANGECAPITAL:
                    System.out.println("Enter the string to change the capitalization of:");
                    warmup.changeCapital(console.readLine());
                    break;

                case REVERSEWORDS:
                    System.out.println("Put a sentence in reverse?");
                    System.out.print(warmup.reverseWords(console.readLine()));
                    break;

                case FLIPHAVES:
                    System.out.println("Enter the string you would like to switch haves with");
                    System.out.println(warmup.flipHalves(console.readLine()));
                    break;

                case FLIPTHIRDS:
                    System.out.println("Enter the string you would like to switch thirds of");
                    System.out.println(warmup.flipThirds(console.readLine()));
                    break;

                case PRINTARRAY:
                    System.out.println("This program prints an array. :)");
                    int[] intArray = {0, 6, 13, 0, 0, 76, 33, 0, 0, 0, 4, 29, 21, 0, 86, 0, 32, 66, 0, 0, 0, 6, 13, 0, 0, 76, 33, 0, 0, 0, 4, 29, 21, 0, 86, 0, 32, 66, 0, 0};
                    System.out.println(warmup.printArray(intArray));
                    break;

                case AVERAGEARRAY:
                    System.out.println("This program averages an array. ");
                    int[] intArray2 = {6, 13, 76, 33, 4, 29, 21, 86, 32, 66};
                    System.out.println(warmup.printArray(intArray2));
                    System.out.println("Average of array is: " + warmup.averageArray(intArray2));
                    break;

                case LARGESTINARRAY:
                    System.out.println("This program finds the largest value in an aray.");
                    int[] intArray3 = {0, 6, 13, 0, 0, 76, 33, 0, 0, 0, 4, 29, 21, 0, 86, 0, 32, 66,0, 0};
                    System.out.println("The largest number in the array is: " + warmup.largestInArray(intArray3));
                    break;

                case SMALLESTINARRAY:
                    System.out.println("This program finds the smallest value in an aray.");
                    int[] intArray4 = {0, 6, 13, 0, 0, 76, 33, 0, 0, 0, 4, 29, 21, 0, 86, 0, 32, 66,0, 0};
                    System.out.println("The smallest number in the array is: " + warmup.smallestInArray(intArray4));
                    break;

                case SWAPARRAY:
                    System.out.println("This program swaops two values in an array");
                    int[] intArray5 = {3, 5, 2, 34, 23, 9};
                    System.out.println(warmup.printArray(intArray5));
                    warmup.swapPositions(intArray5, 1, 3);
                    System.out.println(warmup.printArray(intArray5));
                    break;

                case BIOMATRIX:
                    System.out.println("This program checks for neighbors in a matrix");
                    int[][] bioMatrix = { {0, 0, 0,0}, {1, 0, 1, 1}, {1, 1, 1, 1}, {0, 1, 1, 0}};
                    int neighbor = warmup.checkForNeighbors(bioMatrix, 2, 2);
                    System.out.println("Number of Nieghbors in matrix = " + neighbor);
                    break;

                case ARRAYTRANSFER:
                    System.out.println("This program transfers values in a array from an array to an array list");
                    int[] intArray6 = {3, 5, 2, 34, 23, 9};
                    ArrayList<Integer> myArrayList = new ArrayList<Integer>();
                    warmup.printArray(intArray6);
                    warmup.arrayTransferList(intArray6, myArrayList);
                    System.out.println("\n\nNumbers in arrayList: " + myArrayList);
                    System.out.println("\n\nThe array transfer method is done");
                    break;

                case MERGEARRAY:
                    System.out.println("This program merges two arrays into one.");
                    int[] mergeArray1 = {3, 6, 9, 12, 15, 18, 21};
                    int[] mergeArray2 = {4, 8, 11, 14, 17, 20, 24};
                    int[] resultMergeArray = warmup.mergeIt(mergeArray1, mergeArray2);

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
