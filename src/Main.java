import java.util.*;

public class Main {
    public static void main(String[] args) {
        /**
         * Creacion del usuario y sus datos
         * */
        Scanner sc = new Scanner(System.in);
        Scanner scG = new Scanner(System.in);
        Scanner scI = new Scanner(System.in);

        int opcion;
        Usuario u1 = new Usuario();
        Cuenta c1 = new Cuenta(u1);

        System.out.println("Introduce el nombre de usuario");
        String nombre = sc.nextLine();
        u1.setNombre(nombre);

        System.out.println("Introduce la edad del usuario");
        int edad = sc.nextInt();
        u1.setEdad(edad);

        System.out.println("Introduce el DNI del usuario");
        sc.nextLine(); //Videotutoria 4 al rescate
        String DNI = sc.nextLine();
        while (!u1.setDNI(DNI)) {
            System.err.println("Introduzca un DNI válido: ");
            DNI = new Scanner(System.in).nextLine();
        }
        u1.setDNI(DNI);

        System.out.println("Usuario creado correctamente");

        /**
         * Menú de la aplicación
         * */
        do {
            System.out.println("Realiza una nueva acción");
            System.out.println("1 Introduce un nuevo gasto");
            System.out.println("2 Introduce un nuevo ingreso");
            System.out.println("3 Mostrar gastos");
            System.out.println("4 Mostrar ingresos");
            System.out.println("5 Mostrar saldo");
            System.out.println("0 Salir");
            opcion = sc.nextInt();

            if (opcion > 5) {
                System.out.println("Escoja uno de los numeros válidos (0 - 5)");
            }
            //System.out.println(c1.getUsuario()); VER USUARIO ASIGNADO
            switch (opcion) {
                case 0:
                    System.out.println("Fin del programa. \nGracias por utilizar la aplicación.");
                    break;
                case 1:
                    System.out.println("Introduce la descripcion");
                    String description = scG.nextLine();
                    System.out.println("Introduce la cantidad");
                    Double cantidad = scG.nextDouble();
                    scG.nextLine();
                    c1.addGastos(description, cantidad);

                    System.out.println("Saldo restante: " + c1.getSaldo());
                    break;
                case 2:
                    System.out.println("Introduce la descripcion");
                    String descrip = scI.nextLine();
                    System.out.println("Introduce la cantidad");
                    Double cant = scI.nextDouble();
                    scI.nextLine();
                    c1.addIngresos(descrip, cant);
                    System.out.println("Saldo restante: " + c1.getSaldo());
                    break;
                case 3:
                    for (int i = 0; i < c1.getGastos().size(); i++) {
                        System.out.println(c1.getGastos().get(i));
                    }
                    break;
                case 4:
                    for (int i = 0; i < c1.getIngresos().size(); i++) {
                        System.out.println(c1.getIngresos().get(i));
                    }
                    break;
                case 5:
                    System.out.println("El saldo actual de la cuenta es: " + c1.getSaldo() + "€");
                    break;
            }
        } while (opcion != 0);
    }
}
