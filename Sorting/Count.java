public class Count {

    //finding max element in the array
    public static int maxElement(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int x:arr){
            if(x>max){
                max=x;
            }
        }
        return max;
    }

    //freq. of array
    public static int[] freq(int[] arr,int max){
        int[] temp=new int[max+1];
        for(int i=0;i<arr.length;i++){
            temp[arr[i]]++;
        }
        return temp;
    }

    //printing the array
    public static void printArray(int[] arr){
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={7,5,4,1,6,6,3,2,2,5,1,6,8,3,6,3,8,3};
        System.out.print("Before swaping ");
        printArray(arr);
        int max=maxElement(arr);
        System.out.println("Maximum element in the above array: "+max);
        //auxilary space 
        int[] temp=freq(arr, max);
        System.out.print("Frequency array: ");
        printArray(temp);
        int j=0;
        for(int i=0;i<temp.length;i++){
            while(temp[i]>0){
                arr[j]=i;
                j++;
                temp[i]--;
            }
        }
        System.out.print("After Counting sort: ");
        printArray(arr);
        
    }
    
}
