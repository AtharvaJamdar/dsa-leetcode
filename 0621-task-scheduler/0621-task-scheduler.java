class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for(char task : tasks){
            freq[task - 'A']++;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        Queue<int[]> queue = new LinkedList<>();

       for(int f : freq){
        if(f > 0){
            pq.offer(f);
        }
       }

       int time = 0;

       while(!pq.isEmpty() || !queue.isEmpty()){

        time++;

        if(!queue.isEmpty() && queue.peek()[1] == time){
            pq.offer(queue.poll()[0]);
        }

        if(!pq.isEmpty()){

            int frequency = pq.poll();
            frequency--;

            if(frequency > 0){
                queue.offer(new int[]{frequency, time + n + 1});
            }
        }
       } 
       return time;
    }
}