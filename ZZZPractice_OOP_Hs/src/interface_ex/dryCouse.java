package interface_ex;

public interface dryCouse {

	public void dry();
	
    int LEG_COUNT = 4;  // 인터페이스 상수

    static int speed() {
        return LEG_COUNT * 30;
    }
}
