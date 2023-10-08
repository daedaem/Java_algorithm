package programmers.캐시;
import java.util.*;
public class 캐시 {
    public static void main(String[] args) {
	    // 문제 해결 코드 작성
		class Solution {
		    public int solution(int cacheSize, String[] cities) {
		        int answer = 0;
		        if(cacheSize==0) return cities.length*5;
		        LinkedList<String> caches = new LinkedList<>();
		        for(int i=0; i< cities.length; i++){
		            String findCities = cities[i].toUpperCase();
		            if(caches.contains(findCities)){
		                caches.remove(caches.indexOf(findCities));
		                caches.add(findCities);
		                answer++;
		            }else{
		                if(caches.size()>=cacheSize){
		                    caches.remove(); // 첫번째 지우기
		                    caches.add(findCities);
		                    answer+=5;
		                }else{
		                    caches.add(findCities);
		                    answer+=5;
		                }
		            }
		        }
		        return answer;
		    }
		}

		// 메서드 호출
		Solution sol = new Solution();
		int cacheSize = 3; // 임의의 캐시 크기
		String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"}; // 임의의 도시 배열
		int result = sol.solution(cacheSize, cities);

		System.out.println(result); // 결과 출력
	}
}
