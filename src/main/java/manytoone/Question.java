package manytoone;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity(name = "questuions")
public class Question {
    @Id
    @Column(name="questiom_Id")
    private int qid;
    private String question;
   @OneToMany(mappedBy = "question")
    private List<Answer> answers;
    
    public Question(int qid, String question, List<Answer> answers) {
        this.qid = qid;
        this.question = question;
        this.answers = answers;
    }
    public Question() {
    }
    public int getQid() {
        return qid;
    }
    public void setQid(int qid) {
        this.qid = qid;
    }
    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public List<Answer> getAnswers() {
        return answers;
    }
    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
    @Override
    public String toString() {
        return "Question [answers=" + answers + ", qid=" + qid + ", question=" + question + "]";
    }

}