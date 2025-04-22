class triangle
{
    private double height;
    private double base;

    public triangle(double height, double base)
    {
        this.height = height;
        this.base = base;
    }

    public void setHeight(double x)
    {
        height = x;
    }
    public double getHeight()
    {
        return height;
    }

    public void setBase(double y)
    {
        base = y;
    }
    public double getBase()
    {
        return base;
    }

    public double getArea()
    {
        return 0.5*height*base;
    }



    public static void main(String[] args)
    {
        triangle t = new triangle(5,8);     //using constructor
        double area = t.getArea();
        System.out.println("Area : " + area);

        t.setHeight(9);     //using setter gettter
        t.setBase(3);

        double updatedArea = t.getArea();
        System.out.println("updated area : " + updatedArea);

    }
}