package Day14_Scope;

public class Solution {
    class Difference {
        private int[] elements;
        public int maximumDifference;

        Difference(int[] elements) {
            this.elements = elements;
        }

        int computeDifference() {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < elements.length; i++) {
                if (elements[i] < min) {
                    min = elements[i];
                } if (elements[i] > max) {
                    max = elements[i];
                }
            }

            maximumDifference = max - min;
            return maximumDifference;
        }
    }
}
