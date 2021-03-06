package springmvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="User12")
public class User1 {
	@Column(name="email")
private String email;
	@Column(name="name")
private String name;
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "User [email=" + email + ", name=" + name + "]";
}

}
