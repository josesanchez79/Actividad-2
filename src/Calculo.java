public class Calculo {

    //atributos
    public String nombre;
    public double [] calif;
    public Calculo (){

    }
    public Calculo (String nombre, double [] calif){
        this.nombre = nombre;
        this.calif = calif;
    }

    //método para cálculo del promedio
    public double calcProm (double [] calif){
        double prom = 0;
        for (double cali: calif){
            prom = prom + cali;
        }
        prom = prom / 5;
        return prom;
    }

    //método para determinar la calificación con el promedio
    public char cFinal (double prom){
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
    public void resultados(String nombre, double prom, char caFinal){
        System.out.println("Nombre del estudiante: " + nombre
                + "\nCalificación 1: " + calif[0]
                + "\nCalificación 2: " + calif[1]
                + "\nCalificación 3: " + calif[2]
                + "\nCalificación 4: " + calif[3]
                + "\nCalificación 5: " + calif[4]
                + "\nPromedio: " + prom
                + "\nCalificación: " +caFinal);
    }

}
