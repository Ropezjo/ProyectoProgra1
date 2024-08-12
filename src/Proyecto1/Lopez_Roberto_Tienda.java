/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Proyecto1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 *
 */
public class Lopez_Roberto_Tienda {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        //Menu Principal
        int opcion = 0;
        boolean opcionValida = false;

        //1.- Abrir Caja
        double efectivoCaja = 0, efectivoCajaTotal = 0;

        //2.- Ventas
        String opcionCliente = "";
        double precioAzucar = 30, precioAvena = 25, precioTrigo = 32, precioMaiz = 20;
        double subtotalAzucar = 0, subtotalAvena = 0, subtotalTrigo = 0, subtotalMaiz = 0;
        double subtotalFinal = 0, descuento = 0, impuesto = 0, totalFinal = 0;
        String porcentaje = "0%";
        int contadorAzucar = 0, contadorAvena = 0, contadorTrigo = 0, contadorMaiz = 0;
        int contadorAzucarF = 0, contadorAvenaF = 0, contadorTrigoF = 0, contadorMaizF = 0;
        double kilogramosVendidosAzucar = 0, kilogramosVendidosAvena = 0, kilogramosVendidosTrigo = 0, kilogramosVendidosMaiz = 0;
        boolean factura = false, codigoValido = false;
        double porcentajeDescuento=0;
        
        //3.- Compras
        int codigoProducto = 0;
        String productoFactura;
        
        //4.- Reportes
        int contadorCompras = 0, contadorVentas = 0;
        double inventarioAzucar = 0, inventarioAvena = 0, inventarioTrigo = 0, inventarioMaiz = 0;
        double margenGanancia = 0;
        String primerLugar = "Sin Producto", segundoLugar = "Sin Producto", tercerLugar = "Sin Producto", cuartoLugar = "Sin Producto";
        int maxCount, secondMaxCount, thirdMaxCount, fourthMaxCount;
        double cantidadPrimerLugar = 0.0, cantidadSegundoLugar = 0.0, cantidadTercerLugar = 0.0, cantidadCuartoLugar = 0.0;
        double totalCReportes = 0, totalVReportes = 0;
        double gananciasCMayor = 0, gananciasVMayor = 0, valorMVentas = 0, valorMCompras = 0;
        
        //Cierre de Caja
        double depositoMaximo=0, deposito=0;
        
       System.out.println("-------- EFECTIVO CAJA --------\n");
       boolean validInput = false;

        while (!validInput)
        {
          System.out.println("¿Cuánto efectivo desea ingresar?");
          System.out.print("Lps. ");

          try {
             efectivoCaja = leer.nextDouble();
             if (efectivoCaja < 0) {
                System.out.println("\nEl monto debe ser positivo. Inténtalo nuevamente.\n");
             } 
             else {
                validInput = true;
             }
             }  catch (InputMismatchException e) {
                System.out.println("\n*** Entrada inválida. Por favor, ingrese un número. ***\n");
                leer.next();
             }
        }

          efectivoCajaTotal += efectivoCaja;
          System.out.println("\nTu efectivo actual es: Lps. " + efectivoCajaTotal + "\n\n");
        
        

        do {
            opcionValida = false;
            while (!opcionValida) {
                System.out.println("----------- MENÚ PRINCIPAL -----------");
                System.out.println("1.- Abrir Caja");
                System.out.println("2.- Ventas");
                System.out.println("3.- Compras");
                System.out.println("4.- Reportes");
                System.out.println("5.- Cierre de Caja");
                System.out.println("6.- Salir");
                System.out.println("---------------------------------------");
                System.out.println("        Códigos: 1/2/3/4/5/6");
                System.out.print("Seleccione una opción: ");

                try {
                        opcion = leer.nextInt();
                        if (opcion >= 1 && opcion <= 6) {
                            opcionValida = true; 
                        } else {
                            System.out.println("\n*** Opción no válida ***\n");
                            System.out.println("Códigos: 1/2/3/4/5/6");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("\n*** Entrada no válida. Por favor, ingrese un número. ****\n");
                        leer.next(); 
                    }
            }
            
            //Switch
            switch (opcion) {
                case 1:
                    //Efectivo Caja
                    System.out.println("\n\n");
                    System.out.println("-------- EFECTIVO CAJA --------\n");
                    validInput = false;

                    while (!validInput) {
                        System.out.println("¿Cuánto efectivo desea ingresar?");
                        System.out.print("Lps. ");

                        try {
                            efectivoCaja = leer.nextDouble();
                            if (efectivoCaja < 0) {
                                System.out.println(" El monto debe ser positivo. Inténtalo nuevamente.");
                            } else {
                                validInput = true;
                            }
                        } catch (InputMismatchException e) {
                            System.out.println(" Entrada inválida. Por favor, ingrese un número.");
                            leer.next();
                        }
                    }

                    efectivoCajaTotal += efectivoCaja;
                    System.out.println("\nTu efectivo actual es: Lps. " + efectivoCajaTotal + "\n\n");

                    break;

                case 2:
                    //Ventas
                    opcionValida=false;
                    while (!opcionValida) {
                        System.out.println("\n\n");
                        System.out.println("----------- VENTAS ----------");
                        System.out.println("     Tipo de Cliente");
                        System.out.println("a.- Tipo A");
                        System.out.println("b.- Tipo B");
                        System.out.println("c.- Tipo C");
                        System.out.println("d.- Volver a Menú");
                        System.out.println("----------------------------");
                        System.out.println("     Códigos: a/b/c/d");
                        System.out.print("Ingrese el código del cliente: ");

                        try {
                            opcionCliente = leer.next().toUpperCase(); 

                            if (opcionCliente.equals("A") || opcionCliente.equals("B") || opcionCliente.equals("C") || opcionCliente.equals("D")) {
                                opcionValida = true; 
                            } else {
                                System.out.println("\nCódigo no válido. Por favor, ingrese a/b/c/d.\n");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("\nEntrada no válida. Por favor, ingrese un código válido.\n");
                            leer.next(); 
                        }
                    }
                    
                    if (opcionCliente.equals("A") || opcionCliente.equals("B") || opcionCliente.equals("C")) 
                    {                 
                        boolean continuarComprando = true; 
                        
                        while (continuarComprando) {
                            
                            boolean productoValido = false;
                            double precioUnitario = 0;
                            
                            // Mostrar menú de productos
                            System.out.println("\n\n");
                            System.out.println("------------ VENTAS ------------");
                            System.out.println("¿Qué producto desea comprar?");
                            System.out.println("1. Azúcar");
                            System.out.println("2. Avena");
                            System.out.println("3. Trigo");
                            System.out.println("4. Maíz");
                            System.out.println("5. Volver al menú");
                            System.out.println("----------------------------");
                            System.out.println("        CLIENTE TIPO " + opcionCliente);
                         
                             switch (opcionCliente) 
                             {
                                case "A":
                                    while (!codigoValido) {
                                        System.out.println("\nCódigos: 1/2/3/4");
                                        System.out.print("Ingrese el código del producto: ");

                                        try {
                                            codigoProducto = leer.nextInt();
                                            if (codigoProducto == 1 || codigoProducto == 2 || codigoProducto == 3 || codigoProducto == 4) {
                                                codigoValido = true; 
                                            } else {
                                                System.out.println("\n*** No se puede comprar dicho producto ***\n");
                                            }
                                        } catch (InputMismatchException e) {
                                            System.out.println("\nEntrada no válida. Por favor, ingrese un número entero.\n");
                                            leer.next(); 
                                        }
                                    }
                                    
                                    if (codigoProducto == 1) {
                                        productoValido = true;
                                        precioUnitario = 30.0;
                                        productoFactura = "Azúcar";
                                    } else if (codigoProducto == 2) {
                                        productoValido = true;
                                        precioUnitario = 25.0;
                                        productoFactura = "Avena";
                                    } else if (codigoProducto == 3) {
                                        productoValido = true;
                                        precioUnitario = 32.0;
                                        productoFactura = "Trigo";
                                    } else if (codigoProducto == 4) {
                                        productoValido = true;
                                        precioUnitario = 20.0;
                                        productoFactura = "Maíz";
                                    }
                                    break;
                                    
                                case "B":
                                    System.out.println("Códigos: 1/2/3");
                                    System.out.print("Ingrese el código del producto: ");
                                    codigoProducto = leer.nextInt();
                                    
                                    if (codigoProducto != 2 && codigoProducto !=3)
                                    {
                                        System.out.println("\n*** No se puede comprar dicho producto ***\n");
                                    }
                                    
                                    if (codigoProducto == 1) {
                                        productoValido = true;
                                        precioUnitario = 30.0;
                                        productoFactura = "Azúcar";
                                    } else if (codigoProducto == 2) {
                                        productoValido = true;
                                        precioUnitario = 25.0;
                                        productoFactura = "Avena";
                                    } else if (codigoProducto == 3) {
                                        productoValido = true;
                                        precioUnitario = 32.0;
                                        productoFactura = "Trigo";
                                    } 
                                    break;
                                    
                                case "C":
                                    System.out.println("Códigos: 4");
                                    System.out.print("Ingrese el código del producto: ");
                                    codigoProducto = leer.nextInt();
                                    
                                    if (codigoProducto != 2)
                                    {
                                        System.out.println("\n*** No se puede comprar dicho producto ***\n");
                                    }
                                    
                                    if (codigoProducto == 4) {
                                        productoValido = true;
                                        precioUnitario = 20.0;
                                        productoFactura = "Maíz";
                                    }
                                    break;
                                case "D":
                                    continuarComprando = false;
                                    break;
                            }
                             
                            if (continuarComprando) {
                                System.out.print("Ingrese la cantidad en kilogramos: ");
                                double cantidadProducto = leer.nextDouble();

                                if (opcionCliente.equals("A") && codigoProducto == 1 && cantidadProducto <= inventarioAzucar) {
                                    subtotalAzucar = precioAzucar * cantidadProducto;
                                    inventarioAzucar -= cantidadProducto;
                                    subtotalFinal += subtotalAzucar;
                                    contadorAzucar++;
                                    contadorAzucarF++;
                                    kilogramosVendidosAzucar += cantidadProducto;
                                } else if (opcionCliente.equals("A") && codigoProducto == 2 && cantidadProducto <= inventarioAvena) {
                                    subtotalAvena = precioAvena * cantidadProducto;
                                    inventarioAvena -= cantidadProducto;
                                    subtotalFinal += subtotalAvena;
                                    contadorAvena++;
                                    contadorAvenaF++;
                                    kilogramosVendidosAvena += cantidadProducto;
                                } else if (opcionCliente.equals("A") && codigoProducto == 3 && cantidadProducto <= inventarioTrigo) {
                                    subtotalTrigo = precioTrigo * cantidadProducto;
                                    inventarioTrigo -= cantidadProducto;
                                    subtotalFinal += subtotalTrigo;
                                    contadorTrigo++;
                                    contadorTrigoF++;
                                    kilogramosVendidosTrigo += cantidadProducto;
                                } else if (opcionCliente.equals("A") && codigoProducto == 4 && cantidadProducto <= inventarioMaiz) {
                                    subtotalMaiz = precioMaiz * cantidadProducto;
                                    inventarioMaiz -= cantidadProducto;
                                    subtotalFinal += subtotalMaiz;
                                    contadorMaiz++;
                                    contadorMaizF++;
                                    kilogramosVendidosMaiz += cantidadProducto;
                                } else if (opcionCliente.equals("B") && codigoProducto == 1 && cantidadProducto <= inventarioAzucar) {
                                    subtotalAzucar = precioAzucar * cantidadProducto;
                                    inventarioAzucar -= cantidadProducto;
                                    subtotalFinal += subtotalAzucar;
                                    contadorAzucar++;
                                    contadorAzucarF++;
                                    kilogramosVendidosAzucar += cantidadProducto;
                                } else if (opcionCliente.equals("B") && codigoProducto == 2 && cantidadProducto <= inventarioAvena) {
                                    subtotalAvena = precioAvena * cantidadProducto;
                                    inventarioAvena -= cantidadProducto;
                                    subtotalFinal += subtotalAvena;
                                    contadorAvena++;
                                    contadorAvenaF++;
                                    kilogramosVendidosAvena += cantidadProducto;
                                } else if (opcionCliente.equals("B") && codigoProducto == 3 && cantidadProducto <= inventarioTrigo) {
                                    subtotalTrigo = precioTrigo * cantidadProducto;
                                    inventarioTrigo -= cantidadProducto;
                                    subtotalFinal += subtotalTrigo;
                                    contadorTrigo++;
                                    contadorTrigoF++;
                                    kilogramosVendidosTrigo += cantidadProducto;
                                } else if (opcionCliente.equals("C") && codigoProducto == 4 && cantidadProducto <= inventarioMaiz) {
                                    subtotalMaiz = precioMaiz * cantidadProducto;
                                    inventarioMaiz -= cantidadProducto;
                                    subtotalFinal += subtotalMaiz;
                                    contadorMaiz++;
                                    contadorMaizF++;
                                    kilogramosVendidosMaiz += cantidadProducto;
                                } else {
                                    System.out.println("\n *** Cantidad insuficiente en inventario *** \n");
                                }

                                if (continuarComprando) {
                                    System.out.print("\n¿Desea continuar comprando? (s/n): ");
                                    String comprar_Respuesta = leer.next().toLowerCase();
                                    if (comprar_Respuesta.equals("n")) {
                                        continuarComprando = false;
                                        factura = true;
                                    }
                                }
                            }
                        }

                        if (!continuarComprando || factura) {
                            if (subtotalFinal >= 1000) {
                                porcentajeDescuento = 0.1; // 10% descuento
                                porcentaje = "10%";
                            } else if (subtotalFinal >= 500) {
                                porcentajeDescuento = 0.05; // 5% descuento
                                porcentaje = "5%";
                            } else {
                                 porcentaje = "0%";
                                porcentajeDescuento = 0;
                            }

                            descuento = subtotalFinal * porcentajeDescuento;
                            impuesto = subtotalFinal * 0.7; // 7% impuesto
                            totalFinal = subtotalFinal + impuesto - descuento;

                            System.out.println();
                            System.out.println("------------------ FACTURA --------------------");
                            System.out.printf(" %-15s %-20s %-10s %s%n", "Producto", "Cantidad", "Subtotal", "Total");
                            System.out.printf(" %-15s %-20s %-10.2f %.2f%n", "Azúcar:", contadorAzucarF + " ventas, " + kilogramosVendidosAzucar + " kg", subtotalAzucar, subtotalAzucar);
                            System.out.printf(" %-15s %-20s %-10.2f %.2f%n", "Avena:", contadorAvenaF + " ventas, " + kilogramosVendidosAvena + " kg", subtotalAvena, subtotalAvena);
                            System.out.printf(" %-15s %-20s %-10.2f %.2f%n", "Trigo:", contadorTrigoF + " ventas, " + kilogramosVendidosTrigo + " kg", subtotalTrigo, subtotalTrigo);
                            System.out.printf(" %-15s %-20s %-10.2f %.2f%n", "Maíz:", contadorMaizF + " ventas, " + kilogramosVendidosMaiz + " kg", subtotalMaiz, subtotalMaiz);
                            System.out.println("--------------------------");
                            System.out.printf(" %-15s %-20.2f%n", "Total Subtotal:", subtotalFinal);
                            System.out.printf(" %-15s %-20.2f%n", "Total Impuesto - 7%:", impuesto);
                            System.out.printf(" %-15s %-20.2f%n", "Total Descuento - " + porcentaje + ": ", descuento);
                            System.out.printf(" %-15s %-20.2f%n", "Total Final:", totalFinal);
                            System.out.println("--------------------------\n\n");
                            
                            totalVReportes += totalFinal;
                            
                            if (totalFinal > gananciasVMayor) { // Compra con más gasto efectuada
                                gananciasVMayor = totalFinal;
                            }
                            
                            continuarComprando=false;
                        }
                    }
                    break;
                    
                case 3:
                    //Compras
                    System.out.println("\n\n");
                    System.out.print("---------- Compras ----------\n");
                    System.out.println("     Tipo de Proveedor");
                    System.out.println("a.- Tipo A");
                    System.out.println("b.- Tipo B");
                    System.out.println("c.- Tipo C");
                    System.out.println("d.- Volver a Menú");
                    System.out.println("----------------------------");
                    System.out.println("     Códigos: a/b/c/d");
                    System.out.print("Ingrese el código del cliente: ");
                    opcionCliente = leer.next().toUpperCase();
                    
                    while (!opcionCliente.equals("A") && !opcionCliente.equals("B") && !opcionCliente.equals("C") && !opcionCliente.equals("D")) {
                        System.out.println("\n*** Su tipo de cliente es inválido ***\n");
                        System.out.println("Códigos: a/b/c/d");
                        System.out.print("Opci[on: ");
                        opcionCliente = leer.next().toUpperCase();
                    }
                    
                    if (opcionCliente.equals("A") || opcionCliente.equals("B") || opcionCliente.equals("C")) 
                    {                 
                        boolean continuarComprando = true; 
                        
                        while (continuarComprando) {
                            
                            boolean productoValido = false;
                            double precioUnitario = 0;
                            
                            // Mostrar menú de productos
                            System.out.println("\n\n");
                            System.out.println("---------- COMPRAS ----------");
                            System.out.println("¿Qué producto desea comprar?");
                            System.out.println("1. Azúcar");
                            System.out.println("2. Avena");
                            System.out.println("3. Trigo");
                            System.out.println("4. Maíz");
                            System.out.println("5. Volver al menú");
                            System.out.println("----------------------------");
                            System.out.println("        PROVEEDOR TIPO " + opcionCliente);
                         
                             switch (opcionCliente) 
                             {
                                case "A":
                                   while (!codigoValido) {
                                    System.out.println("Códigos: 1/4");
                                    System.out.print("Ingrese el código del producto: ");

                                    try {
                                        codigoProducto = leer.nextInt();

                                        if (codigoProducto == 1 || codigoProducto == 4) {
                                            codigoValido = true; 
                                        } else {
                                            System.out.println("\n*** Proveedor no vende dicho producto ***\n");
                                        }
                                    } catch (InputMismatchException e) {
                                        System.out.println("Entrada no válida. Por favor, ingrese un número entero.");
                                        leer.next(); 
                                    }
                                }
                                    
                                    if (codigoProducto == 1) {
                                        productoValido = true;
                                        precioUnitario = 25.0;
                                        productoFactura = "Azúcar";
                                    } else if (codigoProducto == 4) {
                                        productoValido = true;
                                        precioUnitario = 30.0;
                                        productoFactura = "Maíz";
                                    }
                                    
                                    break;
                                case "B":
                                    System.out.println("Códigos: 2/3");
                                    System.out.print("Ingrese el código del producto: ");
                                    codigoProducto = leer.nextInt();
                                    
                                    if (codigoProducto != 2 && codigoProducto !=3)
                                    {
                                        System.out.println("\n*** Proveedor no vende dicho producto ***\n");
                                    }
                                    
                                    if (codigoProducto == 2) {
                                        productoValido = true;
                                        precioUnitario = 20.0;
                                        productoFactura = "Avena";
                                    } else if (codigoProducto == 3) {
                                        productoValido = true;
                                        precioUnitario = 30.0;
                                        productoFactura = "Trigo";
                                    }
                                    
                                    break;
                                case "C":
                                    System.out.println("Códigos: 2");
                                    System.out.print("Ingrese el código del producto: ");
                                    codigoProducto = leer.nextInt();
                                    
                                    if (codigoProducto != 2)
                                    {
                                        System.out.println("\n*** Proveedor no vende dicho producto ***\n");
                                    }
                                    
                                    if (codigoProducto == 2) {
                                        productoValido = true;
                                        precioUnitario = 22.0;
                                        productoFactura = "Avena";
                                    }
                                    
                                    break;
                                case "D":
                                    continuarComprando = false;
                                    break;
                            }
                             
                            if (productoValido) 
                            {
                                // Solicitar cantidad
                                System.out.print("Ingrese la cantidad en kilogramos del producto: ");
                                double cantidad = leer.nextDouble();
                                leer.nextLine(); // Consumir la nueva línea

                                // Calcular subtotal, descuento, impuesto y total
                                subtotalFinal = cantidad * precioUnitario;
                                
                                System.out.println("\n\n--------------- FACTURA ---------------");
                                
                                if (efectivoCajaTotal >= totalFinal) {
                                    // Imprimir factura - Procesar la compra
                                    switch (codigoProducto) {
                                        case 1: // Azúcar
                                            inventarioAzucar += cantidad;
                                            System.out.println("Producto: Azúcar");
                                            System.out.println("Precio de compra por kg: Lps. " + precioUnitario);
                                            System.out.println("Cantidad comprada: " + cantidad + " kg");
                                            System.out.println("Total a pagar: Lps. " + (precioUnitario * cantidad));
                                            break;
                                        case 2: // Avena
                                            inventarioAvena += cantidad;
                                            System.out.println("Producto: Avena");
                                            System.out.println("Precio de compra por kg: Lps. " + precioUnitario);
                                            System.out.println("Cantidad comprada: " + cantidad + " kg");
                                            System.out.println("Total a pagar: Lps. " + (precioUnitario * cantidad));
                                            break;
                                        case 3: // Trigo
                                            inventarioTrigo += cantidad;
                                            System.out.println("Producto: Trigo");
                                            System.out.println("Precio de compra por kg: Lps. " + precioUnitario);
                                            System.out.println("Cantidad comprada: " + cantidad + " kg");
                                            System.out.println("Total a pagar: Lps. " + (precioUnitario * cantidad));
                                            break;
                                        case 4: // Maíz
                                            inventarioMaiz += cantidad;
                                            System.out.println("Producto: Maíz");
                                            System.out.println("Precio de compra por kg: Lps. " + precioUnitario);
                                            System.out.println("Cantidad comprada: " + cantidad + " kg");
                                            System.out.println("Total a pagar: Lps. " + (precioUnitario * cantidad));
                                            break;
                                        default:
                                            System.out.println(" Opción de compra inválida.");
                                            break;
                                    }
                                    efectivoCajaTotal -= (precioUnitario * cantidad); // Disminuir efectivo en caja
                                    totalCReportes += (precioUnitario * cantidad);   // Necesario para valor medio de compras

                                    if (totalFinal > gananciasCMayor) { // Venta con más gasto efectuada
                                        gananciasCMayor = totalFinal;
                                    }
                                    
                                    contadorCompras += 1;

                                    System.out.println();
                                    continuarComprando = false; 
                                    break;
                                } else {
                                    System.out.println("Efectivo insuficiente. No se puede pagar la compra.");
                                    continuarComprando = false; 
                                }
                            }
                        }
                    }
                    break; 
                               
                 
                case 4:
                    margenGanancia = totalVReportes - totalCReportes;
                    
                    // Calcular el valor medio de ventas
                    if (contadorVentas > 0) {
                        valorMVentas = totalVReportes / contadorVentas;
                    }

                    // Calcular el valor medio de compras
                    if (contadorCompras > 0) {
                        valorMCompras = totalCReportes / contadorCompras;
                    }
                    
                    //Ranking 
                    if (contadorAzucar == 0 && contadorAvena == 0 && contadorTrigo == 0 && contadorMaiz == 0) {
                    } else {
                        // Encontrar el producto con el mayor número de ventas (primer lugar)
                        if (contadorAzucar >= contadorAvena && contadorAzucar >= contadorTrigo && contadorAzucar >= contadorMaiz) {
                            primerLugar = "Azúcar";
                            cantidadPrimerLugar = kilogramosVendidosAzucar;
                        } else if (contadorAvena >= contadorAzucar && contadorAvena >= contadorTrigo && contadorAvena >= contadorMaiz) {
                            primerLugar = "Avena";
                            cantidadPrimerLugar = kilogramosVendidosAvena;
                        } else if (contadorTrigo >= contadorAzucar && contadorTrigo >= contadorAvena && contadorTrigo >= contadorMaiz) {
                            primerLugar = "Trigo";
                            cantidadPrimerLugar = kilogramosVendidosTrigo;
                        } else {
                            primerLugar = "Maíz";
                            cantidadPrimerLugar = kilogramosVendidosMaiz;
                        }

                        // Encontrar el segundo lugar
                        if (primerLugar.equals("Azúcar")) {
                            secondMaxCount = Math.max(contadorAvena, Math.max(contadorTrigo, contadorMaiz));
                            segundoLugar = (contadorAvena == secondMaxCount) ? "Avena" :
                                           (contadorTrigo == secondMaxCount) ? "Trigo" : "Maíz";
                            cantidadSegundoLugar = (segundoLugar.equals("Avena")) ? kilogramosVendidosAvena :
                                                   (segundoLugar.equals("Trigo")) ? kilogramosVendidosTrigo : kilogramosVendidosMaiz;
                        } else if (primerLugar.equals("Avena")) {
                            secondMaxCount = Math.max(contadorAzucar, Math.max(contadorTrigo, contadorMaiz));
                            segundoLugar = (contadorAzucar == secondMaxCount) ? "Azúcar" :
                                           (contadorTrigo == secondMaxCount) ? "Trigo" : "Maíz";
                            cantidadSegundoLugar = (segundoLugar.equals("Azúcar")) ? kilogramosVendidosAzucar :
                                                   (segundoLugar.equals("Trigo")) ? kilogramosVendidosTrigo : kilogramosVendidosMaiz;
                        } else if (primerLugar.equals("Trigo")) {
                            secondMaxCount = Math.max(contadorAzucar, Math.max(contadorAvena, contadorMaiz));
                            segundoLugar = (contadorAzucar == secondMaxCount) ? "Azúcar" :
                                           (contadorAvena == secondMaxCount) ? "Avena" : "Maíz";
                            cantidadSegundoLugar = (segundoLugar.equals("Azúcar")) ? kilogramosVendidosAzucar :
                                                   (segundoLugar.equals("Avena")) ? kilogramosVendidosAvena : kilogramosVendidosMaiz;
                        } else {
                            secondMaxCount = Math.max(contadorAzucar, Math.max(contadorAvena, contadorTrigo));
                            segundoLugar = (contadorAzucar == secondMaxCount) ? "Azúcar" :
                                           (contadorAvena == secondMaxCount) ? "Avena" : "Trigo";
                            cantidadSegundoLugar = (segundoLugar.equals("Azúcar")) ? kilogramosVendidosAzucar :
                                                   (segundoLugar.equals("Avena")) ? kilogramosVendidosAvena : kilogramosVendidosTrigo;
                        }

                        // Encontrar el tercer lugar
                        if (segundoLugar.equals("Azúcar")) {
                            thirdMaxCount = Math.max(contadorAvena, Math.max(contadorTrigo, contadorMaiz));
                            tercerLugar = (contadorAvena == thirdMaxCount) ? "Avena" :
                                          (contadorTrigo == thirdMaxCount) ? "Trigo" : "Maíz";
                            cantidadTercerLugar = (tercerLugar.equals("Avena")) ? kilogramosVendidosAvena :
                                                  (tercerLugar.equals("Trigo")) ? kilogramosVendidosTrigo : kilogramosVendidosMaiz;
                        } else if (segundoLugar.equals("Avena")) {
                            thirdMaxCount = Math.max(contadorAzucar, Math.max(contadorTrigo, contadorMaiz));
                            tercerLugar = (contadorAzucar == thirdMaxCount) ? "Azúcar" :
                                          (contadorTrigo == thirdMaxCount) ? "Trigo" : "Maíz";
                            cantidadTercerLugar = (tercerLugar.equals("Azúcar")) ? kilogramosVendidosAzucar :
                                                  (tercerLugar.equals("Trigo")) ? kilogramosVendidosTrigo : kilogramosVendidosMaiz;
                        } else if (segundoLugar.equals("Trigo")) {
                            thirdMaxCount = Math.max(contadorAzucar, Math.max(contadorAvena, contadorMaiz));
                            tercerLugar = (contadorAzucar == thirdMaxCount) ? "Azúcar" :
                                          (contadorAvena == thirdMaxCount) ? "Avena" : "Maíz";
                            cantidadTercerLugar = (tercerLugar.equals("Azúcar")) ? kilogramosVendidosAzucar :
                                                  (tercerLugar.equals("Avena")) ? kilogramosVendidosAvena : kilogramosVendidosMaiz;
                        } else {
                            thirdMaxCount = Math.max(contadorAzucar, Math.max(contadorAvena, contadorTrigo));
                            tercerLugar = (contadorAzucar == thirdMaxCount) ? "Azúcar" :
                                          (contadorAvena == thirdMaxCount) ? "Avena" : "Trigo";
                            cantidadTercerLugar = (tercerLugar.equals("Azúcar")) ? kilogramosVendidosAzucar :
                                                  (tercerLugar.equals("Avena")) ? kilogramosVendidosAvena : kilogramosVendidosTrigo;
                        }

                        // Encontrar el cuarto lugar
                        if (primerLugar.equals("Azúcar") || segundoLugar.equals("Azúcar") || tercerLugar.equals("Azúcar")) {
                            fourthMaxCount = Math.max(contadorAvena, Math.max(contadorTrigo, contadorMaiz));
                            cuartoLugar = (contadorAvena == fourthMaxCount) ? "Avena" :
                                          (contadorTrigo == fourthMaxCount) ? "Trigo" : "Maíz";
                            cantidadCuartoLugar = (cuartoLugar.equals("Avena")) ? kilogramosVendidosAvena :
                                                  (cuartoLugar.equals("Trigo")) ? kilogramosVendidosTrigo : kilogramosVendidosMaiz;
                        } else if (primerLugar.equals("Avena") || segundoLugar.equals("Avena") || tercerLugar.equals("Avena")) {
                            fourthMaxCount = Math.max(contadorAzucar, Math.max(contadorTrigo, contadorMaiz));
                            cuartoLugar = (contadorAzucar == fourthMaxCount) ? "Azúcar" :
                                          (contadorTrigo == fourthMaxCount) ? "Trigo" : "Maíz";
                            cantidadCuartoLugar = (cuartoLugar.equals("Azúcar")) ? kilogramosVendidosAzucar :
                                                  (cuartoLugar.equals("Trigo")) ? kilogramosVendidosTrigo : kilogramosVendidosMaiz;
                        } else if (primerLugar.equals("Trigo") || segundoLugar.equals("Trigo") || tercerLugar.equals("Trigo")) {
                            fourthMaxCount = Math.max(contadorAzucar, Math.max(contadorAvena, contadorMaiz));
                            cuartoLugar = (contadorAzucar == fourthMaxCount) ? "Azúcar" :
                                          (contadorAvena == fourthMaxCount) ? "Avena" : "Maíz";
                            cantidadCuartoLugar = (cuartoLugar.equals("Azúcar")) ? kilogramosVendidosAzucar :
                                                  (cuartoLugar.equals("Avena")) ? kilogramosVendidosAvena : kilogramosVendidosMaiz;
                        } else {
                            fourthMaxCount = Math.max(contadorAzucar, Math.max(contadorAvena, contadorTrigo));
                            cuartoLugar = (contadorAzucar == fourthMaxCount) ? "Azúcar" :
                                          (contadorAvena == fourthMaxCount) ? "Avena" : "Trigo";
                            cantidadCuartoLugar = (cuartoLugar.equals("Azúcar")) ? kilogramosVendidosAzucar :
                                                  (cuartoLugar.equals("Avena")) ? kilogramosVendidosAvena : kilogramosVendidosTrigo;
                        }
                    }

                    //Reportes
                    System.out.println("\n\n------------- REPORTES --------------\n");
                    System.out.println("a) Cantidad actual en caja: Lps. " + efectivoCajaTotal + "\n");
                    
                    System.out.println("b) Número de compras y ventas realizadas: ");
                    System.out.println("   - Compras: " + contadorCompras);
                    System.out.println("   - Ventas: " + contadorVentas + "\n");
                    
                    System.out.println("c) Volumen de ventas y compras: ");
                    System.out.println("   - Compras: Lps. " + totalCReportes);
                    System.out.println("   - Ventas: Lps. " + totalVReportes + "\n");
                    System.out.println("   - Margen de Ganancia: Lps. " + margenGanancia + "\n");
                    
                    System.out.println("d) Valor medio de compra y venta: ");
                    System.out.println("  - Compras: Lps. " + valorMCompras + "%");
                    System.out.println("  - Ventas: Lps. " + valorMVentas + "%\n");
                    
                    System.out.println("e) Venta con mayor ganacia generada: Lps. " + gananciasVMayor);
                    System.out.println(" . Compra con mayor gasto efectuada: Lps. " + gananciasCMayor + "\n");
                    
                    System.out.println("f) Producto Estrella: ");
                    System.out.println("   - Producto: " + primerLugar);
                    System.out.println("   - Cantidad: " + cantidadPrimerLugar + " kg\n");
                    
                    System.out.println("g) Ranking: ");
                    System.out.println("   1. " + primerLugar);
                    System.out.println("   2. " + segundoLugar);
                    System.out.println("   3. " + tercerLugar);
                    System.out.println("   4. " + cuartoLugar + "\n");
                    
                    System.out.println("--------- INVENTARIO --------");
                    System.out.println("Azucar: " + inventarioAzucar + " kg");
                    System.out.println("Avena: " + inventarioAvena + " kg");
                    System.out.println("Trigo: " + inventarioTrigo + " kg");
                    System.out.println("Maíz: " + inventarioMaiz + " kg\n\n");
                    
                    break;
                    
                case 5:
                    //Cierre de Caja
                    System.out.println("\n\n----------- CIERRE DE CAJA -----------\n");
                    System.out.println("Total de ganancia: Lps. " + totalVReportes );
                    depositoMaximo = efectivoCajaTotal * 0.6;
                    System.out.println();
                    System.out.println("La cantidad máxima a depositar en el banco es: Lps. " + depositoMaximo);
                    System.out.println();
                    
                    boolean depositoValido = false;

                    while (!depositoValido) {
                        System.out.print("¿Cuánto desea depositar en el banco? : Lps. ");

                        try {
                            deposito = leer.nextDouble();
                            if (deposito > 0 && deposito <= depositoMaximo) {
                                depositoValido = true; 
                            } else if (deposito <= 0) {
                                System.out.println("\nLa cantidad debe ser mayor que cero. Inténtelo nuevamente.\n");
                            } else {
                                System.out.println("\nLa cantidad ingresada supera el límite de depósito. Inténtelo nuevamente.\n");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Entrada no válida. Por favor, ingrese un número válido.");
                            leer.next(); 
                        }
                    }
                    
                    efectivoCajaTotal -= deposito;
                    System.out.println("Efectivo restante en caja: Lps. " + efectivoCajaTotal);
                    
                    while (true) {
               
                    System.out.println("\n\n           /// CAJA CERRADA ///         ");
                    System.out.println();
                    System.out.println("------------ MENÚ DE OPCIONES ------------");
                    System.out.println("1. Abrir Caja                      ");
                    System.out.println("2. Reportes                         ");
                    System.out.println("------------------------------------------");
                    System.out.println("              Código: 1/2");
                    System.out.print("¿Cuál de las siguientes opciones desea realizar? ");
                    int menu = leer.nextInt();

                    while (menu != 1 && menu != 2) {
                        System.out.print("\nTu opción es inválida. Inténtalo nuevamente.\n");
                        menu = leer.nextInt();
                    }

                    if (menu == 2) {
                        System.out.println("\n\n------------- REPORTES --------------\n");
                        System.out.println("a) Cantidad actual en caja: Lps. " + efectivoCajaTotal + "\n");

                        System.out.println("b) Número de compras y ventas realizadas: ");
                        System.out.println("   - Compras: " + contadorCompras);
                        System.out.println("   - Ventas: " + contadorVentas + "\n");

                        System.out.println("c) Volumen de ventas y compras: ");
                        System.out.println("   - Compras: Lps. " + totalCReportes);
                        System.out.println("   - Ventas: Lps. " + totalVReportes + "\n");
                        System.out.println("   - Margen de Ganancia: Lps. " + margenGanancia + "\n");

                        System.out.println("d) Valor medio de compra y venta: ");
                        System.out.println("  - Compras: Lps. " + valorMCompras + "%");
                        System.out.println("  - Ventas: Lps. " + valorMVentas + "%\n");

                        System.out.println("e) Venta con mayor ganacia generada: Lps. " + gananciasVMayor);
                        System.out.println(" . Compra con mayor gasto efectuada: Lps. " + gananciasCMayor + "\n");

                        System.out.println("f) Producto Estrella: ");
                        System.out.println("   - Producto: " + primerLugar);
                        System.out.println("   - Cantidad: " + cantidadPrimerLugar + " kg\n");

                        System.out.println("g) Ranking: ");
                        System.out.println("   1. " + primerLugar);
                        System.out.println("   2. " + segundoLugar);
                        System.out.println("   3. " + tercerLugar);
                        System.out.println("   4. " + cuartoLugar + "\n");

                        System.out.println("--------- INVENTARIO --------");
                        System.out.println("Azucar: " + inventarioAzucar + " kg");
                        System.out.println("Avena: " + inventarioAvena + " kg");
                        System.out.println("Trigo: " + inventarioTrigo + " kg");
                        System.out.println("Maiz: " + inventarioMaiz + " kg\n\n\n\n");
                    }

                    if (menu == 1) {
                        // Reinicio de Contadores
                        contadorVentas = 0;
                        contadorCompras = 0;
                        totalCReportes = 0;
                        totalVReportes = 0;
                        valorMVentas = 0;
                        valorMCompras = 0;
                        gananciasVMayor = 0;
                        gananciasCMayor = 0;
                        cantidadPrimerLugar = 0;
                        margenGanancia = 0;
                        kilogramosVendidosAzucar = 0; kilogramosVendidosAvena = 0; kilogramosVendidosTrigo = 0; kilogramosVendidosMaiz = 0;
                        primerLugar = "Sin Producto"; segundoLugar = "Sin Producto"; tercerLugar = "Sin Producto"; cuartoLugar = "Sin Producto";
                        contadorAzucar = 0; contadorAvena = 0; contadorTrigo = 0; contadorMaiz = 0;
                        cantidadPrimerLugar = 0.0; cantidadSegundoLugar = 0.0; cantidadTercerLugar = 0.0; cantidadCuartoLugar = 0.0;

                        System.out.println("\n\n");
                        break;
                    }
              }
                    break;
                    
                case 6:
                    System.out.println("\n\n\n------ CERRANDO PROGRAMA ------");
                    break;
            }

        } while (opcion != 6);
    }
}
        
