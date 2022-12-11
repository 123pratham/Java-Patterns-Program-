import java.util.Arrays;
import java.util.Scanner;

public class binaryser {
    void Binary(int arr[],int key){
        Arrays.sort(arr);
        int low = 0;
        int mid;
        int high = arr.length-1;
        boolean isPresent = false;
        while(low<=high){
            mid = (low+high)/2;
            System.out.printf("The mid is %d\n",mid);
            if(arr[mid]==key){
                System.out.printf("Key found at index %d\n",mid);
                isPresent = true;
                break;
            }else if(key<arr[mid]){
                high = mid - 1;
            }else{
                low = mid+1;
            }
        }
        if(isPresent == false){
            System.out.println("Element not fount");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int arr[] = new int[k];
        for(int i=0;i<k;i++){
            arr[i] = sc.nextInt();
        }
        int n = 8;
        binaryser b1 = new binaryser();
        b1.Binary(arr,n );
       
    }
}
