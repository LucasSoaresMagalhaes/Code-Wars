class BitCount {

    public static void main(String[] args) {

        System.out.println(countBits(1234));

    }

    public static int countBits(int n) {

    n =Integer.bitCount(n);
    
    return n;
    }

}