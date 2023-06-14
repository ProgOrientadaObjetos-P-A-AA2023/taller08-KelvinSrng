/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;
import paquete1.Docente;
import paquete1.DocenteFactura;
import paquete1.DocenteNombramiento;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean bandera = true;

        do {

            System.out.print("Ingrese sus nombres: ");
            //sc.nextLine();
            String nombres = sc.nextLine();
            System.out.print("Ingrese su cedula: ");
            String cedula = sc.nextLine();

            System.out.printf("\nMenu:\n1) Docente Nombramiento\n2) Docente Factura\nElija una opcion: ");
            int resp = sc.nextInt();

            if (resp == 1) {

                System.out.print("Ingrese el valor del sueldo: ");
                double sueldo = sc.nextDouble();
                System.out.print("Ingrese el valor por hora extra: ");
                double valorHoraExtra = sc.nextDouble();
                System.out.print("Ingrese el numero de horas trabajadas: ");
                int horas = sc.nextInt();

                DocenteNombramiento docente = new DocenteNombramiento();

                docente.establecerValorSueldo(sueldo);
                docente.establecerValorHoraExtra(valorHoraExtra);
                docente.establecerNumeroHorasExtra(horas);

                docente.establecerNombres(nombres);
                docente.establecerCedula(cedula);

                docente.calcularSalario();

                System.out.printf("%s\n", docente);
                sc.nextLine();
            } else {
                if (resp == 2) {

                    System.out.print("Ingrese el valor de la factura: ");
                    double valorF = sc.nextDouble();
                    System.out.print("Ingrese el valor del iva descuento: ");
                    double ivaDescuento = sc.nextDouble();

                    DocenteFactura docenteF = new DocenteFactura();

                    docenteF.establecerValorFactura(valorF);
                    docenteF.establecerValorIvaDescuento(ivaDescuento);

                    docenteF.calcularValorCancelar();

                    docenteF.establecerNombres(nombres);
                    docenteF.establecerCedula(cedula);//;;'[p;'[p

                    System.out.printf("%s\n", docenteF);
                    sc.nextLine();
                } else {
                    System.out.print("\u001B[31m" + "Error, opción no válida.\n");
                    sc.nextLine();
                }
            }

            System.out.print("Desea ingresar nuevamente(si/no)");
            String res = sc.nextLine();

            if (res.equals("no") || res.equals("No")) {
                bandera = false;
                 System.out.print("\u001B[31m" + "SALIENDO DEL PROGRAMA...\n");
            }

        } while (bandera == true);
    }
}
