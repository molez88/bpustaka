package org.bpustaka.entity;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotEmpty;

@Entity @Table(name="member")
public class MemberEntity {

    @Id 
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;
    
    @NotNull @NotEmpty @Size(min = 4)
    @Column(name="iduser", unique = true, nullable = false)
    private String iduser;
    
    @NotNull @NotEmpty @Size(max = 10)
    @Column(name="username", unique = true, nullable = false)
    private String username;
    
    @NotNull @NotEmpty @Size(max = 10)
    @Column(name="password", unique = true, nullable = false)
    private String password;
    
    @NotNull @NotEmpty @Size(max = 50)
    @Column(name="fullname", unique = true, nullable = false)
    private String fullname;
    
    @NotNull @NotEmpty @Size(min= 4)
    @Column(name="address", unique = true, nullable = false)
    private String address;
    
    @NotNull @NotEmpty @Size(min = 4)
    @Column(name="country", unique = true, nullable = false)
    private String country;
    
    @NotNull @NotEmpty @Size(min = 4)
    @Column(name="email", unique = true, nullable = false)
    private String email;
    
    @NotNull @NotEmpty @Size(min = 11)
    @Column(name="mobile_no", unique = true, nullable = false)
    private String mobile_no;
    
    @NotNull @NotEmpty 
    @Column(name="dateofbirth", unique = true, nullable = false)
    private Date dateofbirth;
    
    @NotNull @NotEmpty 
    @Column(name="picture", unique = true, nullable = false)
    private String picture;
    
     @NotNull @NotEmpty 
    @Column(name="status", unique = true, nullable = false)
    private String status;

    public String getIduser() {
        return iduser;
    }

    public void setIduser(String iduser) {
        this.iduser = iduser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }


    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
   
    
    
}
