package infosis.java;
import java.util.ArrayList;
import java.util.HashSet;
public class strarrcomparechararr {
    public static ArrayList<Integer> ischar(String a,String s){
        ArrayList<Integer> ind=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)+"").equals(a)){
                ind.add(i);
            }
        }
        return ind;
    }
    public static void main(String[] args) {
        String s="dbabbca";
        String arr[]={"cls","bat","rat","bat","bat","car","rat"};
        String result="";
        HashSet<String>hs=new HashSet<>();
        for(int i=0;i<s.length();i++){
            hs.add(s.charAt(i)+"");
        }
        // System.out.println(hs);
        for(String i:hs){
            String k=i;
            ArrayList<Integer> ind=new ArrayList<>();
            ind=ischar(k,s);
            ArrayList<Integer> parind=new ArrayList<>();
            // System.out.println(ind);
            parind=isele(arr[ind.get(0)],arr);
            // System.out.println(parind);
            if(ind.equals(parind)){
                result+=i;
            }
        }
        System.out.println(result);
    }
    private static ArrayList<Integer> isele(String s, String[] arr) {
        ArrayList<Integer> ind=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if((arr[i]).equals(s)){
                ind.add(i);
            }
        }
        return ind;
    }
}