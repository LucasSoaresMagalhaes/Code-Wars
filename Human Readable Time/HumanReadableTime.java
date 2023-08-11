class HumanReadableTime {

    public static void main(String[] args) {

        System.out.println(makeReadable(37085));

    }

    public static String makeReadable(int seconds) {

        int segundos = 0, minutos = 0, horas = 0;

        if (seconds < 359999) {
            for (int i = 0; i < seconds; i++) {
                segundos++;
                if (segundos == 60) {
                    minutos++;
                    segundos = 0;
                    if (minutos == 60) {
                        horas++;
                        minutos = 0;
                    }
                }
            }
        } else {
            horas = 99;
            minutos = 59;
            segundos = 59;
        }

        String Shoras, Sminutos, Ssegundos;

        Shoras = horas >= 10 ? String.valueOf(horas) : 0+ String.valueOf(horas);
        Sminutos = minutos >= 10 ? String.valueOf(minutos) : 0+String.valueOf(minutos);
        Ssegundos = segundos >= 10 ? String.valueOf(segundos) : 0+String.valueOf(segundos);


        String retorno = Shoras + ":" + Sminutos + ":" + Ssegundos;

        return retorno;
    }

}