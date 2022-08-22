package level1;

public class 짝수와홀수 {
	
	//삼항연산자로 간단하게 작성가능
    String evenOrOdd(int num) {
        return num % 2 == 0 ? "Even": "Odd";
    }
    
    String evenOrOdd2(int num) {
        String result = "";
      if(num % 2 == 1){
        result = "Odd";
      }else{
        result = "Even";
      }
        return result;
    }
}
