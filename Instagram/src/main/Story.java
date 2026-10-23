package main;

import java.io.File;
import java.time.LocalDate;

public class Story extends Post{
	
	public Story(File[] files, String caption, String location, User[] tagPeople, String sound, String [] hashtags, boolean commentsOn, User poster) {
		super(files, caption, location, tagPeople, sound, hashtags, false, commentsOn, poster);
		// TODO Auto-generated constructor stub
		date = LocalDate.now();
	}
	
}
