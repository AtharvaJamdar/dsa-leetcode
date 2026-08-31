class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for(int n : nums){
            set.add(n);
        }

        for(int i=1;i<nums.length+1;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}