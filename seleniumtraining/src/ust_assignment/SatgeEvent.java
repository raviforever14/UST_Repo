package ust_assignment;

public class SatgeEvent extends Event{
	protected Integer noOfEvents;
	protected String eventName;
	
	public Integer getNoOfEvents() {
		return noOfEvents;
	}
	public void setNoOfEvents(Integer noOfEvents) {
		this.noOfEvents = noOfEvents;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	
	 SatgeEvent(Integer noOfEvents, String EventName) {
		 this.noOfEvents=noOfEvents;
		 this.eventName=EventName;
		 

	}
	

}
