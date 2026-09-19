class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int [] indegree = new int[numCourses];
        List<List<Integer>> graph = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
           graph.add(new ArrayList<>());
        }

        for(int [] preq : prerequisites){
            int course = preq[0];
            int prereq = preq[1];

            graph.get(prereq).add(course);
            indegree[course]++;
        }

        for(int i=0;i<indegree.length;i++){
            if(indegree[i] == 0){
                queue.add(i);
            }
        }

        List<Integer> result = new ArrayList<>();

        while(!queue.isEmpty()){
            int current = queue.poll();

            result.add(current);

            for(int neighbor : graph.get(current)){
                indegree[neighbor]--;

                if(indegree[neighbor] == 0){
                    queue.add(neighbor);
                }
            }
        }

        return result.size() == numCourses;
    }
}