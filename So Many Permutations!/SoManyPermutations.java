import java.util.ArrayList;
import java.util.List;

class SoManyPermutations {

    public static List<String> singlePermutations(String s) {

        List<String> Lista = new ArrayList<>();

        char[] arrayChar = s.toCharArray();
        int numeroPossibilidades = arrayChar.length;

        for (int i = 1; i <= arrayChar.length; i++) {
            numeroPossibilidades *= i;
        }

        for (int i = 0; i < numeroPossibilidades; i++) {
            
        }

        return Lista;
    }

}