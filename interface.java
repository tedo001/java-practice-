interface Dad {
	void dad();
}
interface Mom {
	void mom();

}
class child implements Dad,Mom {
	public void dad() {
		System.out.println("hi dad");
	}
	public void mom() {
		System.out.println("hi mom");
	}

}
public class Main
{
	public static void main(String[] args) {
		child m= new child();
		m.mom();
		m.dad();
	}


}
