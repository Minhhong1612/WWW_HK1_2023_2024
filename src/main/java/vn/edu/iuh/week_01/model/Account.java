package vn.edu.iuh.week_01.model;

import jakarta.persistence.*;


import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "account")
@NamedQueries({
        @NamedQuery(name = "account.findAll", query = "from Account ")
})
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountID;

    @Column(length = 100, unique = true, nullable = false)
    private String full_name;

    @Column(length = 20, unique = true, nullable = false)
    private String password;

    @Column(length = 100,unique = true, nullable = false)
    private String email;

    @Column(length = 10,unique = true,nullable = false)
    private Long phone;

    @Column(length = 100,unique = true, nullable = false)
    private String status;

    @ManyToOne
    @JoinColumn(name = "status")
    private Role rol;

    public Account() {
    }

    public Account(Long accountID) {
        this.accountID = accountID;
    }

    public Account(Long accountID, String full_name, String password, String email, Long phone, String status) {
        this.accountID = accountID;
        this.full_name = full_name;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.status = status;
    }

    public Long getAccountID() {
        return accountID;
    }

    public void setAccountID(Long accountID) {
        this.accountID = accountID;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
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
        if (!(o instanceof Account)) return false;
        Account account = (Account) o;
        return Objects.equals(accountID, account.accountID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountID);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountID=" + accountID +
                ", full_name='" + full_name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", status='" + status + '\'' +
                '}';
    }
}
