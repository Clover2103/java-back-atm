public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, JavaBanck ATM! Version control with Git");

        // Vaiables basicas
        String accountNumber = "123456789";
        double balance = 1500.75;
        int pin = 1234;

        // Array de monto s de transacciones
        int[] trasactionAmounts = {200,-100, 50};

        // Operaciones con variables
        balance += trasactionAmounts[0]; // Deposito
        if (balance > 0 && pin == 1234) {
            System.out.println("Acceso concedido");
        }

        //Uso de operadores
        balance++; //incremento
        String status = (balance < 0) ? "Deuda" : "Credito";
        System.out.println("EStado de cuenta: " + status);
    }
}