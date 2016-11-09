
public class Circulo extends FiguraGeometrica{
	
	private double radio;
	
	protected Circulo(String color, double radio)
	{
		super(color);
		this.radio= radio;
	}
	
	protected double getRadio()
	{
		return radio;
	}
	
	protected void setRadio(double radio)
	{
		this.radio= radio;
	}
	
	protected double getArea()
	{
		return Math.PI*Math.pow(radio, 2);
	}

}
