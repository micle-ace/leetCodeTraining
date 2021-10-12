import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{i,map.get(target-nums[i])};
            }
            map.put(nums[i],i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=17;
        int[] res=twoSum(nums,target);
        if(res!=null)
            System.out.println("["+res[0]+","+res[1]+"]");
    }
}
