public class Main {
    public static void main(String[] args) {
        Student pedro = new Student("Pedro", 1);

        Student joao = new Student("João", 2);

        Student maria = new Student("Maria", 3);

        Student julia = new Student("Julia", 4);

        Class math = new Class("Turma de matemática 2021");
        math.addStudent(pedro);
        math.addStudent(joao);
        math.addStudent(maria);
        math.addStudent(julia);

        System.out.println("A turma " + math.getId() + " possue os alunos: ");
        for(Student student: math.getArrStudents()){
            System.out.println(student.getName() + " - " + student.getId());
        }

        math.delStudent(pedro);
    }
}
