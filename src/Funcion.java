import java.util.Scanner;

public class Funcion {
    public static void main(String[] args) {

        String nombreProducto;
        double precioProducto;
        int cantidad;
        final double IMPUESTO = 0.21;
        double dineroCliente;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del producto: ");
        nombreProducto = sc.nextLine();

        System.out.print("Ingrese el precio del producto: ");
        precioProducto = sc.nextDouble();

        System.out.print("Ingrese la cantidad a comprar: ");
        cantidad = sc.nextInt();

        System.out.print("Ingrese el dinero que trae el cliente: ");
        dineroCliente = sc.nextDouble();

        double subtotal = precioProducto * cantidad;
        double totalAPagar = subtotal + (subtotal * IMPUESTO);

        int totalRedondeado = (int) totalAPagar;

        boolean puedeComprar = dineroCliente >= totalAPagar;

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