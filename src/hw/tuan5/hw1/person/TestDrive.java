package hw.tuan5.hw1.person;

public class TestDrive {

    public static void main(String[] args) {

        Person person = new Person("Jean", "St.Louis");
        System.out.println(person);

        Person student = new Student("Nick", "NY", "CS", 2021, 2000.0);
        System.out.println(student);
        Student student1 = (Student) student;
        System.out.println(student1.getProgram());
        System.out.println(student1.getFee());
        System.out.println(student1.getYear());
        System.out.println(student.getName());
        System.out.println(student1.getAddress());

        student1.setProgram("CIS");
        student1.setFee(2500.0);
        student1.setYear(2022);
        student1.setAddress("DC");
        System.out.println(student1);

        Person staff = new Staff("Laura", "New Haven", "Yale", 5000.0);
        System.out.println(staff);
        Staff staff1 = (Staff) staff;
        System.out.println(staff1.getPay());
        System.out.println(staff1.getSchool());
        System.out.println(staff1.getName());
        System.out.println(staff1.getAddress());

        staff1.setSchool("NYU");
        staff1.setPay(4500.0);
        staff1.setAddress("NY");
        System.out.println(staff1);
    }
}
