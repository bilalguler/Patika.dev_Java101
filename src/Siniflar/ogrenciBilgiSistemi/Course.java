package Siniflar.ogrenciBilgiSistemi;

public class Course {
    Teacher teacher; //nitelikler arasında bir sınıf varsa en üste yazılır.
    String name;
    String code;
    String prefix;
    int note;
    // bu tanımladıklarımız değişken değil nitelik.

    Course(String name,String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
            //printTeacher();
        } else {
            System.out.println("Öğretmen ve Ders bölümleri uyuşmuyor!");
        }
    }

    void printTeacher() {
        this.teacher.print();
    }
}
