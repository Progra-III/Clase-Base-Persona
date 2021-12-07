import java.util.Scanner;

public class Principal {

    public static int verifyInt(String valor){
        try
        {
            int a= Integer.parseInt(valor);
            return a;
        }catch (NumberFormatException nfe)
        {
            return -1;
        }
    }
    
    public static void main(String[] args) {

        //explicacion equals

        String var1= "casa1";
        String var2= "casa";


        System.out.println(var1.equals(var2));

        //--------------------

        Person per1;
        per1 = new Person (2290, "Maria", 2001);

        Person per2= new Person(2291, "Juan", 2001);

        Person per3= new Person(2290, "Maria", 2001);

        System.out.println(per1.equals(per2));

        System.out.println(per1.toString());


        //pide los datos hasta que yo le de un numero-------------------------IClIISem
        Scanner capt= new Scanner(System.in);
        String valor;
        while(true){
            System.out.println("Ingrese un numero\t: ");
            valor= capt.nextLine();
            int valorInt= Principal.verifyInt(valor);
            if(valorInt != -1){
                break;
            }
        }
        System.out.println("El valor ingresado es: " +Integer.parseInt(valor));


        //explicacion de scanner -------------------------------------------------- IIClIISem
        Scanner capture= new Scanner (System.in);
        System.out.println("Ingrese un numero entero:");
        String variableString =capture.next();
        Integer intWrapper = Integer.parseInt(variableString);

        System.out.println("El numero ingresado es:" +intWrapper);


    }


}
