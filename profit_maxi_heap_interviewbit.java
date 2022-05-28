public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int y:A){
            pq.add(y);
        }
        int sum=0;
        while(B>0){
            int value=pq.poll();
            sum+=value;
            pq.add(value-1);
            B-=1;
        }
        return sum;
    }
}

