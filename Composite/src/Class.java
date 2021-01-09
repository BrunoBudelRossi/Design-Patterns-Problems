import java.util.ArrayList;

public class Class {
    private String id;
    private ArrayList<Student> arrStudents;

    public Class(String id) {
        this.id = id;
        arrStudents = new ArrayList<>();
    }

    public void addStudent(Student student){
        arrStudents.add(student);
    }

    public void delStudent(Student student){
        arrStudents.remove(student);
        System.out.println("O aluno " + student.getName() + " saiu da turma " + this.getId());
    }

    public ArrayList<Student> getArrStudents(){
        return arrStudents;
    }

    public String getId() {
        return id;
    }
}
