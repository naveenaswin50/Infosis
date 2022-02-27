package infosis.java;

public class UNIQUEWORDS {
    public static void main(String[] args) {
        String input="God sees the sees people,god is great great,people sees the god";
        String input1[]=input.split(",");
        int n=input1.length;
        String res="";
        int a=0;
        for(int i=0;i<n;i++){
            String arr[]=input1[i].split(" ");
            // int c=0;
            String sol="";
            for(int j=0;j<arr.length;j++){
                if(res.contains(arr[j])||sol.contains(arr[j])){
                    // c++;
                    a++;
                }else{
                    sol+=arr[j]+" ";
                }
            }if(sol.equals("")){
                res+="X\n";
            }else{
                res+=sol+"\n";
            }
        }
        if(a==0)
            System.out.print(-1);
        else
            System.out.print(res);
    }
}
