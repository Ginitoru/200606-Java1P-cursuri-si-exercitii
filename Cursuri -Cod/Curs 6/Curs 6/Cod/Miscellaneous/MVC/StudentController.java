package Curs6.Miscellaneous.MVC;

public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name) {
        model.setName(name);
    }

    public String getStudentName() {
        return model.getName();
    }

    public void setStudentRollNo(String rollNo) {
        model.setId(rollNo);
    }

    public String getStudentRollNo() {
        return model.getId();
    }

    public void updateView() {
        view.printStudentDetails(model.getName(), model.getId());
    }
}
