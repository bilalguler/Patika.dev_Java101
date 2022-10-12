package Siniflar.ogrenciBilgiSistemiOdev;


public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Peter Parker", "90507", "MAT");
        Teacher t2 = new Teacher("Tony Stark", "90553", "KMY");
        Teacher t3 = new Teacher("Thor Odinson", "90556", "FZK");

        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course kimya = new Course("Kimya", "KMY101", "KMY");
        Course fizik = new Course("Fizik", "FZK101", "FZK");

        mat.addTeacher(t1);
        kimya.addTeacher(t2);
        fizik.addTeacher(t3);

        Student s1 = new Student("Natasha Maximoff", "170", "4", mat, kimya, fizik);
        s1.addBulkExamNote(50, 46, 40);
        s1.addBulkVerbalNote(100, 49, 56);
        s1.isPass();

        Student s2 = new Student("Bruce Banner", "182", "3", mat, kimya, fizik);
        s2.addBulkExamNote(100, 50, 40);
        s2.addBulkVerbalNote(40, 60, 90);
        s2.isPass();

        Student s3 = new Student("Steve Rogers", "190", "1", mat, kimya, fizik);
        s3.addBulkExamNote(50, 20, 40);
        s3.addBulkVerbalNote(90, 60, 70);
        s3.isPass();
    }
}

