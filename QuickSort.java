package programs.array;

class QuickSort
{
 /* This method takes last element as pivot,
    places the pivot element at its correct
    position in sorted array, and places all
    smaller (smaller than pivot) to left of
    pivot and all greater elements to right
    of pivot */
 int partition(int arr[], int low, int high)
 {
     int pivot = arr[high]; //last element as pivot
     int i = (low-1); // index of smaller element
     for (int j=low; j<high; j++)
     {
         // If current element is smaller than or equal to pivot
         if (arr[j] <= pivot)
         {
             i++;

             // swap arr[i] and arr[j]
             int temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;
         }
     }
     
     i++;

     // swap arr[i] and arr[high] (swap with pivot)
     int temp = arr[i];
     arr[i] = arr[high];
     arr[high] = temp;

     return i; //pivot Index
 }


 /* The method that implements QuickSort()
   arr[] --> Array to be sorted,
   low  --> Starting index,
   high  --> Ending index */
 void sort(int arr[], int low, int high)
 {
     if (low < high)
     {
         // pivotIndex is partitioning index 
         int pivotIndex = partition(arr, low, high);

         // Recursively sort elements before
         // partition and after partition
         sort(arr, low, pivotIndex-1);
         sort(arr, pivotIndex+1, high);
     }
 }

 static void printArray(int arr[])
 {
     for (int i=0; i<arr.length; ++i)
         System.out.print(arr[i]+" ");
     System.out.println();
 }

 public static void main(String args[])
 {
     int arr[] = {3, 1, 5, 4, 2};
     int n = arr.length;

     System.out.println("Unsorted array");
     printArray(arr);
     
     QuickSort ob = new QuickSort();
     ob.sort(arr, 0, n-1);

     System.out.println("sorted array");
     printArray(arr);
 }
}