package ust_assignment;

public class revenueDetails {
	
	
	
	public Double minibalance=60.0;
	public Double revenue;
	

	public Double getMinibalance() {
		return minibalance;
	}
	public void setMinibalance(Double minibalance) {
		this.minibalance = minibalance;
	}
	public Double getRevenue() {
		return revenue;
	}
	public void setRevenue(Double revenue) {
		this.revenue = revenue;
	}
	
	public Double getExhibitionRevenue(Integer noOfSeats,Double minBal ) {
		revenue=noOfSeats*minBal;
		return revenue;
		
		
	}
	
	public Double getStageRevenue(Integer noOfStageEvent,Double minBal ) {
		
		revenue=noOfStageEvent*minBal;
		return revenue;
		
		
	}
	
}
