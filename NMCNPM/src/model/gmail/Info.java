package model.gmail;

public class Info {
	String id, email, name, fullName, img;

	public String getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public String getName() {
		return name;
	}

	public String getFullName() {
		return fullName;
	}

	public String getImg() {
		return img;
	}

	public Info(String id, String email, String name, String fullName, String img) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.fullName = fullName;
		this.img = img;
	}
}
