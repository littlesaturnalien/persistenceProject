package interfaces;

import models.Role;

public interface iRole {
    public void save(Role role);
    public Role getRole(int id);
    public void update(Role role);
    public void delete(Role role);
}
