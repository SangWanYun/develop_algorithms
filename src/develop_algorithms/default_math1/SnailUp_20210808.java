package develop_algorithms.default_math1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//2021.08.08
//https://www.acmicpc.net/problem/2869
//기본수학 1
//문제 - 달팽이는 올라가고 싶다
/*
*땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.
*달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다. 또, 정상에 올라간 후에는 미끄러지지 않는다.
*달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.
*/

//입력
/*
* 첫째 줄에 세 정수 A, B, V가 공백으로 구분되어서 주어진다. (1 ≤ B < A ≤ V ≤ 1,000,000,000)
* 2 1 5
* 5 1 6
* 100 99 1000000000
*/

//출력
/*
* 첫째 줄에 달팽이가 나무 막대를 모두 올라가는데 며칠이 걸리는지 출력한다.
* 4
* 2
* 999999901
*/
public class SnailUp_20210808 {

	public static void main(String[] args) throws IOException {
		//기존에 푼 문제들은 속도 제한이 없어서 scanner로 풀었으나 
		//이번 문제는 0.15초안에 풀어야하므로 100ms정도 걸리는 Scanner 대신
		//BR을 사용함
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());

		int sum = (v-b) / (a - b);		
		if((v-b) % (a - b) > 0) sum++;
		
		System.out.println(sum);
	}

}
