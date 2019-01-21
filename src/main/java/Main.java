import java.util.ArrayList;
import java.util.List;

import utils.MyUtils;

public class Main {

	public static void main(String[] args) {
		
		MyUtils utils = new MyUtils();
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		utils.sum(list);
		
		String s = "";
		String s1 = "Bonjour";
		
		utils.emptyToNull(s);
		utils.emptyToNull(s1);
		
		utils.filterEvenNumbers(list);
		
		utils.transformSquarePlusPointFive(list);
		
	}

}
