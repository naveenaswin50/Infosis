package infosis.python;
public class bitencoding {
    public static void main(String[] args) {
        String str="ABC123+";
        String str1="";
        String result = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
        for(int i=0;i<str.length();i++){
            String tp="";
            int size=8-Integer.toBinaryString(str.charAt(i)).length();
            while(size-->0){
                tp+="0";
            }
            tp+=Integer.toBinaryString(str.charAt(i));
            str1+=tp;
        }
        int size=(str1.length()/6+1)*6-str1.length();
        while(size-->0){
            str1+="0";
        }
        // System.out.println(str1);
        for(int i=0;i<str1.length();i+=6){
            // System.out.println(str1.substring(i,i+6));
            int num=Integer.parseInt(str1.substring(i,i+6),2);
            System.out.print(result.charAt(num));
        }
    }
}
