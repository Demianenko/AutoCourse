package Second;

import java.util.ArrayList;

/**
 * Created by user on 23.05.2016.
 */
public class University {
    private ArrayList<Student> studentsList = new ArrayList<>();
    private ArrayList<Professor> professorsList = new ArrayList<>();

    public void addStudent(Student...arrStudent) {
        for(Student s: arrStudent) {
            studentsList.add(s);
        }
    }
    public void addProfessor(Professor... arrProfessor) {
        for(Professor p: arrProfessor) {
            professorsList.add(p);
        }
    }
    public void paySalary(Human worker) {
        worker.setWealth(worker.getWealth()+worker.getSalary());
    }

    public ArrayList<Student> getStudentsList() {
        for(Student st: studentsList) {
            System.out.println(st.getFirstName()+"  "+st.getSecondName());
        }
        return studentsList;
    }

    public ArrayList<Professor> getProfessorsList() {
        for(Professor pf: professorsList) {
            System.out.println(pf.getFirstName()+"  "+pf.getSecondName());
        }
        return professorsList;
    }
}
