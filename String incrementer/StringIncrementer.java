class StringIncrementer {
    public static void main(String[] args) {
System.out.println(incrementString("foobar000"));
    }

    public static String incrementString(String str) {
        int teste = 0;

        try {
            teste = Integer.parseInt(str);
            str.replaceAll(String.valueOf(teste), "");
            teste++;
            str = str + String.valueOf(teste);
            return str;
        } catch (NumberFormatException x) {

        }

        return str + "1"; // you code here
    }

}