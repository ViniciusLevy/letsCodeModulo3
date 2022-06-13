package exerciciolivraria;

import java.time.LocalDate;
import java.time.Period;

public class Customer implements ICustomer{

    private String name;
    private String cfp;
    private String rg;
    private LocalDate dateOfBirth;
    private int age;

    public Customer(String name, String cfp, String rg, LocalDate dateOfBirth) {
        this.name = name;
        this.cfp = cfp;
        this.rg = rg;
        this.dateOfBirth = dateOfBirth;
        this.age = Period.between(dateOfBirth, LocalDate.now()).getYears();
    }

    @Override
    public boolean customerIsAdult() {
        if (getAge() >= 18) {
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCfp() {
        return cfp;
    }

    public void setCfp(String cfp) {
        this.cfp = cfp;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
