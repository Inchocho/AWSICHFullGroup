package ArrayGugudan;

class aaa {
	static class Solution {
	    public long solution(long n) {
	        long answer = 0;
	        String a = "";
	        String b = "";
	        String c = "";
	        int d = 0;
	        int e = 0;
	        int f = 0;
	        
	        a = n+"";        
	        System.out.println(a.length());
	        
	        for(int i = 1; i<a.length(); i++){                                    
	            d = a.lastIndexOf(i);
	            System.out.println(d);
//	            b = d+"";
//	            c = b+c;            
	        }
	        e = Integer.parseInt(c);            
	        answer = e;
	        return answer;
	    }
	}
	public static void main(String[] args) {
		Solution a = new Solution();
		a.solution(250);
	}
}