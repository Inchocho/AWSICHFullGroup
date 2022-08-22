package level1;

public class 평균구하기 {

	//for문으로만
    public int getMean(int[] array) {
        int sum=0;
        for(int i=0;i<array.length;i++){
          sum+=array[i];
        }
          return sum/array.length;
      }
    
    //for-each문 사용
    public int getMean2(int[] array) {
        if(array == null){
          return 0;
        }

        int ret = 0;
        if(array != null){
          for(int n : array){
              ret += n;
          }
        }
          return ret / array.length;
      }
}
