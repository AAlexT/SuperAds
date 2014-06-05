package superads.entities;

import org.apache.commons.codec.digest.DigestUtils;

import javax.persistence.*;

@Entity
@Table(schema="public", name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_seq_gen")
    @SequenceGenerator(name = "users_seq_gen", sequenceName = "users_id_seq")
    private Integer id;

    @Column(name="`email`", nullable = false, length = 40)
    private String email;

    public User() {}

    public User(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("User[%s, %s]", id, email);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name="`pass`", nullable = false, length = 40)
    private String pass;

    public void setPass(String pass){
        String hash = DigestUtils.md5Hex(pass);
        this.pass = hash;
    }

    public String getPass() {
        return pass;
    }
}
