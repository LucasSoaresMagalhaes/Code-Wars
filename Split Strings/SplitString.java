class SplitString {
    public static void main(String[] args) {

        String s = "abc";
        solution(s);

    }

    public static String[] solution(String s) {

        char[] arrayChar = s.toCharArray();
        String[] arrayString = new String[0];
        if (arrayChar.length % 2 == 0) {
            arrayString = new String[arrayChar.length / 2];

            for (int i = 0, j = 0; j < arrayChar.length; i++) {
                arrayString[i] = String.valueOf(arrayChar[j]) + String.valueOf(arrayChar[j + 1]);
                j += 2;
            }
        } else {
            arrayString = new String[arrayChar.length / 2 + 1];
            int aux = 0;
            for (int i = 0; i < arrayString.length; i++) {

                if (aux + 1 == arrayChar.length) {
                    arrayString[i] = String.valueOf(arrayChar[aux]) + "_";
                } else {
                    arrayString[i] = String.valueOf(arrayChar[aux]) + String.valueOf(arrayChar[aux + 1]);
                }
                aux += 2;

            }

        }
        return arrayString;
    }

}