package infosis.java;

import java.util.ArrayList;

public class MAXIMUMSUMOFCYCLICARRAY {
    public static void main(String[] args) {
        String input="8,-8,9,-9,10,-11,12";
        String inparr[]=input.split(",");
        int n=inparr.length;
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(Integer.parseInt(inparr[i]));
        }
        int max=0;
        // System.out.println(max);
        for(int i=0;i<n;i++){
            int tp=arr.get(0);
            arr.remove(0);
            arr.add(tp);
            // System.out.println(arr);
            max=Math.max(max,kadian(arr));
        }
        System.out.println(max);
    }

    private static int kadian(ArrayList<Integer> arr) {
        int maxSum = 0, curSum = 0;
        for(int i = 0; i < arr.size(); i++) {
            curSum = Math.max(0, curSum + arr.get(i));
            maxSum = Math.max(maxSum, curSum);
        }
        return maxSum;
    }
}
