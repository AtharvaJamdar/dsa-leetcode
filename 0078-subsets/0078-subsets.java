class Solution {
    List<Integer> path = new ArrayList<>();
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        backtrack(0,nums);
        return result;
    }

    public void backtrack(int index, int[] nums){

        if (index == nums.length) {
            result.add(new ArrayList<>(path));
            return;
        }

        path.add(nums[index]);
        backtrack(index+1,nums);

        path.remove(path.size()-1);
        backtrack(index+1,nums);
    }
}