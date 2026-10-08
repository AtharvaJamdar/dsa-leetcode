class Solution {
    List<Integer> path = new ArrayList<>();
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        boolean [] used = new boolean[nums.length];

        backtrack(nums,used);
        return result;
    }

    public void backtrack(int[] nums, boolean[] used){
        if(path.size() == nums.length){
            result.add(new ArrayList<>(path));
            return;
        }

        for(int i=0;i<nums.length;i++){

            if(used[i]){
                continue;
            }

            path.add(nums[i]);
            used[i] = true;

            backtrack(nums,used);

            path.remove(path.size()-1);
            used[i] = false;
        }
    }
}