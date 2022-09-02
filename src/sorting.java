public class sorting {
    public static void main(String[] args) {
        int array [] = {3 , 6, 2 , 1 , 8 , 7 , 4 , 5 , 3 , 1 };
      bubbleSort(array);
       printArray(array);
      //  System.out.println(reverse(array));
      //  printArray(array);
    }
     public static void bubbleSort(int arrays[]) {
        for ( int i = 0 ; i < arrays.length - 1 ; i++) {
            for ( int j = 0 ; j < arrays.length - 1 -i ;j++ ){
                if (arrays[j] < arrays[j+1] ) {
                    int temp = arrays[j];
                    arrays[j]= arrays[j+1];
                    arrays[j+1] = temp;

                }
            }
        }
     }
    public static void printArray (int arrays[]) {
        for ( int i = 0 ; i < arrays.length ; i++){
            System.out.print(arrays[i]);


        }
    }
        //public static void printArray(int arrays []) {
     //   for ( int i = 0 ; i < arrays.length ; i++){
       //     System.out.println(arrays);
        //} while (first < last) {
    //            int temp = first;
    //            first = last;
    //            last = first;
        //}
     }

