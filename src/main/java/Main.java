import dao.RoleDAO;
import dao.UserDAO;
import models.Role;
import models.User;

public class Main {
    public static void main(String[] args) {
        RoleDAO roleDAO = new RoleDAO();
        Role admin = new Role();
        admin.setRole_type("admin");
        roleDAO.save(admin);
        Role developer = new Role();
        developer.setRole_type("developer");
        roleDAO.save(developer);
        Role read = new Role();
        read.setRole_type("read only");
        roleDAO.save(read);

        UserDAO userDAO = new UserDAO();
        User karen = new User();
        karen.setUsername("littlesaturnalien");
        karen.setPassword("2004");
        karen.setFull_name("Karen Mariza Rosa Yolanda Fonseca Vega");
        karen.setPhone_number("86956877");
        karen.setEmail("kmfvega@gmail.com");
        karen.setRole(roleDAO.getRole(1));
        karen.setStatus(true);
        userDAO.save(karen);
    }
}
