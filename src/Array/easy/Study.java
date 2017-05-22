package Array.easy;

/**
 * Created by wanghongjie on 2017/5/9.
 */
import java.util.Scanner;

public class Study {
    //private static int max;

    public static void main (String args[]){
        Scanner in =new Scanner(System.in);
        int i,n,run = 0,wait=0;
        int max;
        n=in.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++){
            if(a[i]!=0){
                wait++;
            }
            else{
                //run=wait;
                run = Math.max(run, wait);
                wait=0;
            }
        }
        max=Math.max(wait, run);
        System.out.println(max);
        in.close();
    }

}