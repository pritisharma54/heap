class Solution {
    class Pair{
        private int dist;
        private int x;
        private int y;
        public Pair(int a,int b,int c){
            this.dist = a;
            this.x = b;
            this.y = c;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((a,b)->{
            if(a.dist!=b.dist)
                return b.dist-a.dist;
            return 0;
        });
        for(int[] tup: points){
            int dist = tup[0]*tup[0] + tup[1]*tup[1];
            pq.offer(new Pair(dist,tup[0],tup[1]));
            if(pq.size()>k)pq.poll();
        }
        int[][] ans = new int[k][2];
        for(int i=0;i<k;i++){
            Pair p = pq.poll();
            ans[i] = new int[]{p.x,p.y};
        }
        return ans;
    }
}
