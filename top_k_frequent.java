class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        HashMap<Integer,Integer> countMap=new HashMap<Integer,Integer>();
		
		for(int i:arr)
		{
			if(countMap.containsKey(i))
				countMap.put(i,countMap.get(i)+1);
			else
				countMap.put(i, 1);
		}
		
		PriorityQueue<Map.Entry<Integer,Integer>> heap=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        heap.addAll(countMap.entrySet());
        
        int i=0;
        int [] result=new int [k]; 
        while(i<k)
        {
            Map.Entry entry=heap.poll();
            result[i]=(int)entry.getKey();
            i++;
            
        }
        
        return result;
    }
}
