package main;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Servers INSTAGRAM = new Servers();
		
		//countries that will go the singapore server.
		ArrayList<String> cfsSingapore = new ArrayList<>();//countries fos server
		cfsSingapore.add("Singapore");
		cfsSingapore.add("Indonesia");
		cfsSingapore.add("Philiphines");
		cfsSingapore.add("India");
		
		ArrayList<String> cfsFrance = new ArrayList<>();
		cfsFrance.add("France");
		cfsFrance.add("Spain");
		cfsFrance.add("England");
		cfsFrance.add("Portugal");
		
		Server SG = new Server(cfsSingapore, INSTAGRAM);
		Server FR = new Server(cfsFrance, INSTAGRAM);
		
		User me = new User ("Nick", "myPassword", "me@gmail.com", "public", "Indonesia", INSTAGRAM);
		me.setChangeBio("I love Football");
		me.setChangePronounce("nick/her");
		
		User person1 = new User("Dylan111", "PswD.112233", "dylan.evans@gmail.com", "private", "Singapore", INSTAGRAM);
		person1.setChangeBio("I am Handsome DYLAN");
		person1.setChangePronounce("He/Him");
		person1.setChangePfp(null);
		
		User person2 = new User("IvanderG", "13ppSD", "darth.vander@gmail.com", "private", "France", INSTAGRAM);
		person2.setChangeBio("08'");
		person2.setChangePronounce("HIMMM");
		
		User person3 = new User("INVSTcrypto", "timotyronalIDOLAKU", "adi.cryp@gmail.com", "private", "India", INSTAGRAM);
		person3.setChangeBio("Timonty Ronald no1 FANNN - Invest CRYPTO BOSS");
		person3.setChangePronounce("MONEY/Dollars");
		
		User business1 = new User("Starbucks", "matcha.Coffee", "star.bucks@gmail.com", "public", "India", INSTAGRAM);
		business1.setChangeBio("Buy your own matcha latte with a Price of 15 Euro!");
		
		User business2 = new User("GucciOfficial", "@overPRICED", "gucci.store@gmail.com", "public", "Spain", INSTAGRAM);
		business2.setChangeBio("bags for sale");
		
		User influencer1 = new User("Ronaldo", "i.LoVe.Georgina<3", "ronaldo77@gmail.com", "public", "Portugal", INSTAGRAM);
		influencer1.setChangeBio("al- NASSAR");
		
		User influencer2 = new User("MrBeast", "m000n33yy", "beast101@gmail.com", "public", "England", INSTAGRAM);
		influencer2.setChangeBio("Feastables available NOW!");
		
		me.follow(influencer1);
		me.follow(influencer2);
		me.follow(business1);
		me.showProfile(person2);
		me.follow(person2);
		
		person2.showNotifications();
		person2.approveRequest(me);
		
		me.showProfile(person2);
		
		
		me.follow(person1);
		User[]tagged = {person1, person2, business1};
		String[]hashtags = {"#firstPost", "#myBusiness"};
		Post post1 = me.imagePost(null, "My first Post!", "Abyss Location", tagged, "When I was your mand - Bruno mars", hashtags, true, false);
		
		person1.like(post1);
		person2.like(post1);
		person3.like(post1);
		
		me.showNotifications();
		
		me.DM(influencer2, "I really like the Video!");
		influencer2.DM(me, "thanks");
		me.DM(influencer2, "another DMMM");
		me.DM(influencer2, "test again");
		influencer2.DM(me, "stop testing!");
		me.displayDM(me);
		
		me.DM(person3, "other person");
		me.DM(person2, "another person");
		me.allDM();
	}

}
