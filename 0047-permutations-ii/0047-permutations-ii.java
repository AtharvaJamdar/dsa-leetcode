class Solution {
    List<Integer> path = new ArrayList<>();
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);

        backtarck(nums,used);
        return result;
    }

    public void backtarck(int[] nums, boolean[] used){
        if(path.size() == nums.length){
            result.add(new ArrayList<>(path));
            return;
        }

        for(int i=0;i<nums.length;i++){

            if(used[i]){
                continue;
            }
            
            if(i > 0 && nums[i] == nums[i-1] && !used[i-1]){
                continue;
            }

            path.add(nums[i]);
            used[i] = true;

            backtarck(nums,used);
            path.remove(path.size()-1);
            used[i] = false;
        }
    }
}