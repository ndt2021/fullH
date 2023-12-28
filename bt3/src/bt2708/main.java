package bt2708;

import java.util.Scanner;

public class main {
    public static void Main(String[] args){
        int[] arr = new int[4];
    }
    // bai 4 quan ly mang so nguyen
    // Add cac phan tu
    public static void Add(int[] numbers){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<numbers.length;i++){
            System.out.println("Nhap vao phan tu thu "+i+" : ");
            numbers[i]=sc.nextInt();
        }
        for(int i=0;i<numbers.length;i++){
            System.out.println("Phan tu thu "+i+" : "+numbers[i]);
        }
    }

    public static int[] Insert(int[] numbers, int a, int pos){
        int len = numbers.length;
        int[] newNumbers = new int[len+1];
        for (int i=0; i< newNumbers.length; i++){
            if ( i > pos){
                newNumbers[i] = numbers[i-1];
            }else if (i==pos){
                newNumbers[i] = a;
            }else {
                newNumbers[i] =numbers[i];
            }
        }
        return newNumbers;
    }

    public static int[] Delete(int[] numbers , int pos){
        int len = numbers.length;
        int[] newNumbers = new int[len-1];
        for (int i=0; i< newNumbers.length; i++){
            if ( i < pos){
                newNumbers[i] = numbers[i];
            }else {
                newNumbers[i] = numbers[i+1];
            }
        }
        return  newNumbers;
    }



}
