package com.example.Student_Management_Project.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Teacherentity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String subject;
    private String phone;
    private String password;
    private String complaint;

    @OneToMany(mappedBy = "classTeacher", cascade = CascadeType.ALL)
    private List<Studententity> students;

    public Teacherentity() {
    }

    public Teacherentity(String name, String email, String subject, String phone, String password, String complaint) {
        this.name = name;
        this.email = email;
        this.subject = subject;
        this.phone = phone;
        this.password = password;
        this.complaint = complaint;
    }

    // Getters and Setters

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getComplaint() { return complaint; }
    public void setComplaint(String complaint) { this.complaint = complaint; }

    public List<Studententity> getStudents() { return students; }
    public void setStudents(List<Studententity> students) { this.students = students; }

    @Override
    public String toString() {
        return "Teacherentity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", subject='" + subject + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
