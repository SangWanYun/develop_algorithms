package develop_algorithms.default_math1;
import java.util.Scanner;

//2021.08.04
//https://www.acmicpc.net/problem/1193
//기본수학 1
//문제 - 분수 찾기
/*
* 무한히 큰 배열에 다음과 같이 분수들이 적혀있다. 
* 이와 같이 나열된 분수들을 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> … 과 같은 
* 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
* X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.
*/

//입력
/*
* 첫째 줄에 X(1 ≤ X ≤ 10,000,000)가 주어진다.
* 14
*/

//출력
/*
* 첫째 줄에 분수를 출력한다.
* 2/4
*/
public class FindFraction_20210804 {
// 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 ->
//         +1   +1-1   +1-0   -1+1
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = Integer.parseInt(sc.next());
		
		int xAxis = 0;
		int yAxis = 0;
		int count = 0;
		boolean check_zig = false;
		
		if(x == 1) {
			System.out.println(1 +"/"+ 1);
			return;
		}
		
		for(int i = 0; i < x; i++) {
			
			for(int j = 0; j < i; j++) {
				if(i % 2 == 0) {
					xAxis= j+1;
					yAxis= i-j;
				}else {
					yAxis= j+1;
					xAxis= i-j;
				}
				count++;
				if(count == x) {
					check_zig = true;
					break;
				}
			}
		
			if(check_zig) {
				break;
			}
		
		}
		

		System.out.println(xAxis +"/"+ yAxis);
	}

}
