
public class ColorFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		if(color == null) {
			return null;
		}
		if(color.equalsIgnoreCase("RED")){
			return new Red();
		}	
		if(color.equalsIgnoreCase("GREEN")){
			return new Green();
		}	
		if(color.equalsIgnoreCase("BLUE")){
			return new Blue();
		}	
		return null;
	}
	
	

	@Override
	public Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		return null;
	}

}
