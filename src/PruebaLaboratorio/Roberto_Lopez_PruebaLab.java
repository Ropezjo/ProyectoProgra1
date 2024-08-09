/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PruebaLaboratorio;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author rjl01
 */
public class Roberto_Lopez_PruebaLab {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        int opcion;
        int suma = 0;
        int primos=0;
        int Votaciones = 0;
        String PalabraAlreves="";
        
        do{
            System.out.println("***** MENU *****");
            System.out.println(" 1. Palabra Alreves ");
            System.out.println(" 2. Numero Perfecto ");
            System.out.println(" 3. Primos ");
            System.out.println(" 4. Votaciones ");
            System.out.println(" 5. Salir");
            System.out.println(" Por Favor escoger una opcion: ");
            opcion=lea.nextInt();
            
            
            if(opcion==1){
                String Palabra;
                System.out.println("Ingrese una palabra: ");
                Palabra=lea.next();
                
                
                
                for(int i=Palabra.length() - 1; i >=0; i--){
                    PalabraAlreves += Palabra.charAt(i);
                    
                }
                System.out.println(" la palabra alreves es: "+PalabraAlreves);
            }
            if (opcion == 2) {
                 
                    System.out.println("Ingrese un numero: ");
                    int numero = lea.nextInt();

                    
                       for (int perfecto = 1; perfecto <= numero / 2; perfecto++) {
                           if (numero % perfecto == 0) {
                                suma += perfecto;
                            }
                        }

                    if (suma == numero) {
                        System.out.print("El numero "+numero+" es perfecto  " );
                    } else {
                        System.out.print("El numero "+numero+" no es perfecto  " );
                     }
                    
            } else if (opcion == 3) {
                
                primos++;
                Random random = new Random();
                int numero = random.nextInt(100) + 1;
                int divisores = 0;

                System.out.println("Numero generado: " + numero);
                System.out.print("Divisores: ");

                for (int divisor = 1; divisor <= numero; divisor++) {
                    if (numero % divisor == 0) {
                        divisores++;
                        System.out.print(divisor + " ");
                    }
                }

                if (divisores == 2) {
                    System.out.println("El numero " + numero + " es primo. ");
                } else {
                    System.out.println("El numero " + numero + " no es primo. ");
                    
                    
                }

                    }else if (opcion==4){
                        
                    Votaciones++;
                System.out.print("Ingrese el numero de votantes: ");
                int numeroVotantes = lea.nextInt();
                lea.nextLine();
                int votosAzul = 0, votosRojo = 0, votosNegro = 0, votosAmarillo = 0, votosNulos = 0;

                for (int votanteActual = 0; votanteActual < numeroVotantes; votanteActual++) {
                    boolean votoValido = false;
                    while (!votoValido) {
                        System.out.print("Votante " + (votanteActual + 1) + ", ingrese su voto (Azul, Rojo, Negro, Amarillo): ");
                        String voto = lea.nextLine();
                        if (voto.equalsIgnoreCase("Azul")) {
                            votosAzul++;
                            votoValido = true;
                        } else if (voto.equalsIgnoreCase("Rojo")) {
                            votosRojo++;
                            votoValido = true;
                        } else if (voto.equalsIgnoreCase("Negro")) {
                            votosNegro++;
                            votoValido = true;
                        } else if (voto.equalsIgnoreCase("Amarillo")) {
                            votosAmarillo++;
                            votoValido = true;
                        } else {
                            votosNulos++;
                            System.out.println("Error: Voto no valido. Por favor, ingrese un voto valido.");
                        }
                    }
                }

                int votosValidos = votosAzul + votosRojo + votosNegro + votosAmarillo;
                double porcentajeValido = (double) votosValidos / (numeroVotantes + votosNulos) * 100;

                if (porcentajeValido >= 60) {
                    if (votosAzul > votosRojo && votosAzul > votosNegro && votosAzul > votosAmarillo) {
                        System.out.println("La planilla ganadora es: AZUL");
                    } else if (votosRojo > votosAzul && votosRojo > votosNegro && votosRojo > votosAmarillo) {
                        System.out.println("La planilla ganadora es: ROJO");
                    } else if (votosNegro > votosAzul && votosNegro > votosRojo && votosNegro > votosAmarillo) {
                        System.out.println("La planilla ganadora es: NEGRO");
                    } else {
                        System.out.println("La planilla ganadora es: AMARILLO");
                    }
                } else {
                    System.out.println("VOTACION FALLIDA");
                }
                System.out.println("Total de votos validos: " + votosValidos);
                System.out.println("Total de votos nulos: " + votosNulos);
            }
        }while (opcion!=5);
        
        
        System.out.println("*** *** Info *** ***");
        System.out.println("Palabra alreves: "+PalabraAlreves);
        System.out.println("Numero Perfecto: "+suma);
        System.out.println("Primos: "+primos);
        System.out.println("Votaciones: "+Votaciones);
        System.out.println("*** *** *** *** *** ***");
        
        
    }
}

