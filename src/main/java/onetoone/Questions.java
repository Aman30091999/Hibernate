package onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Questions {
    @Id
    @Column(name="questiom_Id")
    private int qid;
    private String question;
    @OneToOne
    @JoinColumn(name = "a_Id")
    private Answers answer;
    public Questions(int qid, String question, Answers answer) {
        this.qid = qid;
        this.question = question;
        this.answer = answer;
    }
    public Questions() {
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
    public Answers getAnswer() {
        return answer;
    }
    public void setAnswer(Answers answer) {
        this.answer = answer;
    }
    @Override
    public String toString() {
        return "Question [answer=" + answer + ", qid=" + qid + ", question=" + question + "]";
    }
    
}
