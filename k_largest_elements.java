public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i : A){
            pq.offer(i);
            
            if(pq.size() > B){
                pq.poll();
            }
        }
        
        ArrayList<Integer> ans = new ArrayList();
        while(!pq.isEmpty()){
            ans.add(pq.poll());
        }
        //Collections.reverse(ans);
        return ans;
    }
}
