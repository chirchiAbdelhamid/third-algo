package com.ncq.thirdAlgo;

public class Solution {
	public int[] solution(int[] A, int[] B) {
        final int[] cn = new int[A.length < 2 ? 2 : A.length];
        cn[0] = 1;
        cn[1] = 2;
        for (int i = 2; i < A.length; i++) {
            cn[i] = (cn[i - 1] + cn[i - 2]) & ((1 << 30) - 1);
        }
        for (int i = 0; i < A.length; i++) {
            A[i] = cn[A[i] - 1] & ((1 << B[i]) - 1);
        }
        return A;
    }

}
