package Ejercicio;

import Listas.taskList;

import java.util.ArrayList;
import java.util.List;

public class clsReporte {
    public void reporte(){

        List<clsEjercicio6> emp = new ArrayList<>();

        emp.add(new clsEjercicio6("Juan", 3500, 500));

        System.out.println("Nombre "+ emp.get(0).getNombre());
        System.out.println("Sueldo "+ emp.get(0).getSueldo());
        System.out.println("Descuento "+ emp.get(0).getDescuento());
        System.out.println("Sueldo Liquido "+ emp.get(0).getSueldoLiquido());

    }
}
