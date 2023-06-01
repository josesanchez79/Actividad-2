public class Calculo {

    //atributos
    public String nombre;
    public int [] calif;
    public Calculo (){

    }
    public Calculo (String nombre, int [] calif){
        this.nombre = nombre;
        this.calif = calif;
    }

    //método para cálculo del promedio
    public int calcProm (int [] calif){
        int prom = 0;
        for (int cali: calif){
            prom = prom + cali;
        }
        prom = prom / 5;
        return prom;
    }

    //método para determinar la calificación con el promedio
    public char cFinal (int prom){
        char caFinal = 'N';
        if (prom <= 50){
            caFinal = 'F';
        }
        if (prom >= 51 && prom <= 60){
            caFinal = 'E';
        }
        if (prom >= 61 && prom <= 70){
            caFinal = 'D';
        }
        if (prom >= 71 && prom <= 80){
            caFinal = 'C';
        }
        if (prom >= 81 && prom <= 90){
            caFinal = 'B';
        }
        if (prom >= 91 && prom <= 100){
            caFinal = 'A';
        }
        return caFinal;
    }

    //método para imprimir resultados
    public void resultados(String nombre, int prom, char caFinal){
        System.out.println("\n Nombre del estudiante: " + nombre
                + "\n Calificación 1: " + calif[0]
                + "\n Calificación 2: " + calif[1]
                + "\n Calificación 3: " + calif[2]
                + "\n Calificación 4: " + calif[3]
                + "\n Calificación 5: " + calif[4]
                + "\n Promedio: " + prom
                + "\n Calificación: " +caFinal);
    }

}
