import java.util.Arrays;

class Main 
{ 
  public void arraySwap(double[] inputArray, int loc1, int loc2) {
    try {
      double temp = inputArray[loc1];
      inputArray[loc1] = inputArray[loc2];
      inputArray[loc2] = temp;
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Error! arraySwapAny2: Swap locations invalid.");
      return;
    }
  }

    void sort(double arr[], long start, long end) //Gnome Sort
    { 
      int ix = 0; //index#
      while (ix < arr.length) {
        if (ix == 0) ix++;
        if (arr[ix] >= arr[ix -1]) ix++;
        else {
          arraySwap(arr, ix, ix-1);
          ix--;
        }
      }
    } 

  
    // Test program 
    public static void main(String args[]) 
    { 
        double arr[] = {10.0, 7.1, 8.6, 9.9, 1.8, 5.0}; 
        System.out.println("original array: "); 
        System.out.println(Arrays.toString(arr));
        
        // create a sorted version to test.
        double sortedArr[] = arr;
        Arrays.sort(sortedArr);
        System.out.println("sorted array: "); 
        System.out.println(Arrays.toString(sortedArr));
        
       
        Main sorter = new Main(); // create a sorter object
        sorter.sort(arr, 0, arr.length); // call the sort function
  
        System.out.println("*** your sorted array: "); 
        System.out.println(Arrays.toString(arr));
    } 
} 
