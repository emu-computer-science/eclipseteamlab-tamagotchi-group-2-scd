import java.util.ArrayList;
import java.util.Collections;

public class SetOfIntegers {
	ArrayList<Integer> SetofIntegers;
	String status = "[random]";
	public SetOfIntegers(ArrayList<Integer> x) {
		this.SetofIntegers=x;
	}
	void setStatus(String Current) {
		this.status = Current;
	}
	SetOfIntegers sort(SetOfIntegers y, String SortType){
			Collections.sort(y.SetofIntegers);
			y.status = "[increasing]";
			return y;
	}
	SetOfIntegers rev(SetOfIntegers y){
			Collections.sort(y.SetofIntegers, Collections.reverseOrder());
			y.status = "[decreasing]";
			return y;
	}
	SetOfIntegers random(SetOfIntegers y) {
			Collections.shuffle(y.SetofIntegers);
			y.status = "[random]";
			return y;
	}
	
	
}
