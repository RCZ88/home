package main;

import java.io.File;

public class Reel extends Post{
	
	private int views;
	public Reel(File[] files, String caption, String location, User[] tagPeople, String sound, String []  hashtags, boolean showLikes,
			boolean commentsOn, User poster) {
		super(files, caption, location, tagPeople, sound, hashtags,  showLikes, commentsOn, poster);
		// TODO Auto-generated constructor stub
	}

}
