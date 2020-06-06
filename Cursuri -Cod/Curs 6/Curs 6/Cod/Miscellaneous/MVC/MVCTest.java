package Curs6.Miscellaneous.MVC;

public class MVCTest {
    public static void main(String[] args) {

        Student model = retrieveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView();
        controller.setStudentName("Ion Teodorescu");
        controller.updateView();
    }

    private static Student retrieveStudentFromDatabase() {
        return new Student("15UCS157", "Mihai Popescu");
    }
}
