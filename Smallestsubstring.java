package infosis.python;
import java.util.ArrayList;
// import java.util.Arrays;
public class Smallestsubstring {
    private static boolean check(String tp, String str) {
        int n=str.length();
        int c=0;
        for(int i=0;i<n;i++){
            if(tp.contains(str.charAt(i)+"")){
                c++;
            }
        }
        if(c==str.length())return true;
        return false;
    }
    public static void main(String[] args) {
        String input="Assign,zzzzzxzsdxsabcd,Madammxmsgs,zxc1a12231aabcd,yogapriya";
        String intstr[]=input.split(",");
        int n=intstr.length;
        ArrayList<String>ls=new ArrayList<>(); 
        String out=input;
        for(int i=0;i<n;i++){
            String tp="";
            for(int j=0;j<intstr[i].length();j++){
                if(tp.contains(intstr[i].charAt(j)+"")){
                    continue;
                }
                tp+=intstr[i].charAt(j)+"";
            }
            // System.out.println(tp);
            ls.add(tp);
        }
        // System.out.println(ls);
        // System.out.println(out);
        f:for(int i=0;i<n;i++){
            for(int k=0;k<=intstr[i].length()-ls.get(i).length();k++){
                // System.out.println(intstr[i].length()-ls.get(i).length());
                for(int j=0;j<=(intstr[i].length()-ls.get(i).length()-k);j++){
                    String tp=intstr[i].substring(j,j+ls.get(i).length()+k);
                    // System.out.println(tp);
                    if(check(tp,ls.get(i))){
                        // System.out.println(tp);
                        if(tp.length()<out.length()){
                            out=tp;
                        }
                        continue f;
                    }
                }
            }
        }
        System.out.println(out);
    }
}