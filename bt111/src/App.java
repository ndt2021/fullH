import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Program is running");
        // Scanner sc = new Scanner(System.in);

        // System.out.println("nhap a =");
        // int a = sc.nextInt();
        // System.out.println("nhap b =");
        // int b = sc.nextInt();


        
        
        double a, b;
        a =15;
        b = 20;
        double i = 0;
        double ucln=0;
        while( i <a && i< b){
            if((a%i==0) && (b%i==0)){
                ucln = i;
            }
             i = i + 1;
        }
        System.out.println("ucnl cua a va b la: " + ucln );

        if(checkSNT(7)){
            System.out.println( "n la so nguyen to");
        }else{
            System.out.println( " n khong phai so nguyen to");
        }


        // sc.close();
    }

    public static boolean checkSNT(int n){
        int check =0;
        for(int i =1 ; i< Math.sqrt(n); i++){
            if(n % i==0){
                check = check+1;
            }
            if(check==2){
                return false;
            }
        }

        return true;
    }

}
