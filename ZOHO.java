package infosis.java;
public class ZOHO {
    public static void main(String[] args) {
        String str="ZOHO";
        int l=str.length();
        int n=str.length()*2-1;
        int base=n-l-1;
        boolean fl=false;
        int count=l-(str.length()-2);
        for(int i=0;i<n;i++){
            int c=0;
            int ind=0;
            for(int j=0;j<n;j++){
                // String a=str.charAt(j%str.length())+"";
                if(i<l){
                    if(i+j>=n-1){
                        System.out.print(str.charAt(c%l)+" ");
                        ++c;
                    }else{
                        System.out.print("  ");
                    }
                }else{
                    if(i+j>=n-1){
                        if(ind<base){
                            System.out.print(str.charAt(ind)+" ");
                            ind++;
                        }
                        else{
                            System.out.print(str.charAt(base)+" ");
                            fl=true;
                        }
                    }else{
                        System.out.print("  ");
                    }
                }
            }
            int cou=i-1;
            int num=0;
            for(int j=1;j<n;j++){
                // String a=str.charAt(j%str.length())+"";
                if(i<l){
                    if(i==j||i>j){
                        System.out.print(str.charAt(cou%l)+" ");
                        --cou;
                    }
                }else{
                    if(i==j||i>j){
                        if(num<count){
                            if(ind<base){
                                System.out.print(str.charAt(ind)+" ");
                                num++;
                                ++ind;
                            }
                            else{
                                System.out.print(str.charAt(base)+" ");
                                num++;
                            }
                        }else{
                            System.out.print(str.charAt(--ind)+" ");
                        }
                    }else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
            if(fl){
                base--;
                count+=2;
            }
        }
    }
}
