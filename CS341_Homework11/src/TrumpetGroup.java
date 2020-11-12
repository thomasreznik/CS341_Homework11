
public class TrumpetGroup implements Observer {
	
	public void update(StateChange m) {
		System.out.println("Notifications to Trumpets: " + m.getMessageContent());
	}
}
