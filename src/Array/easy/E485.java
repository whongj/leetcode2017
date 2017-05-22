package Array.easy;

/**
 * Created by wanghongjie on 2017/5/8.
 */
public class E485 {
    public class Solution {
        public int findMaxConsecutiveOnes(int[] nums) {
            int count=0;
            int max=0;
            for(int i:nums){
                if(i==1){
                    if(++count>max)
                        max =count;

                }else
                    count=0;

            }

            return max;
        }
    }
}
