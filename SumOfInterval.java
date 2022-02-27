package infosis.java;
import java.util.*;
public class SumOfInterval {
    public static void main(String[] args) {
        String num = "-5,5,1,-2,7";
        String arr[] = num.split(",");
        int n = arr.length;
        ArrayList <Integer>ls=new ArrayList<>();
        ArrayList <Integer>sl=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int tp = Integer.parseInt(arr[i]);
            if(tp<0){
                ls.add(tp);
            }else{
                sl.add(tp);
            }
        }
        ls.addAll(sl);
        // System.out.println(ls);
        // System.out.println(Arrays.toString(ls.get();
        for (int i = 0; i < n - 1; i++) {
            if (ls.get(i + 1) - ls.get(i) < 0) {
                if (i == n - 2)
                    System.out.println(0);
                else
                    System.out.print(0 + ",");
            } else {
                int tp = 0;
                for (int j = ls.get(i) + 1; j < ls.get(i + 1); j++) {
                    tp += j;
                }
                if (i == n - 2)
                    System.out.println(tp);
                else
                    System.out.print(tp + ",");
            }
        }
    }
}
