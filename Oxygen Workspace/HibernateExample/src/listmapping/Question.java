package listmapping;

import java.util.List;

public class Question {
	private int id;  
	private String qname;
	//List will  contain the answers 
	//currently we are using string
	private List<String> answers;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQname() {
		return qname;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}
	public List<String> getAnswers() {
		return answers;
	}
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}  
}
