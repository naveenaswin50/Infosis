package infosis.python;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
public class NEXTSMALLESTINTEGER {
	public static void checkList(int n, int[] arr, HashSet<Integer> ans, int tp){
		if(tp == 0){
			ans.add(n);
		}else if(tp > 0){
			for(int i:arr){
				checkList(n,  arr, ans, tp - i);
			}
		}
	}
	public static ArrayList<Integer> reverse2(int[] arr, int n){
		HashSet<Integer> ans = new HashSet<>();
		for(int i = n; i < n+10; i++){
			// System.out.println(i);
			checkList(i, arr, ans, i);
		}
        ArrayList<Integer>ls=new ArrayList<>(ans);
        Collections.sort(ls);
		return ls;

	}
	public static void main(String[] args){
		int[] arr = {4,2,3,7};
        int n=arr.length;
        Arrays.sort(arr);
        ArrayList<Integer>ls=new ArrayList<>();
        ls=reverse2(arr, n);
        if(ls.size()==10){
            System.out.println(-1);
        }else{
            for(int i=arr[n-1];i<arr[n-1]+10;i++){
                if(ls.contains(i)){
                    continue;
                }else{
                    System.out.println(i);
                    return;
                }
            }
        }
	}
}