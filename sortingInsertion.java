public class sortingInsertion {
    
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length;i++)
        System.out.print(arr[i] + " ");
    }
    public static void main(String[] args){
        int arr[]={7,8,3,1,2};
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j< arr.length; j++){
                if( arr[j] < arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i]= temp;
                }
            }
        }
        //complex loop
        // for(int i = 0; i < arr.length; i++){
        //     int j = i-1;
        //     int current = arr[i];
        //     while( j  >=0 && current < arr[j]){
        //         arr[j+1] = arr[j];
        //         j--;
        //     }
        //     arr[j+1] = current;
        // }   
        printArray(arr);
    }
}
