package develop_algorithms.sort;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//2021.09.06
//https://www.acmicpc.net/problem/2750
//정렬
//문제 - 수 정렬하기
/*
N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
*/

//입력
/*
* 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수 주어진다. 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
*/

//출력
/*
* 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
*/

public class Sort_Numbers_20210906 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int t = Integer.parseInt(st.nextToken());
		int[] sort_arr = new int[t];//테스트 데이터 수
		
		
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			sort_arr[i] = x;
		}
		
		for(int j = 1; j < sort_arr.length; j++) {
			int temp = sort_arr[j];
			int aux = j - 1;
			while( (aux >= 0) && ( sort_arr[aux] > temp ) ) {

				sort_arr[aux+1] = sort_arr[aux];
		         aux--;
		      }
			sort_arr[aux + 1] = temp;
		}
	
		
		for(int j = 0; j < sort_arr.length; j++) {
			System.out.println(sort_arr[j]);
		}
	}

}
