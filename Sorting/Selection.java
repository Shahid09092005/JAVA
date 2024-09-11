public class Selection {

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
        int s=0;
        System.out.print("Before swaping ");
        printArray(arr);
        for(int i=0;i<n-1;i++){
            int pos=i;
            for(int j=i+1;j<n;j++){
                if(arr[pos]>arr[j]){
                    pos=j; 
                }
            }
            swap(arr,i,pos);
            s++;
        }
        System.out.print("After Selection sort: ");
        printArray(arr);
        System.out.println("Swap: "+s);
    }
    
}
