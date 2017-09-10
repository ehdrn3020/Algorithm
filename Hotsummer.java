/*
입력
입력의 첫째 줄에는 교내 건물의 수를 뜻하는 숫자 T가 입력된다.
그다음 줄부터 총 T개의 건물의 전력 사용량에 대한 정보가 입력되는데, 이는 두 줄로 이뤄진다. 
첫째 줄은 해당 건물의 목표 전력 사용량인 W가 입력되고, 둘째 줄에는 총 9개의 숫자 A9, A10, ..., A17가 입력되는데, 
Ai는 i 시부터 i+1 시까지의 전력 사용량을 뜻한다. 전력 사용량에서 입력되는 숫자는 모두 0 이상 1,000 이하의 정수이며, 숫자는 공백으로 구분된다.

출력
각 건물에 대해 입력된 순서대로 전체 전력 사용량의 합이 목표 사용량 이하일 경우 "YES"를, 그렇지 못할 경우에는 "NO"를 한 줄에 출력한다.

예제 입력
3
90
10 10 10 10 10 10 10 10 10
1000
77 77 70 11 34 35 41 83 54
50
10 20 30 40 50 60 50 40 30

예제 출력
YES
YES
NO
*/

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args){
		
		//건물의 수
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		for(int i =0; i < N; i++){
			//건물 전력사용량 목표치
			int aim = scan.nextInt();
			
			//시간별 전력 사용량
			scan = new Scanner(System.in);
			String time = scan.nextLine();
			String[] timeInter = time.split(" ");
			
			//시간별 합계
			int sum = 0;
			for(String k : timeInter){
				sum += Integer.parseInt(k);
			}
			//목표치에 맞는치 확인
			if(sum > aim)
				System.out.println("NO");
			else
				System.out.println("YES");
		}
		scan.close();
	}
}

