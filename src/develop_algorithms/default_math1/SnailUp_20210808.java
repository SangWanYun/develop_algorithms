package develop_algorithms.default_math1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//2021.08.08
//https://www.acmicpc.net/problem/2869
//�⺻���� 1
//���� - �����̴� �ö󰡰� �ʹ�
/*
*�� ���� �����̰� �ִ�. �� �����̴� ���̰� V������ ���� ���븦 �ö� ���̴�.
*�����̴� ���� A���� �ö� �� �ִ�. ������, �㿡 ���� �ڴ� ���� B���� �̲�������. ��, ���� �ö� �Ŀ��� �̲������� �ʴ´�.
*�����̰� ���� ���븦 ��� �ö󰡷���, ��ĥ�� �ɸ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
*/

//�Է�
/*
* ù° �ٿ� �� ���� A, B, V�� �������� ���еǾ �־�����. (1 �� B < A �� V �� 1,000,000,000)
* 2 1 5
* 5 1 6
* 100 99 1000000000
*/

//���
/*
* ù° �ٿ� �����̰� ���� ���븦 ��� �ö󰡴µ� ��ĥ�� �ɸ����� ����Ѵ�.
* 4
* 2
* 999999901
*/
public class SnailUp_20210808 {

	public static void main(String[] args) throws IOException {
		//������ Ǭ �������� �ӵ� ������ ��� scanner�� Ǯ������ 
		//�̹� ������ 0.15�ʾȿ� Ǯ����ϹǷ� 100ms���� �ɸ��� Scanner ���
		//BR�� �����
		
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
