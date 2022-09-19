package kea.madspild.ents;

import org.springframework.format.annotation.NumberFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Report {
    @Id
    @GeneratedValue
    private Long id;
    @NumberFormat
    private int zipCode;
    private String name;
    private String address;
    private String description;

    public Report() {
    }

    public Report(Long id, int zipCode, String name, String address, String description) {
        this.id = id;
        this.zipCode = zipCode;
        this.name = name;
        this.address = address;
        this.description = description;
    }

    public Report(int zipCode, String name, String address, String description) {
        this.zipCode = zipCode;
        this.name = name;
        this.address = address;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
