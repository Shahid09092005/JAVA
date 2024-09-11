public class Insertion {

    public static void swap(int[] arr,int i,int j){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }

    //printing the array
    public static void printArray(int[] arr){
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        int n=arr.length;
        System.out.print("Before swaping ");
        printArray(arr);
        for(int i=1;i<n;i++){
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        System.out.print("After Insertion sort: ");
        printArray(arr);
    }
}
