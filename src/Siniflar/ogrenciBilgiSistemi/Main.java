package Siniflar.ogrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "0590000000");
        Teacher t2 = new Teacher("Graham Bell", "FZK","905978");
        Teacher t3 = new Teacher("Kül Yutmaz", "BIO","905563");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji", "103", "BIO");
        biyo.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", "1234", "4", tarih, fizik, biyo);
        s1.addBulkExamNote(100,78,50);
        s1.isPass();

        Student s2 = new Student("Düdük Necmi", "1265", "4", tarih, fizik, biyo);
        s1.addBulkExamNote(50,30,70);
        s1.isPass();
    }
}
