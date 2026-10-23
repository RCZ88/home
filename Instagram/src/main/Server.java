package main;
import java.util.ArrayList;

public class Server {
	protected ArrayList<String> countries;
	protected ArrayList<User>users;
	protected ArrayList<Post> posts; 
	public Server(ArrayList<String> countries, Servers server) {
		this.countries = countries;
		users = new ArrayList<>();
		posts = new ArrayList<>();
		server.getServers().add(this);
	}
}
