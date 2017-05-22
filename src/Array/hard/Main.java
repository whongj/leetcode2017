package Array.hard;

import java.util.Scanner;

/**
 * Created by wanghongjie on 2017/5/9.
 */
public class Main {
    public static int getpig(int n){
        int pig1=1;
        int pig2=0;
        int s=1;
        if(n==1) return s;
        else{
            for(int i=2;i<=n;i++){
                pig2=pig1;
                pig1=getpig(i-1);
                s=pig1+pig2;
            }
            return s;
        }

    }
    public static void main(String args[]){
        int k=0;
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(k<n){
            Scanner s1=new Scanner(System.in);
            int n2=s.nextInt();
            System.out.println(getpig(n2));
            k++;
        }
    }
}