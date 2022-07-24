package ArrayGugudan;

public class Gugudan {

	String result = "";

	void setGugudan(int inputdan) {
		for (int i = inputdan; i <= inputdan; i++) {
			for (int j = 1; j < 10; j++) {
				getGugudan();
				System.out.println(i + " * " + j + " =" + this.result + i * j);
			}
		}
		this.result = "";
	}

	String getGugudan() {
		this.result = result + " ";
		return result;
	}

	String getGugudan2(int inputdan) {
		String result = "";
		for (int i = inputdan; i <= inputdan; i++) {
			for (int j = 1; j < 10; j++) {
				setGugudan2();
				result += i + " * " + j + " =" + this.result + (i * j) + "\n";
			}
		}
		return result;
	}

	void setGugudan2() {
		this.result = result + " ";		
	}

}
