public class HelloWordmachin extends HelloWord {
	private boolean gender;
		//public HelloWordmachin (){}
	public HelloWordmachin(boolean gender , String nname)
	{
		super(nname);		
		this.gender=gender;
	}
	public boolean getGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
public String print(){
	if(gender)
		return "Hello Mr "+ "\t "+ this.getName()+ " !!!";
	else
		return "Hello Miss "+ "\t "+ + this.getName()+ " !!!";
		
	}
}	
