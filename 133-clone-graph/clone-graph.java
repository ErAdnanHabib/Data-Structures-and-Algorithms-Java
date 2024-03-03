class Solution {
    public Node cloneGraph(Node node) {
        if(node==null)return null;
        HashMap<Node,Node> map=new HashMap<>();
        Node newNode=new Node(node.val);
        map.put(node,newNode);
        Queue<Node> queue=new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            Node curr=queue.poll();
            List<Node> newNeighbour=map.get(curr).neighbors;
            for(Node n:curr.neighbors){
                if(!map.containsKey(n)){
                    Node tmp=new Node(n.val);
                    map.put(n,tmp);
                    queue.add(n);
                }
                newNeighbour.add(map.get(n));
            }
        } return newNode;
    }
}