package Siniflar.ogrenciBilgiSistemiOdev;


public class Course {

    Teacher courseTeacher;

    String name;
    String code;
    String prefix;
    int note;
    int verbalNote;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.verbalNote = 0;
    }

    void addTeacher(Teacher teacher) {
        if(this.prefix.equals(teacher.branch)) {
            this.courseTeacher = teacher;
            System.out.println("İşlem başarılı.");
        } else {
            System.out.println(teacher.name +  " akademisyeni bu dersi veremez.");
        }
    }

    void printTeacher(Teacher teacher) {
        if(courseTeacher != null) {
            System.out.println(this.name + " dersinin akademisyeni: " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine akademisyen atamamıştır.");
        }
    }


}

