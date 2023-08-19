package Listas;

public class taskList {
    private String taskName;

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    private String taskDescription;

    private boolean isDone;


    @Override
    public String toString() {

        return "Nombre de la Tarea='" + taskName + '\'' +", Descripcion='" + taskDescription + '\'' + ", isDone=" + isDone;
    }
}
