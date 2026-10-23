package main;

public class Comment {
	protected String comment;
	protected User user;
	protected int likes;
	public Comment(String comment, User user) {
		this.comment = comment;
		this.user = user;
		likes = 0;
	}
}
