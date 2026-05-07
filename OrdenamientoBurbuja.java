import java.util.Scanner;
public class OrdenamientoBurbuja {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Solicitar al usuario ingrese la cantidad de elementos

        System.out.print("Cuantos numeros desea ingresar al Arreglo: ");
        int cantidad = entrada.nextInt();
        //Crear un arreglo de tipo entero con la cantidad de elementos ingresados por el usuario
        int[] numeros = new int[cantidad];
        //Llenar el arreglo con los numeros ingresados por el usuario
        System.out.println("/nIngrese los numeros: ");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();

            }
        //Ordenar el arreglo utilizando el metodo de ordenamiento asendente burbuja
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {

                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
        //Imprimir el arreglo ordenado
        System.out.println("\nArreglo ordenado de forma ascendente: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        entrada.close();
    }
}