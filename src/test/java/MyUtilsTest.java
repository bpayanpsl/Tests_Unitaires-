import java.util.ArrayList;
import java.util.List;

import org.assertj.core.api.Assertions;
import org.assertj.core.data.Index;
import org.hamcrest.core.IsNull;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import utils.MyUtils;

public class MyUtilsTest {

	private MyUtils utils;

	@Before
	public void before() {
		utils = new MyUtils();
	}

	@Test
	public void sumTest() {
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(5);
		Assert.assertEquals(10, utils.sum(list));
	}

	@Test
	public void emptyToNullTest() {
		String s = null;
		Assert.assertThat(utils.emptyToNull(s), IsNull.nullValue());
		Assert.assertNull(utils.emptyToNull(s));
		String s1 = "B";
		Assert.assertNotNull(utils.emptyToNull(s1));
	}
	
	@Test
	public void filterEvenNumbersTest() {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		Assert.assertFalse(utils.filterEvenNumbers(list).contains(1));
	}
	
	@Test
	public void transformSquarePlusPointFiveTest() {
		List<Integer> list = new ArrayList<>();
		List<Float> list2 = new ArrayList<>();
		//float value = 0;
		list.add(2);
		list2 = utils.transformSquarePlusPointFive(list);
		/*for(float i : list2) {
			value = i;
		}
		Assert.assertEquals(4.5f, value, 0.1f);*/
		Assertions.assertThat(list2).contains(4.5f, Index.atIndex(0));	
	}
}
