package infosis.java;

public class StringVovles {
    public static void main(String[] args) {
        String str="aaabbfccaaddzzzzeeeeessoooooorrr";
        int n=str.length();
        StringBuilder result=new StringBuilder();
        for(int i=0;i<n;i++){
            char cchar=str.charAt(i);
            if(("aeiou").contains(cchar+"")){
                int fre=1;
                int cou=0;
                while(i+1<n&&str.charAt(i+1)==cchar){
                    fre++;
                    i++;
                    cou=fre;
                }
                while(fre-->0){
                    result.append(cou+"");
                }
            }else
                result.append(cchar);
        }
        System.out.println(result.toString());
    }
}
