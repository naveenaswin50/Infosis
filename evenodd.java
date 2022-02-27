package infosis.python;

public class evenodd {
    public static void main(String[] args) {
        String str="45";
        int k=3;
        int c=0;
        for (int i = 0; i < Math.pow(str.length(),k); i++) {
            String s=String.format("%"+k+"s",Integer.toString(i,2)).replace(" ", "0");
            // System.out.println(s);
            long num=0;
            for(int j=0;j<s.length();j++){
                num+=Integer.parseInt(str.charAt(Integer.parseInt(s.charAt(j)+""))+"");
            }
            if(num%2==0){
                c++;
            }
        }
        System.out.println((int)(c%(1e9+7)));
    }
}
