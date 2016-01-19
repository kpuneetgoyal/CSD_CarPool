package parent;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class findalist {

	public static void main(String[] args) {
		LinkedList<Integer> lList = new LinkedList<Integer>();
		LinkedList<Integer> sample1 = new LinkedList<Integer>();
		LinkedList<Integer> sample2 = new LinkedList<Integer>();

		lList.add(1);
		lList.add(2);
		lList.add(3);
		lList.add(4);
		lList.add(5);
		
		sample1.add(2);
		sample1.add(3);
		
		sample2.add(3);
		sample2.add(2);
		
		findSublist(lList, sample1);
		findSublist(lList, sample2);

	}

	private static void findSublist(LinkedList<Integer> lList, LinkedList<Integer> sample) {
		if (null == lList || null == sample || !(lList.size() > 0) || !(sample.size() > 0)) {
			return;
		}

		int sizeofsample = sample.size();
		int start = matchFirstElement(lList, sample.getFirst());
		int end = start + sizeofsample;
		int result = findsubList(lList, sample, start, end);
		System.out.println(result);
	}

	private static int findsubList(LinkedList<Integer> lList, LinkedList<Integer> sample, int start, int end) {
		List<Integer> temp1 = lList.subList(start, end);
		LinkedList<Integer> tempList = sample;
		for (Integer integer : temp1) {
			tempList.add(integer);
		}
		LinkedList<Integer> tempSample = sample;
		Iterator<Integer> iter = tempSample.iterator();
		while (iter.hasNext()) {
			if (tempList.getFirst() == tempSample.getFirst()) {
				tempList.removeFirst();
				tempSample.removeFirst();
			}else{
				return -1;
			}
		}
		return 0;
	}

	private static int matchFirstElement(LinkedList<Integer> lList, Integer value) {
		for (int i = 0; i <= lList.size() - 1; i++) {
			if (lList.get(i) == value) {
				return i;
			}
		}
		return -1;
	}

}
