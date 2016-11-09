
public class Rectangulo extends FiguraGeometrica{
	double base;
	double altura;
	
	protected  Rectangulo(String color, double base, double altura)
	{
		super(color);
		this.base= base;
		this.altura= altura;
		
	}
	
	protected double getBase()
	{
		return base;
	}
	
	protected double getAltura()
	{
		return altura;
	}
	
	protected void setBase(double base)
	{
		this.base= base;
	}

	protected void setAltura(double altura)
	{
		this.altura= altura;
	}
	
	protected double getArea()
	{
		return base*altura;
	}
}
