class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        boolean[] visited = new boolean[n];
        return dfs(source, destination, adj, visited);
    }
    public boolean dfs(int node, int dest,
                       ArrayList<ArrayList<Integer>> adj,
                       boolean[] visited) {
        if (node == dest) return true;
        visited[node] = true;
        for (int neighbour : adj.get(node)) {
            if (!visited[neighbour]) {
                if (dfs(neighbour, dest, adj, visited)) {
                    return true;
                }
            }
        }
        return false;
    }
}
