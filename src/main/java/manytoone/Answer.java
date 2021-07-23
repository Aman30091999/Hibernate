package manytoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity(name = "Multiple_Answer")
public class Answer {
    @Id
   @Column(name = "a_Id")
    private int answerId;
    private String answer;
    @ManyToOne
    private Question question;
    public Answer(int answerId, String answer, Question question) {
        this.answerId = answerId;
        this.answer = answer;
        this.question = question;
    }
    public Answer() {
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
    public Question getQuestion() {
        return question;
    }
    public void setQuestion(Question question) {
        this.question = question;
    }
    @Override
    public String toString() {
        return "Answer [answer=" + answer + ", answerId=" + answerId + ", question=" + question + "]";
    }
    
}
