package array.classical;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author yifengguo
  Find all common elements in 3 sorted arrays.

	Assumptions
	
	The 3 given sorted arrays are not null
	There could be duplicate elements in each of the arrays
	Examples

	A = {1, 2, 2, 3}, B = {2, 2, 3, 5}, C = {2, 2, 4}, the common elements are [2, 2]


 */
public class CommonElementsInThreeSortedArray {
	public List<Integer> common(int[] a, int[] b, int[] c) {
		if (a == null || b == null || c == null) {
			return new ArrayList<>();
		}
		List<Integer> res = new ArrayList<>();
		int ai = 0, bi = 0, ci = 0;
		while (ai < a.length && bi < b.length && ci < c.length) {
			if (a[ai] == b[bi] && b[bi] == c[ci]) {
				res.add(a[ai]);
				ai++;
				bi++;
				ci++;
			} else if (a[ai] < b[bi] && a[ai] < c[ci]) {
				ai++;
			} else if (b[bi] < c[ci]) {
				bi++;
			} else {
				ci++;
			}
		}
		return res;
	}
}