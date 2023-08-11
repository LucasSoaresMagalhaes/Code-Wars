class StringToCamelCase {
    public static void main(String[] args) {
        System.out.println(toCamelCase("the-stealth-warrior"));
    }

    static String toCamelCase(String s) {
        if (!s.isEmpty()) {
            String[] novaString = s.split("[_\\-]");
            s = novaString[0];
            for (int i = 1; i < novaString.length; i++) {
                s += Character.toUpperCase(novaString[i].charAt(0)) + novaString[i].substring(1);
            }
        }
        return s;

    }
}