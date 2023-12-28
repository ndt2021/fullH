import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

       // Scanner sc = new Scanner(System.in);
        // System.out.println("nhap danh sach cac xe oto");
        // System.out.println("so luong torng danh sach");
        // int n = sc.nextInt();
        // String[] Oto = new String[n];

        // for(int i =0; i<n; i++){
        //     System.out.println("Nhap oto so" + i +": ");
        //     Oto[i]= sc.nextLine();
        // }
        // System.out.println("danh sach o t o: ");
        // for(int i =0; i<n; i++){
        //     System.out.println("oto[" + i +"] la " + Oto[i]);
        // }

        // String name = "nguyen duc tu";
        // System.out.println("vi tri cua ky tu g: "+ name.indexOf('g'));
        // System.out.println("vi tri cua ky tu u: "+ name.lastIndexOf('u'));
       // sc.close();
       bt1();

    }


    public static void bt1(){
       Scanner sc = new Scanner(System.in);
    
           int n;

           do{
               System.out.println("so luong cac phan tu");
               n = sc.nextInt();
               
           }while(n <=0 && n >80 );
    
           int[] array = new int[n];
    
           for(int i =0; i<n; i++){
               System.out.println("arry[" + i +"]: ");
               array[i]= sc.nextInt();
           }
           System.out.println("nhap k = ");
           int k = sc.nextInt();
           
           for(int i =0; i<n; i++){
               if(k == array[i]){
                   System.out.println("phan tu " +k +" co vi tri" + i);
                   break;
               }
                   System.out.println("Trong mảng không có phần tử nào chứa giá trị cần tìm.");
           }
    
           sc.close();
    }

}






/*
 * BTVN
1. Viết chương trình thực hiện các công việc sau:
Nhập liệu cho mảng có n phần tử nguyên (n > 0) từ bàn phím.
Nhập số nguyên k từ bàn phím. 
Tìm kiếm phần tử đầu tiên trong mảng có giá trị bằng k và thông báo lên màn hình vị trí của phần tử đó.
 Nếu không có phần tử nào của mảng có giá trị bằng k thì thông báo "Trong mảng không có phần tử nào chứa giá trị cần tìm."

2. Viết chương trình nhập vào một chuỗi bất kỳ bao gồm cả số, ký tự thường và ký tự hoa từ bàn phím. Sau đó đếm và in ra số ký tự thường và ký tự hoa và số có trong chuỗi đó.
 */
