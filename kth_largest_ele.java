//https://www.codingninjas.com/codestudio/contests/codestudio-monthly-contest-1/problems/19414?leftPanelTab=0
import java.util.*;
class Pair{
	int ind;
	int ele;
	
	public Pair(int ind,int ele){
		this.ind=ind;
		this.ele=ele;
	}
}
public class Solution {

	public static int kthKingdom(int n, int k, int[] arr) {
   		// Write your code here.
		PriorityQueue<Pair> minheap= new PriorityQueue<>((n1,n2)->(n1.ele-n2.ele));
		
		for(int i=0;i<k;i++){
			minheap.add(new Pair(i,arr[i]));
		}
		
		for(int i=k;i<n;i++){
			if(arr[i]>minheap.peek().ele){
				minheap.poll();
				minheap.add(new Pair(i,arr[i]));
			
			}
			
		}
		
		return minheap.peek().ind;

	}

}
