package Day2_Request_Body_creation;

public class Ride_requestPOJO {
	String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCustomer_start_lat() {
		return customer_start_lat;
	}

	public void setCustomer_start_lat(String customer_start_lat) {
		this.customer_start_lat = customer_start_lat;
	}

	public String getCustomer_start_lng() {
		return customer_start_lng;
	}

	public void setCustomer_start_lng(String customer_start_lng) {
		this.customer_start_lng = customer_start_lng;
	}

	public String getStart_location() {
		return start_location;
	}

	public void setStart_location(String start_location) {
		this.start_location = start_location;
	}

	public String getCustomer_dest_lat() {
		return customer_dest_lat;
	}

	public void setCustomer_dest_lat(String customer_dest_lat) {
		this.customer_dest_lat = customer_dest_lat;
	}

	public String getCustomer_dest_lng() {
		return customer_dest_lng;
	}

	public void setCustomer_dest_lng(String customer_dest_lng) {
		this.customer_dest_lng = customer_dest_lng;
	}

	public String getDest_location() {
		return dest_location;
	}

	public void setDest_location(String dest_location) {
		this.dest_location = dest_location;
	}

	public String getTotal_distance() {
		return total_distance;
	}

	public void setTotal_distance(String total_distance) {
		this.total_distance = total_distance;
	}

	public String getTotal_payable() {
		return total_payable;
	}

	public void setTotal_payable(String total_payable) {
		this.total_payable = total_payable;
	}

	public String getSahal_commission() {
		return sahal_commission;
	}

	public void setSahal_commission(String sahal_commission) {
		this.sahal_commission = sahal_commission;
	}

	public String getSurge_time() {
		return surge_time;
	}

	public void setSurge_time(String surge_time) {
		this.surge_time = surge_time;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getBase_fare() {
		return base_fare;
	}

	public void setBase_fare(String base_fare) {
		this.base_fare = base_fare;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	String customer_start_lat;
	String customer_start_lng;
	String start_location;
	String customer_dest_lat;
	String customer_dest_lng;
	String dest_location;
	String total_distance;
	String total_payable;
	String sahal_commission;
	String surge_time;
	String discount;
	String base_fare;
	String duration;
	// payment_mode:cash
	// user_id:19
	// customer_name:piyush
	// customer_mobile_number:8986553256
}
