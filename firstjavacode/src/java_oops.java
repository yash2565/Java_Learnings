
class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(Student s2){
        this.name=s2.name;
        this.age=s2.age;

    }
    Student(){

    }

}
class Teacher extends Student{

}
public class java_oops {
    public static void main(String[] args) {


        Student s1=new Student();   //constructor  used to construct objects
        s1.name="Yash";
        s1.age=21;

        Student s2=new Student(s1);

        s2.printInfo();
    }
}
