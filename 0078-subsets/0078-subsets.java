class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        different(ans, nums, 0 , list);
        return list;
        
    }
    public void different(List<Integer> ans, int[] nums, int idx, List<List<Integer>> list){
        if(idx == nums.length){
            list.add(new ArrayList<>(ans));
            return;
        }
        ans.add(nums[idx]);
        different(ans, nums, idx+1, list);
        ans.remove(ans.size()-1);
        different(ans, nums, idx+1, list);
    }
}