import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //inicializando scanner y arreglo de calificaciones
        Scanner lector = new Scanner(System.in);
        int [] califS = new int[5];
        System.out.println("Por favor introduce tu nombre");
        String nombreS = lector.nextLine();

        //inicializando arreglo de calificaciones por medio del scanner
        System.out.println("Por favor introduce tus 5 calificaciones");

        //loop para recorrer arreglo
        for (int i = 0;i < califS.length; i++){
            califS[i] = lector.nextInt();
        }
        //inicializando objeto
        Calculo caliRes = new Calculo();
        caliRes.nombre = nombreS;
        caliRes.calif = califS;

        //llamando métodos de la clase para hacer operaciones
        int prom = caliRes.calcProm(califS);
        char caFinal  = caliRes.cFinal(prom);
        caliRes.resultados(nombreS, prom, caFinal);
    }
}