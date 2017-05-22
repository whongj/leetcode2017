package Array.hard;

/**
 * Created by wanghongjie on 2017/5/9.
 */

import java.util.Scanner;
public class newmain {
    public static void main(String[] args) {
        int t,n;
        int[] ans =new int[25];
        ans[0]=0;
        ans[1]=1;
        ans[2]=2;
        ans[3]=3;
        Scanner i =new Scanner(System.in);
        t=i.nextInt();
        while (t-->0){
            n=i.nextInt();
            for (int w=4;w<=n;w++){
                ans[w]=ans[w-1]*2-ans[w-3];
            }
            System.out.println(ans[n]);
        }

    }
}
