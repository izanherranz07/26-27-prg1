import java.util.Scanner;

public class DevolverCambio {

    public static void main(String[] args) {
        int BILLETE_100 = 100;
        int BILLETE_50 = 50;
        int BILLETE_20 = 20;
        int BILLETE_10 = 10;
        int BILLETE_5 = 5;
        int MONEDA_2 = 2;
        int MONEDA_1 = 1;

        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cuántos euros debe pagar?");
        int debePagar = teclado.nextInt();

        System.out.println("¿Con cuántos euros paga?");
        int pagaCon = teclado.nextInt();
    }
}