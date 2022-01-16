package CustomClassStatics;

public class CydeoStudentTest {

        public static void main(String[] args) {

            CydeoStudent student1 = new CydeoStudent("Jimmy", 39, 'M', 14, 'C', 25, 16);

            CydeoStudent student2 = new CydeoStudent("Kathy", 29, 'F', 15, 'A', 25, 13);

            System.out.println(student1);
            System.out.println(student2);

            student1.printSchoolName();
            student2.printSchoolName();

            student1.printProgLanguage();
            student2.printProgLanguage();


        }

    }

