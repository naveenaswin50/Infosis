package infosis.python;
import java.util.ArrayList;
import java.util.Collections;
public class Specialnum {
    public static void main(String[] args) {
        String bignum="234005678461";
        ArrayList<Integer>ls=new ArrayList<>();
        for(int i=0;i<bignum.length()-1;i++){
            ls.add(Integer.parseInt(bignum.substring(i,i+2)));
        }
        Collections.sort(ls);
        // System.out.println(ls);
        int maxcount=0;
        int maxnum=0;
        for(int num:ls){
            int count=0;
            for(int i=1;i<=num;i++){
                if(num%i==0){
                    if((bignum).contains(i+"")){
                        count++;
                    }
                }
            }
            // System.out.println(num+" "+count);
            if(maxcount<=count){
                maxcount=count;
                maxnum=num;
            }
        }
        System.out.println(maxnum+" "+maxcount);
    }
}
