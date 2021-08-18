package develop_algorithms.default_math1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

//2021.08.18
//https://www.acmicpc.net/problem/10757
//기본수학 1
//문제 - 큰수 A + B
/*
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
*/

//입력
/*
* 첫째 줄에 A와 B가 주어진다. (0 < A,B < 1010000)
9223372036854775807 9223372036854775808
*/

//출력
/*
* 첫째 줄에 A+B를 출력한다.
18446744073709551615
*/
public class LargeNumberPlus_20210818 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
    //int나 long보다 더 큰 숫자를 담아야하므로 BigInteger 라는 클래스를 사용하였다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		BigInteger a = new BigInteger(st.nextToken());//테스트 데이터
		BigInteger b = new BigInteger(st.nextToken());//테스트 데이터
		
		System.out.println(a.add(b));
	}

}
