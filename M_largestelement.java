package infosis.java;
import java.util.Arrays;
public class M_largestelement {
    public static void main(String[] args) {
        String str1="101,100,610,447,389";
        String str2="610,100,101,4,101";
        String arr1[]=str1.split(",");
        String arr2[]=str2.split(",");
        int n1=arr1.length;
        int n2=arr2.length;
        int num1[]=new int[n1];
        int num2[]=new int[n2];
        for(int i=0;i<n1;i++)
            num1[i]=Integer.parseInt(arr1[i]);
        for(int i=0;i<n2;i++)
            num2[i]=Integer.parseInt(arr2[i]);
        Arrays.sort(num1);
        Arrays.sort(num2);
        // System.out.println(Arrays.toString(num1));
        // System.out.println(Arrays.toString(num2));
        int com=-1;
        for(int i:num1){
            for(int j:num2){
                if(i==j&&(com>i||com==-1))
                com=i;
            }
        }
        if(com>0)
            com = com%9==0 ? 9 : com%9;
        // System.out.println(com);
        if(com>0&&(com<=n1&&com<=n2)){
            for(int i=n1-com;i<n1-1;i++)
                System.out.print(num1[i]+",");
            System.out.println(num1[n1-1]);
            for(int i=n2-com;i<n2-1;i++)
                System.out.print(num2[i]+",");
            System.out.println(num2[n2-1]);
        }else{
            System.out.println(-1);
        }
    }
}
