package com.example.Student_Management_Project.entity;

import javax.persistence.*;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.LocalDate;

@Entity
public class Studententity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String email;
    private LocalDate dateOfBirth;
    private String mobileNumber;
    private String course;
    private Double attendance;
    private Integer marks;
    private String feedback;
    private String std;
    private String division;
    private String rollNo;

    @ManyToOne
    @JoinColumn(name = "teacher_id")  // FK in Student table
    @JsonIgnore // Prevent the circular reference during serialization
    private Teacherentity classTeacher;

    public Studententity() {
    }

    public Studententity(String firstName, String email, LocalDate dateOfBirth, String mobileNumber,
                         String course, Double attendance, Integer marks, String feedback,
                         String std, String division, String rollNo, Teacherentity classTeacher) {
        this.firstName = firstName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.mobileNumber = mobileNumber;
        this.course = course;
        this.attendance = attendance;
        this.marks = marks;
        this.feedback = feedback;
        this.std = std;
        this.division = division;
        this.rollNo = rollNo;
        this.classTeacher = classTeacher;
    }

    // Getters and Setters

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public LocalDate getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(LocalDate dateOfBirth) { this.dateOfBirth = dateOfBirth; }

    public String getMobileNumber() { return mobileNumber; }
    public void setMobileNumber(String mobileNumber) { this.mobileNumber = mobileNumber; }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    public Double getAttendance() { return attendance; }
    public void setAttendance(Double attendance) { this.attendance = attendance; }

    public Integer getMarks() { return marks; }
    public void setMarks(Integer marks) { this.marks = marks; }

    public String getFeedback() { return feedback; }
    public void setFeedback(String feedback) { this.feedback = feedback; }

    public String getStd() { return std; }
    public void setStd(String std) { this.std = std; }

    public String getDivision() { return division; }
    public void setDivision(String division) { this.division = division; }

    public String getRollNo() { return rollNo; }
    public void setRollNo(String rollNo) { this.rollNo = rollNo; }

    public Teacherentity getClassTeacher() { return classTeacher; }
    public void setClassTeacher(Teacherentity classTeacher) { this.classTeacher = classTeacher; }
}
