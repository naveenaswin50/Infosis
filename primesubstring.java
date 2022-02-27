package infosis.java;

import java.util.Scanner;

class primesubstring{
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        String num=sc.nextLine();
        int n=num.length();
        int max=-1;
        for(int i=1;i<Math.pow(2,n);i++){
            String temp="";
            int val=n-Integer.toBinaryString(i).length();
            while(val-->0){
                temp+="0";
            }
            temp+=Integer.toBinaryString(i);
            System.out.println(temp); 
            String tp="";
            for(int j=0;j<n;j++){
                if(temp.charAt(j)=='0'){
                    continue;
                }
                tp+=num.charAt(j)+"";
            }
            int number=Integer.parseInt(tp);
            if(is_prime(number)){
                max=Math.max(max,number);
            }
        }
        if(max==0){
            System.out.println(-1);
            return;
        }
        // System.out.println(max);
    }

    private static boolean is_prime(int number) {
        for(int i=2;i<number;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
}