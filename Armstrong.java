package infosis.java;
public class Armstrong {
    private static boolean check(String tp) {
        int abc=0;
        for(int i=0;i<tp.length();i++){
            int temp=Integer.parseInt(tp.charAt(i)+"");
            abc+=Math.pow(temp,tp.length());
        }
        if((abc+"").equals(tp))return true;
        return false;
    }
    public static void main(String[] args) {
        String input="15,3,1,70,53,71";
        String arr[]=input.split(",");
        int n=arr.length;
        String res="";
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                String tp=arr[i]+arr[j];
                if(check(tp)){
                    if(res.contains(tp)){
                        continue;
                    }
                    res+=tp+",";
                }
            }
        }if(res==""){
            System.out.println(-1);
            return ;
        }
        System.out.println(res.substring(0,res.length()-1));
    }
}
