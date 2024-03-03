class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();

        for(int i=0;i<numCourses;i++){
            list.add(new ArrayList<>());
        }

        for(int[] edge:prerequisites){
            list.get(edge[1]).add(edge[0]);
        }

        int[] indegree=new int[numCourses];
        for(int edge[]:prerequisites){
            indegree[edge[0]]++;
        }

        Queue<Integer> queue=new LinkedList<>();
        for(int node=0;node<indegree.length;node++){
            if(indegree[node]==0){
                queue.add(node);
            }
        }

        while(!queue.isEmpty()){
            int curr=queue.poll();
            list2.add(curr);
            for(int neighbor:list.get(curr)){
                indegree[neighbor]--;
                if(indegree[neighbor]==0){
                    queue.add(neighbor);
                }
            }
        }

        if (list2.size() != numCourses) {
            return new int[0]; 
        }

        int result[]=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            result[i]=list2.get(i);
        }
        return result;
    }
}