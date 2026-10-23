package main;

import java.io.File;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class User {
	private String username;
	private String password;
	private String email;
	private String pronounce;
	private String bio;
	private String privacy;
	private File pfp;
	private ArrayList<User> followings;
	protected ArrayList<User> followers;
	private ArrayList<Post> posts;
	private ArrayList<Story> stories;
	private ArrayList<Story> archieves;
	private ArrayList<Reel> reels;
	private Map<User, String> DM;
	private Server server;
	private TreeMap<String,Integer> interest;
	private ArrayList<Post> homePage;
	private ArrayList<Post> explorePage;
	private Servers servers;
	private ArrayList<User> followRequest;
	private ArrayList<String> notifications;
	
	public User(String username, String password, String email, String privacy, String reigion, Servers servers) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.privacy = privacy;
		followings = new ArrayList<>();
		followers = new ArrayList<>();
		posts = new ArrayList<>();
		stories = new ArrayList<>();
		reels = new ArrayList<>();
		DM = new TreeMap<>();
		this.servers = new Servers();
		findServer(reigion);
		followRequest = new ArrayList<>();
		notifications = new ArrayList<>();
	}
	
	public void setChangeBio(String bio) {
		this.bio = bio;
	}
	
	public void setChangePronounce(String pronounce) {
		this.pronounce = pronounce;
	}
	
	public void setChangePfp(File photo) {
		pfp = photo;
	}
	
	public void setChangePrivacy(String privacy) {
		this.privacy = privacy;
	}
	
	public void showProfile(User user) {
		System.out.println("Profile Picture: "+ pfp.getAbsolutePath());
		System.out.println(user.username);
		System.out.println("Post: " + user.posts.size() + "Followers: " +  user.followers.size() + "Following: " + user.followings.size());
		System.out.println(pronounce);
		System.out.println("Bio: " + bio);
		if(findMutual(user).size()>0) {
			System.out.println("Followed By: ");
			for(String mutual : findMutual(user)) {
				System.out.println(mutual);
			}
		}
		if(privacy.equals("public") || this.followings.contains(user) || user == this) {
			System.out.println("Posts: ");
			for(Post post : user.posts) {
				System.out.println("Image: " + post.content[0].getPath());
				System.out.println("Location: " + post.location);
				System.out.println(post.caption);
				System.out.println("People Taged: ");
				for(User people: post.tagPeople) {
					System.out.println("@" + people.username);
				}
				System.out.println("Likes: " + post.likes.size());
				System.out.println("Comments: " + post.comments.size());
			}
		}else {
			System.out.println("This account is Private");
		}
		
	}
	
	public void changeUsername(String username, String password) {
		if(password == this.password) {
			this.username = username;
		}
	}
	
	public void changePassword(String email, String oldPassword, String newPassword) {
		if(oldPassword == password && email == this.email) {
			password = newPassword;
		}
	}
	
	public Post imagePost(File[]file, String caption, String location, User[] tagPeople, String sound, String[]hashtags, boolean showLikes, boolean commentsOn) {
		Post post = new Post(file, caption, location, tagPeople, sound, hashtags, showLikes, commentsOn, this);
		posts.add(post);
		if(privacy.equals("public")) {
			server.posts.add(post);
		}
		return post;
	}
	
	public Post storyPost(File[]file, String caption, String location, User[] tagPeople, String sound, String[]hashtags, boolean commentsOn) {
		Story story = new Story(file, caption, location, tagPeople, sound, hashtags, commentsOn, this);
		stories.add(story);
		archieves.add(story);
		if(privacy.equals("public")) {
			server.posts.add(story);
		}
		return story;
	}
	
	public Post reelPost(File[]file, String caption, String location, User[]tagPeople, String sound, String[]hashtags, boolean showLikes, boolean commentsOn) {
		Reel reel = new Reel(file, caption, location, tagPeople, sound, hashtags, showLikes, commentsOn, this);
		reels.add(reel);
		if(privacy.equals("public")) {
			server.posts.add(reel);
		}
		return reel;
	}
	
	public void follow(User user) {
		boolean userFound = false;
		for(User u : server.users) {
			if(u == user) {
				userFound = true;
				break;
			}
		}
		if(userFound) {
			if(user.privacy.equals("public")) {
				user.followers.add(this);
				followings.add(user);
				user.notifications.add(username+ " has started following you!");
			}else {
				user.followRequest.add(user);
				user.notifications.add(username + " has requested to follow you.");
			}
		}else {
			System.out.println("User Not Found");
		}
	}
	
	public void unfollow(User user) {
		boolean userFound = false;
		for(User u : server.users) {
			if(u == user) {
				userFound = true;
				break;
			}
		}
		if(userFound) {
			user.followers.remove(this);
		}else {
			System.out.println("User Not Found");
		}
	}
	
	public void showNotifications() {
		for(String n : notifications) {
			System.out.println(n);
		}
	}
	
	public void approveRequest(User user) {
		for(User u : followRequest) {
			if(u == user) {
				followers.add(user);
				followRequest.remove(u);
				u.notifications.add(username + " has accepted your follow request!");
				break;
			}
		}
	}
	
	public void rejectRequest(User user) {
		for(User u: followRequest) {
			if(u == user) {
				followRequest.remove(u);
				break;
			}
		}
	}
	public void like(Post post) {
		post.likes.add(this);
		post.poster.notifications.add(username + " has liked your post!");
		addToInterest(post, 1);
	}
	
	public void unlike(Post post) {
		post.likes.remove(this);
	}
	
	public void comment(Post post, String comment) {
		Comment c = new Comment(comment, this);
		addToInterest(post, 3);
		post.comments.add(c);
		post.poster.notifications.add(username + " has commented on your post!");
	}
	
	public void removeComment(Post post, String comment) {
		for(Comment c: post.comments) {
			if(c.comment == comment) {
				post.comments.remove(c);
				break;
			}
		}
	}
	
	public void sharePost(Post post, User user) {
		String messageFormat = "User: " + post.poster + "Caption: " + post.caption + "Tags: " + post.hashtags + "Likes: " + post.likes.size();
		addToInterest(post, 2);
		user.DM.put(this, messageFormat);
	}
	
	public void likeComment(Comment comment) {
		comment.likes++;
	}
	
	public void removeLikeComment(Comment comment) {
		comment.likes--;
	}
	
	public void replyStory(Story story, String message) {
		User user = story.poster;
		user.DM.put(this, message);
	}
	
	public void allDM() {
		for(Map.Entry<User, String> people : DM.entrySet() ) {
			User user = people.getKey();
			System.out.println(user.username);
		}
	}
	
	public void DM(User user, String message) {
		user.DM.put(this, message);
	}
	
	public void displayDM(User user) {
		for(Map.Entry<User, String> people : DM.entrySet() ) {
			if(people.getKey() == user || people.getKey() == user) {
				System.out.println(people.getKey() + ": " + people.getValue());
			}
		}
	}
	
	public void displaySound(String sound) {
		System.out.println(sound);
		for(Post post: server.posts) {
			if(post.sound == sound) {
				System.out.println(post.content[0].getAbsolutePath() + post.caption);
			}
		}
	}
	
	public void viewPost(Post post) {
		System.out.println(post.content[0].getAbsolutePath() + "\n");
		if(post.showLikes) {
			System.out.println("Likes: " + post.likes.size());
			if(post.likes.contains(this)) {
				 System.out.println("(Post Liked)");
			}
		}
		System.out.println("Comments: " + post.comments.size());
	}
	
	public void explorePage() {
		ArrayList<Post> posts = new ArrayList<>();
		for(Post post : server.posts) {
			for(int i = 0; i<post.hashtags.length; i++) {
				if(interest.containsKey(post.hashtags[i])) {
					posts.add(post);
				}
			}
		}
		explorePage = posts;
	}
	
	public void homePage(){
		ArrayList<Post> hp = new ArrayList<>();
		for(User u : followers) {
			hp.add(u.posts.get(u.posts.size()-1));
		}
		homePage = hp;
	}
	
	private void addToInterest(Post post, int interestValue) {
		String [] hashtags = post.hashtags;
		for(int i = 0; i<hashtags.length; i++) {
			boolean exist = false; 
			for(Entry<String, Integer> in : interest.entrySet()) {
				if(in.getKey().equals(hashtags[i])) {
					exist = true;
					interest.replace(in.getKey(), in.getValue()+interestValue);
				}
			}
			if(!exist) {
				interest.put(hashtags[i], 1);
			}
		}
	}
	
	private void findServer(String country) {
		boolean serverFound = false;
		for(Server s : servers.getServers()) {
			for(String c : s.countries) {
				if(c.equals(country)) {
					this.server = s;
					serverFound = true;
					break;
				}
			}
			if(serverFound) {
				break;
			}
		}
	}
	
	private ArrayList<String> findMutual(User user) {
		ArrayList<String>mutual = new ArrayList<>();
		for(User u : user.followers) {
			for(User uu : followings) {
				for(User uuu: uu.followings) {
					if(uuu == u) {
						mutual.add(u.username);
					}
				}
			}
		}
		return mutual;
	}
	
	public String getUsername() {
		return username;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public ArrayList<Post> getHomePage(){
		return homePage;
	}
	public ArrayList<Post> getExplorePage(){
		return explorePage;
	}
}
