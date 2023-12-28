package bt5;

import java.util.LinkedList;
import java.util.Scanner;

public class m {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> ds = new LinkedList<>();

        ds.add(5);
        ds.add(4);
        ds.add(7);
        ds.add(8);

        for (int i =0; i< ds.size(); i++){
            System.out.println("ds["+i + "]= " + ds.get(i));
        }
        sc.close();


    }
}
