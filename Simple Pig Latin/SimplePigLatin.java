class SimplePigLatin {


    public String ASimplePigLatin(String str) {

        String[] palavras = str.split(" ");

        for (int i = 0; i < palavras.length; i++) {

            char[] letras = palavras[i].toCharArray();

            int k = letras.length - 1;

            if (!Character.isLetter(letras[k]) && k >= 0) {
                k--;
            }

            for (int j = 0; j + 1 <= k; j++) {

                char aux = letras[j];
                letras[j] = letras[j + 1];
                letras[j + 1] = aux;

            }

            palavras[i] = String.valueOf(letras);
        }

        String retorno = "";

        for (int i = 0; i < palavras.length; i++) {

            char caractereFinal = palavras[i].charAt(palavras[i].length()-1);

            boolean naoEPontoFinal = caractereFinal != '.' && caractereFinal != '?' && caractereFinal != '!'
                    && caractereFinal != ',' && caractereFinal != ';';

            if (naoEPontoFinal) {
                if (i < palavras.length - 1)
                    retorno += palavras[i] + "ay ";
                else {
                    retorno += palavras[i] + "ay";
                }
            } else {
                retorno += palavras[i];
            }
        }

        return retorno;
    }

}
