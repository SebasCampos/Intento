
package clase.pkg1;

import java.util.ArrayList;//Necesario para las listas
import java.util.List;//Necesario para las listas
import java.util.Scanner;

public class Metodos {
        
    public void pedir(){
        Scanner entrada = new Scanner (System.in);
        
        int num1;
        int num2;
        
        
        System.out.print("Digite un número: ");
        num1 = entrada.nextInt();
        
        System.out.print("Digite el otro número: ");
        num2 = entrada.nextInt();
        
        if (num1 < num2)
            System.out.print("EL número mayor es: "+num2);
        
        if (num1 > num2)
            System.out.print("El número mayor es: "+num1);
        
        if (num1 == num2)
            System.out.print("Ambos números son iguales");
    
    }
    
    public void intento(){
        Scanner num = new Scanner (System.in);
        
        
        System.out.println("Digite un numero: ");
        int num1 = num.nextInt();
        
        System.out.println("Digite otro numero: ");
        int num2 = num.nextInt();
        
        if (num1 < num2)
            System.out.print("El numero: "+num2+" es mayor");
        
        else
            System.out.print("Son iguales");}
    
    public void contador(){
        Scanner ask = new Scanner(System.in);
        List<String> data = new ArrayList<>();//*Recordar
                                                /*que se tiene que haer el import para la lista*/
        int contador;
        contador = 0;
        while ( contador < 3){
            System.out.print("Digite un nombre: ");
            String dato = ask.nextLine(); //nextLine se usa para strings 
            data.add(dato);
            
            contador++;}
        
        for (int cont = 0; cont <= data.size() - 1; cont++)
            System.out.println(data.get(cont));
        
    }
    
    public void mayorMenor(){//Dice cual es el número mayor y cual es el menor
        
        List<String> partici = new ArrayList<>();
        partici.add("Daniel");
        partici.add("Alonso");
        partici.add("Sofia");
        partici.add("Fabian");
        partici.add("Maria");
        
        Scanner x = new Scanner(System.in);
        
        System.out.println("Lista de participantes: \n"+partici);
        int cont;
        cont = 0;
        while (cont != 1){
            System.out.println("Desea eliminar un participante: ");
            String res =x.nextLine();
        
            if("si".equals(res)){//Averiguar que quiere decir ese equals
                System.out.println("Digite el nombre de la persona: ");
                String name = x.nextLine();
                if (partici.contains(name)){
                    partici.remove(name);
                    System.out.println("Nombre eliminado\nNueva Lista\n"+partici);}
                else
                    System.out.println("Nombre incorrecto");}
            else
                cont ++;}
        System.out.println("bye bye");}
    
    public void menu(){
        while(true){
            System.out.println("*** Menu Principal ***\n"
                + "1.Sumar\n2.Restar\n3.Numero Par"
                + "\n4.Lista de numeros\n5.Salir\n");
            Scanner entrada = new Scanner (System.in);
            System.out.println("Seleccione una opción: ");
            int op = entrada.nextInt();
          
            if(op == 1){
                System.out.println("Digite el primer número: ");
                int num1 = entrada.nextInt();
                
                System.out.println("Digite el segundo número: ");
                int num2 = entrada.nextInt();
                
                int suma = num1 + num2;
                
                System.out.println("El resultado es: "+suma);}
                
            else if (op == 2){
                System.out.println("Digite el primer número: ");
                int num1 = entrada.nextInt();
                
                System.out.println("Digite el segundo número: ");
                int num2 = entrada.nextInt();
                
                int resta = num1 - num2;
                
                System.out.println("El resultado de la resta es: "+resta);}
            
            else if (op == 3){
                System.out.println("Digite el numero que desea verificar: ");
                int num =  entrada.nextInt();
                
                if (num%2 == 0){
                    System.out.println("Si es un número par");}
                else
                    System.out.println("No es un número par");}
            
            else if (op == 4){
                List<Integer> numero = new ArrayList<>();
                numero.add(1);
                numero.add(2);
                numero.add(65);
                System.out.println("Números en la lista\n"+numero);
                System.out.println("Digite el numero que desea agregar: ");
                int nuevo = entrada.nextInt();
                numero.add(nuevo);
                System.out.println("Se agrego con exito el numero\n"+numero);}
                
            else if (op == 5){
                System.out.println("Gracias por usar la aplicación");    
                break;       
            }
            else  
            //if (op != 1 & op != 2 & op != 3 & op != 4 & op != 5){
                System.out.println("Entrada Invalida");
                
            
               
            }
           
            }
                        
    public void switchMenu(){
        Scanner entrada = new Scanner(System.in);
        Scanner ask = new Scanner(System.in);
        System.out.println("*** Main menu ***\n1.Registrarse\n2.Log In"
                + "\n3.Salir");
        int op = entrada.nextInt();
        switch(op){//El switch es como usado para validar varias opciones
            /*Tal vez sea la mejor manera de hacer un menu*/
            case (1):
                
                System.out.print("Digite su nombre: ");
                String nombre = ask.nextLine();//guarda strings
                System.out.println("Digite su cedula: ");
                int cedula = entrada.nextInt();
                
                System.out.println("Registro exitoso");
                break;
                
            case (2):
                List<String> datos = new ArrayList<>();
                datos.add("asdf");
                datos.add("2345");
                
                
                System.out.print("Digite su usuario: ");
                String user = ask.nextLine();
                System.out.println("Digite su contraseña: ");
                String password = ask.nextLine();
                
                if( datos.contains(user) & datos.contains(password)){
                    System.out.println("Acceso concedido");
                    break;}
                else
                    System.out.println("Datos incorrectos");
                    break;
                    
            case (3):
                System.out.println("Gracias por usar la aplicacion");
                break;
                          
                                
                    
                    
                    
                    
                    
                }
                    
             
                
                    
                
                
                
                
                
                
                
            
        }
    
    public void breteListas(){
        List <String> datos = new ArrayList<>();
        datos.add("Daniel");
        datos.add("Raquel");
        datos.add("Juan");
        datos.add("Silvia");
        datos.add("Maria");
        Scanner op = new Scanner(System.in);
        Scanner data = new Scanner(System.in);
        System.out.print("Nombres actuales:\n"+datos);
        while(true){
            System.out.println("Opciones***\n1.Agregar\n2.Eliminar"
                    + "\n3.Modificar\n4.Salir");
            int choice = op.nextInt();
            
            switch (choice){
                case (1):
                    System.out.println("Digite el nombre que desea agregar: ");
                    String newName = data.nextLine();
                    
                    datos.add(newName);
                    break;
                case (2):
                    System.out.println("Nombres\n"+datos);
                    System.out.println("Digite el nombre que desea eliminar: ");
                    String name = data.nextLine();
                    if (datos.contains(name)){
                        datos.remove(name);
                        System.out.println("Acción exitosamente");
                        break;}
                    else
                        System.out.println("Nombre erroneo");
                        break;
                        
                case (3):
                    System.out.print("Nombre**\n"
                            +datos+ "\nDigite el nombre que desea modificar: ");
                    String nombre = data.nextLine();
                    if (datos.contains(nombre)){
                        System.out.println("Digite el nuevo nombre: ");
                        String newDato = data.nextLine();
                        int pos = datos.indexOf(nombre);
                        datos.set(pos,newDato);//SET es un insert
                        datos.remove(nombre);
                        break;    }
                    
                    else
                        System.out.println("El nombre no existe en la lista");
                        break;
                
                case (4):
                    System.out.println("Gracias por usar la aplicación");
                    break;
                        
                        
                        
                        
                    
                    
                    
                    
                
                    
                    
                    
                    
                    
           
                        
                        
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                       
            
            
            
            }
            
                    
            
            
        }
        
        
    }
    
    }          
                
            
                       
            
            
    
    
    
    

