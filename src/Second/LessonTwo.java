package Second;

/**
 * Created by user on 23.05.2016.
 */
public class LessonTwo {
    public static void main(String[] args) {
        University politesh = new University();
        Professor p1 = new Professor(100,"Professor", "Petrovich",5000,20000);
        Professor p2 = new Professor(70,"Professor", "Ivanovna",4000,40000);
        Student s1 = new Student(20,"Stud", "Fedorov",1000,500);
        Student s2 = new Student(21,"Stud", "Sidorov",1000,0);
        Student s3 = new Student(21,"Stud", "Kovalev",0,100000);

        politesh.addProfessor(p1,p2);
        politesh.addStudent(s1,s2,s3);
        politesh.getProfessorsList();
        politesh.getStudentsList();


        System.out.println(p1.getWealth());
        politesh.paySalary(p1);
        p1.spendMoney(10);
        System.out.println(p1.getWealth());


    }
}
