class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();
          for(int i=0;i<nums.length;i++){
              int num=nums[i];
            int d=target-num;

        if(map.containsKey(d)){
            return new int[] {map.get(d),i};
        }

        map.put(num,i);
    }
    return new int[] {};

    }
}