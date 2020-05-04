package ge.edu.btu.controller;

import ge.edu.btu.model.Student;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/studentManager")
public class StudentController {

    @GET
    @Path("/hi")
    public String hi() {
        return "Hello!";
    }

    @GET
    @Path("/students")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Student> getStudents() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Giorgi", 20));
        studentList.add(new Student(2, "Mariami", 20));
        return studentList;
    }

    @POST
    @Path("addStudent")
    @Produces(MediaType.APPLICATION_JSON) // აბრუნებს ჯეისონს
    @Consumes(MediaType.APPLICATION_JSON) // იღებს ჯეისონს
    public void addStudent(Student student) {
        System.out.println(student.toString());
    }

    @GET
    @Path("/getStudent/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Student getStudent(@PathParam("id") int id) {
        System.out.println(id);
        return new Student(id, "Zura", 25);
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Student updateStudent(Student student) {
        System.out.println(student.toString());
        return student;
    }

    @DELETE
    @Path("/{id}")  // მიუხედავად იმისა რომ deleteStudent -ს  და updateStudent -ს
    // ერთიდაიგივე url ი აქვს იმისმიხედვით თუ რომელი მეთოდით
    // გამოვიძახებთ (DELETE თუ PUT)  მოხდება შესაბამისად გადამისამართება.
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteStudent(@PathParam("id") int id) {
        System.out.println("delete : " + id);
    }
}
