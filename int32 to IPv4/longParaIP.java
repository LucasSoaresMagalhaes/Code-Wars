class longParaIP {

    public static void main(String[] args) {

        System.out.println(longToIP(2154959208L));

    }

    public static String longToIP(long ip) {
        return ((ip >> 24) & 0xFF) + "." +
                ((ip >> 16) & 0xFF) + "." +
                ((ip >> 8) & 0xFF) + "." +
                (ip & 0xFF); // do it!
    }

}