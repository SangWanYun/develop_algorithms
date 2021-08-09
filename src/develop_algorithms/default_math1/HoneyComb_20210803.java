package develop_algorithms.default_math1;
import java.util.Scanner;

//2021.08.03
//https://www.acmicpc.net/problem/2292
//�⺻���� 1
//���� - ����
/*
* ���� �׸��� ���� ���������� �̷���� ������ �ִ�. �׸����� ���� �ٿ� ���� �߾��� �� 1���� �����ؼ� �̿��ϴ� �濡 ���ư��鼭 1�� �����ϴ� ��ȣ�� �ּҷ� �ű� �� �ִ�. ���� N�� �־����� ��, 
* ������ �߾� 1���� N�� ����� �ּ� ������ ���� ������ �� �� �� ���� ���� ����������(���۰� ���� �����Ͽ�)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ���� ���, 13������ 3��, 58������ 5���� ������.
*/

//�Է�
/*
* ù° �ٿ� N(1 �� N �� 1,000,000,000)�� �־�����.
*/

//���
/*
* �Է����� �־��� ����� �ּ� ������ ���� ������ �� �� �� ���� ���� �������� ����Ѵ�.
*/
public class HoneyComb_20210803 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		if(n < 1) {
			return;
		}
		
		int helper = 1;
		int count = 1;
		while(n > helper) {
			helper+= count * 6;
			count++;
		}
		
		System.out.println(count);

	}

}
