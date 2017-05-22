package Array.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by wanghongjie on 2017/5/10.
 */
public class E448 {
        public List<Integer> findDisappearedNumbers(int[] nums) {
            List<Integer> v = new ArrayList<>();
            Arrays.sort(nums);
            int w=1;
            for(int i=0;i<nums.length;i++,w++){
                if(w!=nums[i]){
                    v.add(w);
                    while(w!=nums[i-1])
                    {
                        w++;
                    }
                }
            }



            return v;


        }

    public static void main(String[] args) {
        E448 e = new E448();
        int [] w = {1,3,4,5,7,8};
        System.out.println(e.findDisappearedNumbers(w));
    }
    }

