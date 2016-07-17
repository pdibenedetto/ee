package demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
// <1>
public class Greeting implements Serializable {

	@Id
	@GeneratedValue
	private Long id;

	@Override
	public String toString() {
		return "Greeting{" + "id=" + id + ", message='" + message + '\'' + '}';
	}

	private String message;

	public String getMessage() {
		return message;
	}

	public Greeting(String name) {
		this.message = "Hi, " + name + "!";
	}

	Greeting() {
	}
}
