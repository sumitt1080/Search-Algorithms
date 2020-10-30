public class BubbleSort {

    private static void sort(int[] arr){
        int length = arr.length;
        int tmp = 0;
         for(int i=0; i < length; i++){
                 for(int j=1; j < (length-i); j++){
                          if(arr[j-1] > arr[j]){
                                 //swap elements
                                 tmp = arr[j-1];
                                 arr[j-1] = arr[j];
                                 arr[j] = tmp;
                         }

                 }
         }
    }

    private static void print_array(int[] arr){
       for(int i=0; i < arr.length; i++){
           System.out.print(arr[i] + " ");
       }
       System.out.print("\n");
    }

    public static void main(String[] args) {
        int arr[] ={55, 22, 15, 6, 18, 180};

        System.out.println("Before...");
        print_array(arr);

        sort(arr);

        System.out.println("After...");
        print_array(arr);
    }
}
