import java.util.*;

public class linearsearch {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter array size :");
        int size=sc.nextInt();

        int arr[]=new int[size];

        //Accepting the array elements
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the element to be Searched : ");
        int x=sc.nextInt();

        //searching
        for(int i=0;i<arr.length;i++){
            if(arr[i] == x)
                System.out.println("Element found at index : "+i);
                    
        }

    }
}