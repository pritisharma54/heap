class Pair{
    int diff;
    int val;

    public Pair(int diff, int val)
    {
        this.diff = diff;
        this.val = val;
    }
}
class Comp implements Comparator<Pair>
{
    @Override
    public int compare(Pair a, Pair b)
    {
        if(a.diff < b.diff)
        {
            return 1;
        }
        else if(a.diff > b.diff)
        {
            return -1;
        }
        else if(a.val < b.val)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}
class Main {

    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comp());
        int diff=0;
        for(int i=0;i<arr.length;i++)
        {
            diff=Math.abs(x-arr[i]);

            pq.add(new Pair(diff, arr[i]));
            if(pq.size() >k)
            {
                pq.poll();
            }
            System.out.println(pq.peek().val);
        }
        List<Integer> list = new ArrayList<>();
        while(pq.size()!=0)
        {
            list.add(pq.peek().val);
            pq.poll();
        }
        Collections.sort(list);
        return list;
    }
       public static void main (String[] args) {
        int[] arr = new int[] {10, 2, 14, 4, 7, 6};
        int x = 5, k = 3;


       System.out.println(findClosestElements(arr,k,x));

    }
}
