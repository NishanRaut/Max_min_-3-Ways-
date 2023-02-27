import java.util.Scanner;

public class Max_and_Min{
    public static void max_min(int arr[]){ //Way 1
        int emp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=arr.length-1;j>=i;j--){if(arr[i]>arr[j]){
                   emp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=emp;
               }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("Way 1 Answer: ");
        System.out.println("The minimum Number :" +arr[0]);
        System.out.println("The maximum Number :"+arr[arr.length-1]);
        System.out.println();
    }
    public static void mmax_mmin(int arr[]){ //Way 2
        int max=0,min=0;
        System.out.println("Way 2 Answer: ");
        for(int i=0;i<arr.length;){
            for(int j=arr.length-1;j>=i;){
                if(arr[i]==arr[j]){
                    max=arr[i];
                    System.out.println("Maximum Number: "+max);
                    break;
                    }
                else if(arr[i]<arr[j]){
                    i++;
                    }
                else{
                    j--; 
                    }
                }
            if(max!=0){
                break;
                    }
            }
        for(int i=0;i<arr.length;){
            for(int j=arr.length-1;j>=i;){
                if(arr[i]==arr[j]){
                    min=arr[i];
                    System.out.println("Minimum Number: "+min);
                    break;
                    }
                else if(arr[i]<arr[j]){
                    j--;
                    }
                else{
                    j++; 
                    }
                }
            if(min!=0){
                break;
                    }
            }    
        System.out.println();
    }
    public static void mmmax_mmmin(int arr[]){ //Way 3
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
               max=arr[i]; 
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Way 3 Answer: ");
        System.out.println("The maximum number is: "+max);
        System.out.println("The minimum number is: "+min);
    }
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int n,number;
        System.out.println("Enter length of array :");
        n=input.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter number: ");
            number=input.nextInt();
            arr[i]=number;
        }
        max_min(arr);
        mmax_mmin(arr);
        mmmax_mmmin(arr);
    }
}