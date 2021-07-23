package manytomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity(name = "Project")
public class Project {
    @Id
    private int pid;
    @Column(name = "Project_Name")
    private String projectname;
    @ManyToMany(mappedBy = "projects")
    private List<Emp> emps;
    public Project(int pid, String projectname, List<Emp> emps) {
        this.pid = pid;
        this.projectname = projectname;
        this.emps = emps;
    }
    public Project() {
    }
    public int getPid() {
        return pid;
    }
    public void setPid(int pid) {
        this.pid = pid;
    }
    public String getProjectname() {
        return projectname;
    }
    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }
    public List<Emp> getEmps() {
        return emps;
    }
    public void setEmps(List<Emp> emps) {
        this.emps = emps;
    }
    @Override
    public String toString() {
        return "Project [emps=" + emps + ", pid=" + pid + ", projectname=" + projectname + "]";
    }
    
}
