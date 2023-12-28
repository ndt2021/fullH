package btvn2008;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Bài tập 1: Nhập vào 1 chuỗi ký tự và Đảo ngược chuỗi\n" +
                "\n" +
                "Bài tập 2: Đếm số lượng ký tự trong chuỗi \n" +
                "\n" +
                "Bài tập 3: Nhập thêm 1 chuỗi và So sánh hai chuỗi ( chuỗi vừa nhập và chuỗi ban đầu)\n" +
                "\n" +
                "Bài tập 4: Ghép hai chuỗi đó\n" +
                "\n" +
                "Bài tập 5 :  Nhập vào 2 số và tìm bội chung nhỏ nhất của hai số đó" +
                "Bài 6: Nhập vào một chuỗi và loại bỏ các ký tự trùng lặp trong chuỗi ấy\n" +
                "\n" +
                "Bài tập 7 : Sắp xếp mảng số nguyên theo thứ tự tăng dần, nhưng giữ nguyên vị trí của các số chẵn.\n");

//        System.out.println("chọn bài . nhập số 1 - 7");

        Scanner sc = new Scanner(System.in);



        System.out.println("Bài tập 7 : Sắp xếp mảng số nguyên theo thứ tự tăng dần, nhưng giữ nguyên vị trí của các số chẵn.");
        System.out.print("Nhap n: ");
        int n=sc.nextInt();

        ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<Integer> arrOdd=new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            System.out.print("a["+i+"]= ");
            int tmp=sc.nextInt();

            arr.add(tmp);

            if(tmp%2!=0)
                arrOdd.add(tmp);
        }

        Collections.sort(arrOdd);
        int count =0;
        for(int i=0; i<arr.size(); i++){
            if (arr.get(i)%2==1) {
                arr.set(i, arrOdd.get(count));
                count ++;
            }
        }
        for (int i = 0; i< arr.size(); i++){
            System.out.println("a["+i +"] = " + arr.get(i));
        }


        sc.close();

    }
}
