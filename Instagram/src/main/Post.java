package main;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;

public class Post {
	protected User poster;
	protected File [] content;
	protected String caption;
	protected String location;
	protected User[] tagPeople;
	protected String sound;
	protected LocalDate date;
	protected String [] hashtags;
	protected boolean showLikes;
	protected boolean commentsOn;
	
	protected ArrayList<Comment>comments;
	protected ArrayList<User>likes;
	
	public Post (File[]files, String caption, String location, User[] tagPeople, String sound, String []hashtags, boolean showLikes, boolean commentsOn, User poster) {
		content = files;
		this.caption = caption;
		this.location = location;
		this.tagPeople = tagPeople;
		this.sound = sound; 
		this.showLikes = showLikes;
		this.commentsOn = commentsOn;
		this.poster = poster;
		this.hashtags = hashtags;
		date = LocalDate.now();
		likes = new ArrayList<>();
		comments = new ArrayList<>();
	}
}
