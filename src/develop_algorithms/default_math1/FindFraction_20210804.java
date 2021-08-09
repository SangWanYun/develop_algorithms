package develop_algorithms.default_math1;
import java.util.Scanner;

//2021.08.04
//https://www.acmicpc.net/problem/1193
//�⺻���� 1
//���� - �м� ã��
/*
* ������ ū �迭�� ������ ���� �м����� �����ִ�. 
* �̿� ���� ������ �м����� 1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> �� �� ���� 
* ������� ������ ���ʴ�� 1��, 2��, 3��, 4��, 5��, �� �м���� ����.
* X�� �־����� ��, X��° �м��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
*/

//�Է�
/*
* ù° �ٿ� X(1 �� X �� 10,000,000)�� �־�����.
* 14
*/

//���
/*
* ù° �ٿ� �м��� ����Ѵ�.
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
