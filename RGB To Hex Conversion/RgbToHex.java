class RGBToHex {

    public static void main(String[] args) {

        System.out.println(rgb(255, 255, 255));

    }

    public static String rgb(int r, int g, int b) {
        String RGB = "";
        if (r > 255) {
            r = 255;
        } else if (r < 0) {
            r = 0;
        }
        if (g > 255) {
            g = 255;
        } else if (g < 0) {
            g = 0;
        }
        if (b > 255) {
            b = 255;
        } else if (b < 0) {
            b = 0;
        }

        String R = Integer.toHexString(r).toUpperCase(), G = Integer.toHexString(g).toUpperCase(),
                B = Integer.toHexString(b).toUpperCase();

        if (Integer.toHexString(r).length() == 1) {
            R = "0" + R;
        }
        if (Integer.toHexString(g).length() == 1) {
            G = "0" + G;
        }
        if (Integer.toHexString(b).length() == 1) {
            B = "0" + B;
        }
        RGB = R;
        RGB += G;
        RGB += B;
        return RGB;
    }

}