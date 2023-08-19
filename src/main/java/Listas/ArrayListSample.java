package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListSample {
    public void ejemplo1(){
        List<String> taskList = new ArrayList<>();
        taskList.add("Sacar al perro");
        taskList.add("Ir de compras");
        taskList.add("Hacer la cama");
        taskList.add("Ir a Votar");
        taskList.add("Barrer el patio");
        taskList.add("Hacer la comida");

        //System.out.println("Tareas pendientes: " + taskList);

        /*String primerElemento= taskList.get(0);
        System.out.printf("Primer elemento: %s\n", primerElemento);
        System.out.println("Eliminando el primer elemento");
        taskList.remove(0);
        System.out.printf("Primer elemento: %s\n", taskList.get(0));*/

        //ITERAR
        int pos=0;
        for (String item : taskList) {
            System.out.println("Tarea "+pos+" "+item);
            pos++;
        }
    }

    public void ejericio1(){
        //hacer una lista de numeros con los valores
        //1000, 2000, 3000, 4000
        //hacer una iteracion y mostrar la suma de esos numeros
        Scanner teclado = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        System.out.println("Ingrese un numero: ");
        int num = teclado.nextInt();
        numeros.add(num);
        numeros.add(1000);
        numeros.add(2000);
        numeros.add(3000);
        numeros.add(4000);

        int suma=0;
        for (Integer numero : numeros) {
            suma=numero+suma;
            System.out.println("Cant:  "+numero);
        }
        System.out.printf("Suma: "+ suma);
    }

    public void listaTareas(){
        List<taskList> tl = new ArrayList<>();
        taskList tarea = new taskList();

        tarea.setTaskName("Sacar al perro");
        tarea.setTaskDescription("al parque");
        tarea.setDone(false);
        tl.add(tarea);
        tarea = new taskList();

        tarea.setTaskName("Ir a votar");
        tarea.setTaskDescription("a la mesa 36");
        tarea.setDone(false);
        tl.add(tarea);
        tarea = new taskList();

        tarea.setTaskName("Ir de compras");
        tarea.setTaskDescription("al supermercado por la comida");
        tarea.setDone(true);
        tl.add(tarea);
        tarea = new taskList();

        for (taskList item : tl) {
            System.out.println(item.toString());
            /* System.out.println("Tarea: "+item.getTaskName());
            System.out.println("Descripcion: "+item.getTaskDescription());
            System.out.println("Estado: "+item.isDone());*/

        }



    }


}
