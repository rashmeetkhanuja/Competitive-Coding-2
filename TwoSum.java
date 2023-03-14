import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum{
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];

        for(int i=0; i<nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(target-nums[i], i);
            }
            else{
                res[0] = map.get(nums[i]);
                res[1]=i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        TwoSum obj = new TwoSum();
       int[] nums = new int[]{2,7,11,15};
       int[] result = obj.twoSum(nums, 9);
        System.out.println("Res --- " + Arrays.toString(result));
    }
}
