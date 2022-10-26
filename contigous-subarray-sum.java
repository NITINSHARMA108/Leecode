 /* take (prefix array sum %k) and added it in map after checking it is previously present in map or not
 if it is not present then add and if it present that means a multiple of k has been added to preexisting sum .*/
 public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum = 0;
        for(int i=0;i<nums.length;i++) {
            sum += nums[i];
            if(!map.containsKey(sum%k)){
                map.put(sum%k, i);
                sum = sum%k;
            } else{
                if(i-map.get(sum%k) >=2) {
                    return true;
                }
            }
        }
        return false;
    }