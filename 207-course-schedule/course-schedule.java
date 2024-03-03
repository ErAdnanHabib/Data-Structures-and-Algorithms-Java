class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> list=new ArrayList<>();
        Queue<Integer> queue =new LinkedList<>();
        int enrolled=0;
        for(int i=0;i<numCourses;i++){
            list.add(new ArrayList<>());
        }
        for(int[] edge:prerequisites){
            list.get(edge[1]).add(edge[0]);
        }
        int indegree[]= new int[numCourses];
        for(int edge[]:prerequisites){
            indegree[edge[0]]++;
        }
        for(int node=0;node<indegree.length;node++){
            if(indegree[node]==0){
                queue.add(node);
                enrolled++;
            }
        }
        while(!queue.isEmpty()){
            int curr=queue.poll();
            for(int neigbor:list.get(curr)){
                indegree[neigbor]--;
                if(indegree[neigbor]==0){
                    queue.add(neigbor);
                    enrolled++;
                }
            }
        } return (enrolled==numCourses);
    }
}
// n=6
// prerqst=[[0,4],[0,5],[1,4],[1,3],[2,5],[5,2]]