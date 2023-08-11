class WriteNumberinExpandedForm {
    public static void main(String[] args) {

        System.out.println(numerosDivididos(70304));

    }

    public static String numerosDivididos(int num) {
        int aux = num;
        int contadorCasas = 0;
        while (aux >= 1) {
            contadorCasas++;
            aux /= 10;
        }

        int[] numeros = new int[contadorCasas];
        aux = num;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = aux % 10;
            for (int j = 0; j < i; j++) {
                numeros[i] *= 10;
            }
            aux /= 10;
        }

        int contadorNumeros = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] != 0) {
                contadorNumeros++;
            }
        }

        int[] numerosReais = new int[contadorNumeros];
        contadorNumeros = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] != 0) {
                numerosReais[contadorNumeros] = numeros[i];
                contadorNumeros++;
            }
        }

        String retorno = "";

        for (int i = numerosReais.length - 1; i >= 0; i--) {
            
            retorno+= numerosReais[i];
            if(i!=0){
                retorno += " + ";
            }

        }
        return retorno;
    }

    public static void imprimir(int[] vet) {
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + ";");
        }
        System.out.println();
    }

}