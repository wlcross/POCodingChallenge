package august22;

public class MedianSortedArrays {
	
	public static double median(int[] nums1, int [] nums2) {
		int m = nums1.length;
		int n = nums2.length;
		int length = m + n;
		
		if (length % 2 == 0) {
			int mCount = 0;
			int nCount = 0;
			for (int i = 0; i + 1 < length/2; i ++) {
				if (mCount >= m) {
					nCount ++;
				} else if (nCount >= n || nums1[mCount] < nums2[nCount]) {
					mCount ++;
				} else {
					nCount ++;
				}
			}
			
			int result = 0;
			
			//one
			if (mCount >= m) {
				result += nums2[nCount++];
			} else if (nCount >= n || nums1[mCount] < nums2[nCount]) {
				result += nums1[mCount++];
			} else {
				result += nums2[nCount++];
			}
					
			//two
			if (mCount >= m) {
				result += nums2[nCount];
			} else if (nCount >= n || nums1[mCount] < nums2[nCount]) {
				result += nums1[mCount];
			} else {
				result += nums2[nCount];
			}
						
			return result / 2.0;
			
		} else {
			int mCount = 0;
			int nCount = 0;
			for (int i = 0; i < length/2; i ++) {
				if (mCount >= m) {
					nCount ++;
				} else if (nCount >= n || nums1[mCount] < nums2[nCount]) {
					mCount ++;
				} else {
					nCount ++;
				}
			}
			
			if (mCount >= m) {
				return nums2[nCount];
			} else if (nCount >= n || nums1[mCount] < nums2[nCount]) {
				return nums1[mCount];
			} else {
				return nums2[nCount];
			}
			
		}
		
	}
	
	public static void main(String args[]) {
		int[] nums1 = {1};
		int[] nums2 = {2, 3, 4, 5};
		System.out.println(median(nums1, nums2));
		
	}

}
