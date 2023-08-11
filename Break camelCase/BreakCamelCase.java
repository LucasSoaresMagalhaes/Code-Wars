class BreakCamelCase {
    public static void main(String[] args) {

        System.out.println(camelCase("CamelCasingTest"));

    }

    public static String camelCase(String input) {

        String retornar = input;
        int contador = 0;
        for (int i = 1; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                String auxFinal = input.substring(i);
                String auxInicio = retornar.substring(0, i + contador)+" ";
                retornar = auxInicio + auxFinal;
                contador++;
            }
        }

        return retornar;
    }

}