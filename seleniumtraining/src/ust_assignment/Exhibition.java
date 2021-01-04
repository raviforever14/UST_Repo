package ust_assignment;

public class Exhibition extends Event{
	
	protected Integer noOfSeats;
	protected String exhibitionName;
	
	
	public Integer getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(Integer noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public String getExhibitionName() {
		return exhibitionName;
	}
	public void setExhibitionName(String exhibitionName) {
		this.exhibitionName = exhibitionName;
	}
	
	
	Exhibition(Integer noOfSeats,String exhibitionName){
		this.noOfSeats=noOfSeats;
		this.exhibitionName=exhibitionName;
	}
	

}
