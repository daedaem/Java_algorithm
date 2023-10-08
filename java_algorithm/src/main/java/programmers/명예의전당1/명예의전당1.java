package programmers.명예의전당1;

public class 명예의전당1 {
    public static void main(String[] args) {
        Solution solution = new Solution();
	      int k = 3;
	        int[] score = { 10, 100, 20, 150, 1, 100, 200};
	        int[] result = solution.solution(k, score);
	        for (int i = 0; i < result.length; i++) {
	            System.out.println(result[i]);
	        }
        }
		static class Solution {
		    public int[] solution(int k, int[] score) {
		        PriorityQueue<Integer> pq = new PriorityQueue<>();
		        int answer[]= new int[score.length];
		        for(int j =0; j< score.length;j++){
		            pq.add(score[j]);
		            if(pq.size()>k){
		                pq.poll();
		            }
		            answer[j] = pq.peek();
		        }
		        return answer;
		}
	}
}
