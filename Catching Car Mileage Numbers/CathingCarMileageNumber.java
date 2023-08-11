class CathingCarMileageNumber {

    public static void main(String[] args) {

    }

    public static int isInteresting(int number, int[] awesomePhrases) {

        for (int i = 0; i < awesomePhrases.length; i++) {
            if (number == awesomePhrases[i]) {
                return 1;
            }
        }
        int contadorCasa = 0;
        int aux = number;
        while (aux >= 1) {
            contadorCasa++;
            aux /= 10;
        }

        int[] numerosSeparados = new int[contadorCasa];

        aux = number;

        for (int i = 0; i < numerosSeparados.length; i++) {
            numerosSeparados[i] = aux % 10;
            aux /= 10;
        }

        char[] StringNumber = String.valueOf(number).toCharArray();
        boolean awesome = true;
        for (int i = 1; i < awesomePhrases.length; i++) {
            if (StringNumber[i] != '0') {
                awesome = false;
                break;
            }
        }

        if (awesome) {
            return 1;
        }

        awesome = true;

        for (int i = 0, j = 1; j < StringNumber.length; i++, j++) {
            if (StringNumber[i] != StringNumber[j]) {
                awesome = false;
                break;
            }
        }

        if (awesome) {
            return 1;
        }

        awesome = true;

        for (int i = 0, j = 1; j < StringNumber.length; i++, j++) {
            if (numerosSeparados[i] + 1 != numerosSeparados[j]) {
                awesome = false;
                break;
            }
        }

        if (awesome) {
            return 1;
        }

        awesome = true;

        for (int i = 0, j = 1; j < StringNumber.length; i++, j++) {
            if (numerosSeparados[i] - 1 != numerosSeparados[j]) {
                awesome = false;
                break;
            }
        }

        if (awesome) {
            return 1;
        }

        for(int i=0,j=numerosSeparados.length-1;i!=j){
            if(numerosSeparados[i] != numerosSeparados[j]){
                awesome = false;
                break;
            }
        }

        if(awesome){
            return 1;
        }

        return 0;
    }

}