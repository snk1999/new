package snk;

public class Work {
private String name;
public Work () {
}
public Work (String name) {
	this.name=name;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
public void printWork() {
	System.out.println(this.name);
}

}
