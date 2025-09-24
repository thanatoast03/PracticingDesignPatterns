package Prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        School school = new School("School 1");
        school.loadStudents();

        /*
            // Example of shallow-cloning: notice how the clones share a reference to the same students array, thus removing affects both

            School schoolClone = (School)school.clone();
        */

        // Example of deep-cloning: notice how there are differing student arrays
        School schoolClone = school.clone();
        schoolClone.setName("School 2");

        school.getStudents().remove(2);

        System.out.println(school);
        System.out.println(schoolClone);
    }
}
