package manytomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity(name = "Employ")
public class Emp {
    @Id
    private int eid;
    @Column(name = "Employeename")
    private String name;
    @ManyToMany
    @JoinTable(name = "emp_learn",joinColumns = {@JoinColumn(name="eid")},inverseJoinColumns = {@JoinColumn(name="pid")})
    private List<Project> projects;
    public Emp(int eid, String name, List<Project> projects) {
        this.eid = eid;
        this.name = name;
        this.projects = projects;
    }
    public Emp() {
    }
    public int getEid() {
        return eid;
    }
    public void setEid(int eid) {
        this.eid = eid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Project> getProjects() {
        return projects;
    }
    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
    @Override
    public String toString() {
        return "Emp [eid=" + eid + ", name=" + name + ", projects=" + projects + "]";
    }
    

}
