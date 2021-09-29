package develop_algorithms.hash;

import java.util.*;

//2021.09.27
//https://programmers.co.kr/learn/courses/30/lessons/42576?language=java
//정렬
//문제 - 완주하지 못한 선수
/*
수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.

마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
*/

//제한사항
/*
* 마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
completion의 길이는 participant의 길이보다 1 작습니다.
참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
참가자 중에는 동명이인이 있을 수 있습니다.
*/

//입출력 예
/*
* 예제 #1
"leo"는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.

예제 #2
"vinko"는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.

예제 #3
"mislav"는 참여자 명단에는 두 명이 있지만, 완주자 명단에는 한 명밖에 없기 때문에 한명은 완주하지 못했습니다.
*/


public class Uncompleted_runner_20210929 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution sol = new Solution();
		String[] p = {"leo", "kiki", "eden"};
		String[] c = {"eden", "kiki"};
		sol.solution(p, c);
	}

}

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> comple_map = new HashMap<String, Integer>();
        for(String comple : completion){
    		comple_map.put(comple, comple_map.getOrDefault(comple, 0) + 1);
        }
        
        for(String parti : participant){
        	if(comple_map.get(parti) == null) {
        		return parti;
        	}else {
        		comple_map.put(parti,comple_map.getOrDefault(parti, 0) - 1); 
        	}
        }
        
    	for(String comple : comple_map.keySet()) {
    		if(comple_map.get(comple) != 0) {
    			return comple;
    		}
    	}

        return "";
    }
}
