package model;

public class User {
	private int userId;
	private String username;
	private String password;
	private String fullname;
	private String avatar;
	private String phone;
	private String email;
	private String address;
	private int isAdmin;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public User() {
		super();
	}

	public int getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(int isAdmin) {
		this.isAdmin = isAdmin;
	}

	public User(int userId, String username, String password, String fullname, String avatar, String phone,
			String email, String address, int isAdmin) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.fullname = fullname;
		this.avatar = avatar;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.isAdmin = isAdmin;
	}

	public User(int userId, String username, int isAdmin) {
		super();
		this.userId = userId;
		this.username = username;
		this.isAdmin = isAdmin;
	}

	public User(int userId, String username, String password, String fullname, String phone, String email,
			String address) {
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.fullname = fullname;
		this.phone = phone;
		this.email = email;
		this.address = address;
	}

	public User(int userId, String username) {
		super();
		this.userId = userId;
		this.username = username;
	}

}
