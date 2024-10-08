package interfaces;

import models.User;

public interface iUser {
    public void save(User user);
    public User getStudent(String username);
    public void update(User user);
    public void delete(User user);
}
