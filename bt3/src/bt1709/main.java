package bt1709;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class main {
    public static void main(String[] args){
      //  bt20(9);

        List<Integer> tapCon = new ArrayList<>();
        int n = 6 ;
        int k= 4;
        lietketapcon(n,k,1, tapCon);
    }
    public static void bt20(int n){
        HashMap<Integer,Integer> mapN = new HashMap();
        for (int i=1; i<=n; i++){
            mapN.put(i,i*i);
        }
        for (int i=1;i<=n;i++){
            System.out.println("map> key:"+i+":"+mapN.get(i));
        }
    }

    public static void bt21(int[] arr){
        if (arr.length <= 1) {
            return;
        }

        // Tìm điểm giữa mảng
        int mid = arr.length / 2;

        // Chia mảng thành hai nửa
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        System.arraycopy(arr,0,left,0,mid);
        System.arraycopy(arr,mid,right,0,arr.length-mid);

        
    }

    public  static void lietketapcon(int n, int k, int start, List<Integer> tapcon){
        if (k==0){
            System.out.println(tapcon);
            return;
        }
        for (int i=start ; i<=n ;i++){
            tapcon.add(i);
            lietketapcon(n,k-1,i+1,tapcon);
            tapcon.remove(tapcon.size()-1);
        }
    }
//
    //   1  4  5
    //   1  2  3  4  5
    public static void bt23(int n, int k){
        int[] tapCon = new int[k];
        int currentIndex = 0;

        while (currentIndex >= 0) {
            // In tập con hiện tại
            if (currentIndex == k) {
                for (int i = 0; i < k; i++) {
                    System.out.print(tapCon[i] + " ");
                }
                System.out.println();
                currentIndex--;
            }

            // Tìm phần tử tiếp theo trong tập số từ 1 đến n
            int nextNumber = (currentIndex == 0) ? 1 : tapCon[currentIndex - 1] + 1;

            // Kiểm tra xem đã thử tất cả các số từ nextNumber đến n chưa
            if (nextNumber > n) {
                currentIndex--;
            } else {
                tapCon[currentIndex] = nextNumber;
                currentIndex++;
            }

        }
    }
}
