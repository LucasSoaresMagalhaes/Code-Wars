class Triangle {

    public static void main(String[] args) {

        System.out.println(isTriangle(3, 10, 15));

    }

    public static boolean isTriangle(int a, int b, int c) {

        return a+b>c&&a+c>b&&b+c>a;
    }

}