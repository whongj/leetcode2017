package Array.hard;

import java.util.Scanner;

/**
 * Created by wanghongjie on 2017/5/8.
 */
public class hdoj {
//    public static void main(String[] args) {
//        try (Scanner i = new Scanner(System.in)) {
//            int n = i.nextInt();
//            int sum=0;
//            for(int w =0;w<n;w++)
//            {
//                int q = i.nextInt();
//                for(int x=1;x<=q;x++){
//                    if(x==1){
//                        sum=1;continue;
//                    }
//                    if(x%2==0)
//                    {sum=sum+x/2;}
//                    else
//                    {sum=sum+(x-1)/2;}
//                }
//                System.out.println(sum);
//            }
//        }
//    }
//}

//public class Main {
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
