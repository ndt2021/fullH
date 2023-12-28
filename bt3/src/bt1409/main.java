package bt1409;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        System.out.println("Bài 18: Viết chương trình tính tổng của số nguyên lớn nhất và số nguyên nhỏ nhất" +
                " của 3 số nguyên a, b và c \n" +
                "\n" +
                "Bài 19: Viết chương trình nhập năm từ bàn phím và kiểm tra xem năm đó có phải là năm nhuận không?");
        bt18();
        bt19();
    }

    public static void bt18(){
        int a= 6;
        int b=7;
        int c =15;
        int Sum = Math.max(a,Math.max(b,c)) + Math.min(a,Math.min(b,c)) ;
        System.out.println("tong = "+ Sum);

    }

    public static void bt19(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập năm: ");
        int nam = sc.nextInt();

        if (kiemTraNamNhuan(nam)) {
            System.out.println(nam + " là năm nhuận.");
        } else {
            System.out.println(nam + " không phải là năm nhuận.");
        }
        sc.close();
    }

    public static boolean kiemTraNamNhuan(int year){
        if((year%4==0 && year%100 !=0) || year%400==0){
            return true;
        }else {
            return false;
        }
    }

}
