import java.util.Scanner; 

class Area_Perimetro
{
    public static void main(String[] args)
    {
        try(Scanner myObj = new Scanner(System.in))
        {
            double lado, apotema, radio, lado2;
            int Option;

            do {
                System.out.println("0.- Area y perimetro de cuadrado");
                System.out.println("1.- Area y perimetro de pentagono");
                System.out.println("2.- Area y perimetro de circulo");
                System.out.println("3.- Area y perimetro de triangulo");
                System.out.println("4.- Area y perimetro de rectangulo");
                System.out.println("5.- Exit");

                System.out.println("Ingresa una opcion: ");
                Option = myObj.nextInt();

                switch(Option)
                {
                    case 0 ->
                    {
                        System.out.println("Ingresa el valor en metros del lado del cuadrado:");
                        lado = myObj.nextDouble();
                        System.out.println("El area del cuadrado es: " + lado*lado*10000 + "cm^2");
                        System.out.println("El perimetro del cuadrado es: " + 4*lado);
                    }
                    case 1 ->
                    {
                        System.out.println("Ingresa el valor en metros del lado del pentagono:");
                        lado = myObj.nextDouble();
                        System.out.println("Ingresa el valor del apotema del pentagono:");
                        apotema = myObj.nextDouble();
                        System.out.println("El area del pentagono es: " + ((5*lado)*apotema)/2);
                        System.out.println("El perimetro del pentagono es: " + 5*lado);
                    }
                    case 2 ->
                    {
                        System.out.println("Ingresa el valor en metros del radio del circulo:");
                        radio = myObj.nextDouble();
                        System.out.println("El area del circulo es: " + Math.PI * (radio * radio));
                        System.out.println("El perimetro del circulo es: " + Math.PI * (2 * radio));
                    }
                    case 3 ->
                    {
                        System.out.println("Ingresa el valor en metros del lado del triangulo equilatero:");
                        lado = myObj.nextDouble();
                        System.out.println("El area del triangulo es: " + (lado*((Math.sqrt(3)*lado)/2))/2);
                        System.out.println("El perimetro del triangulo es: " + 3*lado);
                    }
                    case 4 -> 
                    {
                        System.out.println("Ingresa el valor en metros del lado pequeno del rectangulo:");
                        lado = myObj.nextDouble();
                        System.out.println("Ingresa el valor del lado grande del rectangulo:");
                        lado2 = myObj.nextDouble();
                        System.out.println("El area del cuadrado es: " + lado*lado2);
                        System.out.println("El perimetro del cuadrado es: " + (2*lado)+(2*lado2));
                    }
                    case 5 -> System.exit(0);
                    default -> System.out.println("Escoge una opcion dentro de lo requerido");
                }
            } while (Option <= 5);
        }
    }
}