/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode prev = head;
        ListNode curr = head.next;
        ListNode next = curr.next;
        int position = 1;
        List<Integer> list = new ArrayList<>();

        while(next != null){
            
            if((prev.val < curr.val && next.val < curr.val) 
              || (prev.val > curr.val && next.val > curr.val)){
                list.add(position);
            }

            prev = curr;
            curr = next;
            next = next.next;
            position++;
        }
        
        if(list.size() < 2){
            return new int[]{-1,-1};
        }
        
        int minDistance = Integer.MAX_VALUE;
        for(int i=1;i<list.size();i++){
            minDistance = Math.min(minDistance,list.get(i)-list.get(i-1));
        }
        
        int maxDistance = list.get(list.size()-1) - list.get(0);
        
        return new int[]{minDistance,maxDistance};
    }
}