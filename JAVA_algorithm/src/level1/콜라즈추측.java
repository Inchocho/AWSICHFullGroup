package level1;

public class 콜라즈추측 {

	public int collatz(int num) {
		long n = (long) num;
		for (int i = 0; i < 500; i++) {
			if (n == 1)
				return i;
		//삼항연산자를 통해 n % 2 가 0이면 n/2, 아니면 (n*3)+1을 수행
			n = (n % 2 == 0) ? n / 2 : n * 3 + 1;
		}
		return -1;

	}
	
	//while문을 통해 돌림
    public int solution(long num) {
        int answer = 0;

        while(num != 1){
            answer++;
            if(answer==500)
                return -1;
            if(num%2==0){
                num/=2;
            }else{
                num=num*3+1;
            }
        }
        return answer;
    }
}
