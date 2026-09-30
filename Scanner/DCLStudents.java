public class DCLStudents {
    
    int id;
    String name;
    String email;
    int age;
    static String institute;
    static String ceo;
    public static void main(String[] args) {
        DCLStudents.institute = "Dhee Coding Lab";
        DCLStudents.ceo = "Mr. Shishira bhat";
        DCLStudents dcl = new DCLStudents();
        dcl.id = 20;
        dcl.name = "Shaheed";
        dcl.age = 23;
        dcl.email = "shaheed@gmail.com";
        System.out.println(dcl.id);
        System.out.println(dcl.name);
        System.out.println(dcl.email);
        System.out.println(dcl.age);
        System.out.println(institute);
        System.out.println(ceo);
    }
}
