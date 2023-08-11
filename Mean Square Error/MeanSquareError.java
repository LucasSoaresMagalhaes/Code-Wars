class MeanSquareError {

    public static void main(String[] args) {

        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = { 4, 5, 6 };

        System.out.println(solution(arr1, arr2));

    }

    public static double solution(int[] arr1, int[] arr2) {
        int diferenca = 0;
        for (int i = 0; i < arr1.length; i++) {
            diferenca += (arr1[i] - arr2[i]) * (arr1[i] - arr2[i]);
        }
        return diferenca /= arr1.length;
    }

}
