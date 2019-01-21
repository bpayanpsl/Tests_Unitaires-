package utils;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyUtils {

	private static Logger LOG = LoggerFactory.getLogger(MyUtils.class);

	public int sum(List<Integer> list) {
		LOG.trace("Méthode sum()");
		int sum = 0;
		for (int i : list) {
			sum += i;
		}
		return sum;
	}

	public String emptyToNull(String s) {
		LOG.trace("Méthode emptyToNull()");
		if (s == null || s.isEmpty()) {
			LOG.info("NULL");
			return null;
		} else {
			LOG.info("NOT NULL. s = " +s);
			return s;
		}
	}

	public List<Integer> filterEvenNumbers(List<Integer> integers) {
		LOG.trace("Méthode filterEvenNumbers()");
		List<Integer> evenNumbers = new ArrayList<Integer>();
		for (Integer i : integers) {
			if (i % 2 == 0) {
				evenNumbers.add(i);
			}
		}
		return evenNumbers;
	}

	public List<Float> transformSquarePlusPointFive(List<Integer> integers) {
		LOG.trace("Méthode transformSquarePlusPointFive()");
		List<Float> squarePointFive = new ArrayList<Float>();
		float f = 0;
		for (int i : integers) {
			f = (i * i) + 0.5f;
			LOG.info("Index " +i+ " = "+f);
			squarePointFive.add(f);
		}
		return squarePointFive;
	}
}
