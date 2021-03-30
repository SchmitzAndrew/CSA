import java.util.*;

/**
 * Description of the Class
 *
 * @author Your Name Here
 * @created Month Day, Year
 */
public class Sorts {
    private long steps;

    /**
     * Description of Constructor
     */
    Sorts() {
        steps = 0;
    }

    /**
     * Description of the Method
     *
     * @param list reference to an array of integers to be sorted
     */
    public void bubbleSort(int[] list) {
        steps++; //creates for loop
        for (int outer = 0; outer < list.length - 1; outer++) {
            // 1) checks the outer loop 2) increments the outer 3) creates the inner loop
            steps += 3;
            for (int inner = 0; inner < list.length - outer - 1; inner++) {
                steps += 3;
                // 1)checks the inner loop 2) increments the inner variable 3)Does the compariason within the if statement
                if (list[inner] > list[inner + 1]) {

                    int temp = list[inner];
                    list[inner] = list[inner + 1];
                    list[inner + 1] = temp;
                    //swap list[inner] & list[inner+1]
                    steps += 3;
                }
            }
        }
    }


    /**
     * Description of the Method
     *
     * @param list reference to an array of integers to be sorted
     */
    public void selectionSort(int[] list) {
        int min, temp;
        steps += 1; //creates the for loop
        for (int outer = 0; outer < list.length - 1; outer++) {
            min = outer;
            for (int inner = outer + 1; inner < list.length; inner++) {
                if (list[inner] < list[min]) {
                    min = inner;
                }
                steps += 3; //1) Increments 1, 2)Checks whether or not it is greater 3)
            }

            //swap list[outer] & list[flag]
            temp = list[outer];
            list[outer] = list[min];
            list[min] = temp;
            steps += 3;
        }
    }

    /**
     * Description of the Method
     *
     * @param list reference to an array of integers to be sorted
     */
    public void insertionSort(int[] list) {
        int min, temp;
        steps += 1; //Creates the for loop
        for (int outer = 0; outer < list.length - 1; outer++) {
            min = outer;
            steps += 3; //1) Checks the boundary of outer loop 2) Increments the var 3) Initializes inner loop
            for (int inner = outer + 1; inner < list.length; inner++) {
                steps += 3; // 1)Bounday check 2) Incrememnets inner 3) Comparison
                if (list[inner] < list[min]) {
                    min = inner;
                }
            }


            //swap list[outer] & list[flag]
            temp = list[outer];
            list[outer] = list[min];
            list[min] = temp;
            steps += 3; //adds one for each action
        }
    }


    /**
     * Takes in entire vector, but will merge the following sections
     * together:  Left sublist from a[first]..a[mid], right sublist from
     * a[mid+1]..a[last].  Precondition:  each sublist is already in
     * ascending order
     *
     * @param a     reference to an array of integers to be sorted
     * @param first starting index of range of values to be sorted
     * @param mid   midpoint index of range of values to be sorted
     * @param last  last index of range of values to be sorted
     */
    private void merge(int[] a, int first, int mid, int last) {

    }

    /**
     * Recursive mergesort of an array of integers
     *
     * @param a     reference to an array of integers to be sorted
     * @param first starting index of range of values to be sorted
     * @param last  ending index of range of values to be sorted
     */
    public void mergeSort(int[] a, int first, int last) {

      int temp = 0;
			int midpoint = 0;
//  Recursively divides a list in half, over and over.  When the
//  sublist has one or two values, stop subdividing.
            if (a[first] == a[last]){
                ;
            }
            }else if ((last -first) == 1){
                if ((a[first] > a[last])){
                    temp = a[first];
                    a[first] = a[last];
										a[last] = temp;
                }
            }else{   // recursion, divide list into two halves
            //Find midpoint of current sublist
						midpoint  = a.length / 2;
            //Call mergeSort and process left sublist
						mergesort(a, 0 , midpoint)
            //Call mergeSort and process right sublist
						mergesort(a, midpoint + 1 , a.length)
            //merge left and right sublists
						merge(a, )
        }
    }

    /**
     * Recursive quicksort of an array of integers
     *
     * @param a     reference to an array of integers to be sorted
     * @param first starting index of range of values to be sorted
     * @param last  ending index of range of values to be sorted
     */
    public void quickSort(int[] a, int first, int last) {
        // Replace these lines with your code
        System.out.println();
        System.out.println("Quicksort");
        System.out.println();
    }

    /**
     * Accessor method to return the current value of steps
     */
    public long getStepCount() {
        return steps;
    }

    /**
     * Modifier method to set or reset the step count. Usually called
     * prior to invocation of a sort method.
     *
     * @param stepCount value assigned to steps
     */
    public void setStepCount(int stepCount) {
        steps = stepCount;
    }
}