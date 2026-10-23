package mullyINC;

import java.util.UUID;

public class Member {
	private UUID id;
	private String name;
	private String email;
	private String number;
	private String address;
	private String birthdate;
	public Member(String n, String e, String nu, String a, String b) {
		id = UUID.randomUUID();
		name = n;
		email = e;
		number = nu;
		address = a;
		birthdate = b;
	}
}
