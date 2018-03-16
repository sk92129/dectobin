


class BubbleSort
{
    int outerloop = 0;
    int innerloop;
    void bubbleSort(int arr[])
    {


        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            outerloop++;
            System.out.println("i : "+ i);

            int end =  n - i - 1;
            System.out.println("j : 0 - " + end );
            for (int j = 0; j < end; j++) {
                System.out.println("inner loop");
                innerloop++;
                if (arr[j] > arr[j + 1]) {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /* Prints the array */
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver method to test above
    public static void main(String args[])
    {

        BubbleSort ob = new BubbleSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array");
        ob.printArray(arr);

        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
        System.out.println("Count of outerloop: "+ ob.outerloop);
        System.out.println("Count of inner loop: "+ ob.innerloop);
    }
}