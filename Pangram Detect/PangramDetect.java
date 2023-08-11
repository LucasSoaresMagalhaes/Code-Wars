class PangramDetect {
    public static void main(String[] args) {
        String placeholder = "abcd45efghijklmnopqr56stuvw3xyz";

        System.out.println(check(placeholder));

    }

    public static boolean check(String sentence) {
        char alphabet;
        String x =sentence.toLowerCase().replaceAll("[^a-zA-Z]", "");
        System.out.println(x.toString());
        int contador = 0;
        for (alphabet = 'a'; alphabet <= 'z'; alphabet++) {
            for (int i = 0; i < x.length(); i++) {
                if (x.charAt(i) == alphabet) {
                    x = x.replaceAll(Character.toString(alphabet), "");
                    contador++;
                }
            }
        }
        if (!sentence.isEmpty() && x.toString().isEmpty() && contador == 26) {
            return true;
        }
        return false;

    }
}
