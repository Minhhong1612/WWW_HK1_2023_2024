package vn.edu.iuh.week_01.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "role")
@NamedQueries({
        @NamedQuery(name = "role.findAll", query = "from Role")
})
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long role_id;

    @Column(length = 100, unique = true, nullable = false)
    private String role_name;

    @Column(length = 100, unique = true, nullable = false)
    private String description;

    @Column(length = 100,unique = true, nullable = false)
    private String status;

    @OneToMany(mappedBy = "rol")
    private List<Account> lstAccount;
    public Role() {
    }

    public Role(Long role_id, String role_name, String description, String status) {
        this.role_id = role_id;
        this.role_name = role_name;
        this.description = description;
        this.status = status;
    }

    public Long getRole_id() {
        return role_id;
    }

    public void setRole_id(Long role_id) {
        this.role_id = role_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Role)) return false;
        Role role = (Role) o;
        return Objects.equals(role_id, role.role_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(role_id);
    }

    @Override
    public String toString() {
        return "Role{" +
                "role_id=" + role_id +
                ", role_name='" + role_name + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
