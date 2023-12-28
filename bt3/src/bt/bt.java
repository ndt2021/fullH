package bt;

import java.util.Scanner;

public class bt {
    public static void main(String[] args) {
//        bt1();
        bt2();
    }

    public static void bt1() {

        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.println("nhập số phần tử n = ");
            n = sc.nextInt();
        } while (n <= 0);

        int[] arr = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("nhap arr[" + i + "]:");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        int temp;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Tong cac phan tu =" + sum);
        System.out.println("Phan tu nho nhat = " + arr[0]);
        System.out.println("mang da sap xep");
        for (int i = 0; i < n; i++) {
            System.out.println("nhap arr[" + i + "]:" + arr[i]);

        }

        sc.close();
    }

    public static void bt2() {
        Scanner sc = new Scanner(System.in);
        String chuoi;
        int len;
        do {
            System.out.println("nhập chuỗi ký tự không quá 80:");
            chuoi = sc.nextLine();
            len = chuoi.length();
        } while (len > 80);
        System.out.println("nhap ky tu can dem : ");
        char c = sc.next().charAt(0);
        int dem = 0;

         for (int i = 0; i < len; i++) {
            if(c == chuoi.charAt(i)){
                dem++;
            }
        }

        System.out.println("ky tu "+c +"xuat hien "+dem+" lan");
        sc.close();
    }

}
