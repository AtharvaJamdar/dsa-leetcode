class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<List<Integer>,List<String>> map = new HashMap<>();

        // for(String word : strs){

        //     // Step 1: convert string to char array
        //     char [] arr = word.toCharArray();

        //      // Step 2: sort the array
        //     Arrays.sort(arr);

        //     // Step 3: make it back to string (this is the key)
        //     String key = new String(arr);

        //      // Step 4: store in map
        //     if(!map.containsKey(key)){
        //         map.put(key,new ArrayList<>());
        //     }

        //     // step 5: add words to the key
        //     map.get(key).add(word);
        // }
        //  // Step 6: return all grouped values
        // return new ArrayList<>(map.values());

        for(String word : strs){
            int[] freq = new int[26];

            for(char ch : word.toCharArray()){
                freq[ch - 'a']++;
            }
            List<Integer> key = new ArrayList<>();

            for(int count : freq){
                key.add(count);
            }

            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }

            map.get(key).add(word);
        }
        return new ArrayList<>(map.values());
    }
}