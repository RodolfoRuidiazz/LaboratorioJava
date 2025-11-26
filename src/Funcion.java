import java.util.Scanner;

public class Funcion {
    public static void main(String[] args) {

        // 1. Definición de datos
        String nombreProducto;
        double precioProducto;
        int cantidad;
        final double IMPUESTO = 0.21;   // 21%
        double dineroCliente;

        Scanner sc = new Scanner(System.in);

        // 2. Entrada de datos
        System.out.print("Ingrese el nombre del producto: ");
        nombreProducto = sc.nextLine();

        System.out.print("Ingrese el precio del producto: ");
        precioProducto = sc.nextDouble();

        System.out.print("Ingrese la cantidad a comprar: ");
        cantidad = sc.nextInt();

        System.out.print("Ingrese el dinero que trae el cliente: ");
        dineroCliente = sc.nextDouble();

        // 3. Lógica de negocio
        double subtotal = precioProducto * cantidad;
        double totalAPagar = subtotal + (subtotal * IMPUESTO);

        // Reto de casting
        int totalRedondeado = (int) totalAPagar;

        // 4. Validación
        boolean puedeComprar = dineroCliente >= totalAPagar;

        // 5. Salida: imprimir ticket
        System.out.println("\n===== TICKET DE COMPRA =====");
        System.out.println("Producto: " + nombreProducto);
        System.out.println("Precio unitario: $" + precioProducto);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Impuesto (21%): $" + (subtotal * IMPUESTO));
        System.out.println("Total a pagar: $" + totalAPagar);
        System.out.println("Total redondeado (promoción): $" + totalRedondeado);
        System.out.println("Dinero del cliente: $" + dineroCliente);
        System.out.println("¿Compra aprobada?: " + puedeComprar);
        System.out.println("==============================");
    }
}