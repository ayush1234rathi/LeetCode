class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        Arrays.sort(nums);
        int min=nums[0],max=nums[nums.length-1],i=1;
        while(min!=max){
            if(min+1!=nums[i]){
                ans.add(++min);
            }
            else{    
                min=nums[i];
                i++;
            }
        }
        return ans;
    }
}