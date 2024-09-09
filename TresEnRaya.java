import java.util.Scanner;
public class TresEnRaya {
    static boolean simbolo;

    static void imprmirTablero(char[][] tablero){
        for(int fila = 0; fila<tablero.length; fila++) {
            for(int columna = 0; columna <tablero[fila].length; columna++){
                System.out.print(tablero[fila][columna] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static char[][] eleccion(char[][] tablero){
        int columna, fila;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige columna");
        columna = scanner.nextInt();
        System.out.println("Elige fila");
        fila = scanner.nextInt();
        System.out.println();

        if(!simbolo){
            tablero[columna][fila] = 'X';
            simbolo=true;
        }else{
            tablero[columna][fila] = 'O';
            simbolo=false;
        }
        return tablero;
    }

    public static boolean noSeRepite(char[][] tablero) {
        // Comprobar filas
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] != '-' && tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2]) {
                System.out.println("Has Ganado!");
                return false;
            }
        }

        // Comprobar columnas
        for (int j = 0; j < 3; j++) {
            if (tablero[0][j] != '-' && tablero[0][j] == tablero[1][j] && tablero[1][j] == tablero[2][j]) {
                System.out.println("Has Ganado!");
                return false;
            }
        }

        // Comprobar diagonal principal
        if (tablero[0][0] != '-' && tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2]) {
            System.out.println("Has Ganado!");
            return false;
        }

        // Comprobar diagonal secundaria
        if (tablero[0][2] != '-' && tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0]) {
            System.out.println("Has Ganado!");
            return false;
        }

        // Si no se encontraron repeticiones, devolver true
        return true;
    }

    public static void main(String[] args) {
        char[][] tablero = {
            {'-','-','-'},
            {'-','-','-'},
            {'-','-','-'}
        };


        while(noSeRepite(tablero)){

        imprmirTablero(tablero);

        tablero = eleccion(tablero);

        }
    }

}
