public class Bubble {
    //swaping j and j+1;
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
        printArray(arr);
        int s=0;
        System.out.print("Before swaping ");
        //Bubble sort code
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1); //swapping 
                    s++;
                    }
                }
            }
            System.out.print("After Bubble sort ");
            printArray(arr);
            System.out.println("Swap: "+s);
        }
        
    }