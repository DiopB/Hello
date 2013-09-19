public class HelloWord {
	private String name;
		public HelloWord (){}
		public HelloWord(String name){
		this.name=name;}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
public String print(){
	return "Hello " +" \t"+ this.name+ " !!!";
	}
}
	System.out.println(a.print());
