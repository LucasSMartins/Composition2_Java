package entities;

public class Comment {
	private String text;

	public Comment() {

	}

	public Comment(String text) {
		super();
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void addComment(Comment comment) {
		comment.addComment(comment);
	}

	public void removeComment(Comment comment) {
		comment.removeComment(comment);
	}

	
}
