package onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Answers {
    @Id
   @Column(name = "a_Id")
    private int answerId;
    private String answer;
    @OneToOne(mappedBy = "answer")
    private Questions question;
    public Answers(int answerId, String answer, Questions question) {
        this.answerId = answerId;
        this.answer = answer;
        this.question = question;
    }
    public Answers() {
    }
    public int getAnswerId() {
        return answerId;
    }
    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }
    public String getAnswer() {
        return answer;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    public Questions getQuestion() {
        return question;
    }
    public void setQuestion(Questions question) {
        this.question = question;
    }
    @Override
    public String toString() {
        return "Answer [answer=" + answer + ", answerId=" + answerId + ", question=" + question + "]";
    }
    
}
