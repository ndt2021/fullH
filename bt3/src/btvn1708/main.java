package btvn1708;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
//        bt1();
//    bt2();
        //     bt3();
        //   bt4();

    }

    public static void bt1() {
        Scanner sc = new Scanner(System.in);
        int n;
        int giaiThua = 1;
        System.out.println("chương trình tính giai thừa nhập n > 0 ");
        do {
            n = sc.nextInt();
        } while (n < 0);

        for (int i = 1; i <= n; i++) {
            giaiThua *= i;
        }
        System.out.println("n!=" + giaiThua);
        sc.close();
    }

    public static void bt2() {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("check số nguyên tố \n nhập n >0  ");
        do {
            n = sc.nextInt();
        } while (n < 1);

        int count = 0;

        for (int i = 1; i < Math.sqrt(n); i++) {
            if ((n % i) == 0) {
                count++;
            }
        }
        if (n > 1) {
            System.out.println("n khong phai so nguyen to");
        } else {
            System.out.println("n la so nguyen to");
        }
        sc.close();
    }

    public static void bt3() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ds = new ArrayList<>();
        System.out.println("so phan tu trong array = ");
        int n = sc.nextInt();
        if (n < 1) {
            System.out.println("gia tri khong hop le");
        }
        System.out.println("nhap cac phan tu");
        for (int i = 0; i < n; i++) {
            System.out.println("nhap arr[" + i + "]=");
            ds.add(sc.nextInt());
        }
        System.out.println("cac phan tu");
        for (int i = (ds.size() - 1); i >= 0; i--) {
            if (ds.get(i) % 2 != 0) {
                ds.remove(i);
            }
        }
        for (int i = 0; i < ds.size(); i++) {
            System.out.print("  arr[" + i + "]=  " + ds.get(i));
        }
        sc.close();
    }

    public static List<Integer> bt4(List<Integer> list1) {
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            list2.add(list1.get(i));
        }
        return list2;
    }

}

