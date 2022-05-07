import java.util.*;
public class maxandmin{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max,min;
        if(arr[0]>arr[1]){
            max=arr[0]; min=arr[1];
        }
        else{
            max=arr[1]; min=arr[0];
        }
        for(int i=2;i<n;i++){
            if(arr[i]>max) max=arr[i]; 
            else if(arr[i]<min) min=arr[i];
        }
        System.out.println(max);
        System.out.println(min);

    }
}