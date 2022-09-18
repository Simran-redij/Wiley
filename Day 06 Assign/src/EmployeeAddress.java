
public class EmployeeAddress {

	int flatNumber;
	String flatName;
	String roadName;
	String cityName;
	
	public EmployeeAddress(int flatNumber, String flatName, String roadName, String cityName) {
		this.flatNumber = flatNumber;
		this.flatName = flatName;
		this.roadName = roadName;
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return flatNumber + " , " + flatName + " , " + roadName + " , " + cityName;
	}
	
	
	
}
