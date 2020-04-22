package ge.edu.btu.mariami.chakhvadze.regform;


import ge.edu.btu.mariami.chakhvadze.regform.model.Pet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/registration")
public class RegForm extends HttpServlet {
    public static final String VIEW = "/showPet.jsp";
    Pet pet = new Pet();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("pet", pet);

        RequestDispatcher view = req.getRequestDispatcher(VIEW);
        view.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        pet.setName(req.getParameter("name"));
        pet.setBreed(req.getParameter("breed"));
        pet.setGender(req.getParameter("gender"));
        pet.setAge(Integer.parseInt(req.getParameter("age")));

        System.out.println(pet.getName());
        System.out.println(pet.getBreed());
        System.out.println(pet.getGender());
        System.out.println(pet.getAge());
    }
}
