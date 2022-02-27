package infosis.java;
public class numberonlyarr {
    private static boolean check(String num, String[] str2, int n) {
        for(int i=0;i<n;i++){
            if(num.equals(str2[i])){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String g1="mo3s,123m,4tq5";
        String g2="13,3,45";
        String str1[]=g1.split(",");
        String str2[]=g2.split(",");
        int n1=str1.length;
        int n2=str2.length;
        String result1="";
        String result2="";
        for(int i=0;i<n1;i++){
            String che="";
            String num="";
            for(int j=0;j<str1[i].length();j++){
                if(str1[i].charAt(j)>=48 && str1[i].charAt(j)<=57){
                    num+=str1[i].charAt(j)+"";
                }else{
                    che+=str1[i].charAt(j)+"";
                }
            }
            // System.out.print(che+" ");
            // System.out.println(Integer.parseInt(num));
            if(check(num,str2,n2)){
                result1+=num+",";
                result2+=che+",";
            }else{
                result1+="NA,";
                result2+="NA,";
            }
        }
        System.out.println(result1.substring(0,result1.length()-1));
        System.out.println(result2.substring(0,result2.length()-1));
    }
}
