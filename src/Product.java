import java.util.Scanner;

public class Product {
    public static Scanner ip = new Scanner(System.in);
    
    protected int code;
    protected String name;
    protected String date;//срок годности
    protected double price;

    public Product()
    {
        code = 12345;
        name = "";
        date = "12-11-2021";
        price = 1000;
    }

    public Product(int code, String name,String data, double price)
    {
        this.code = code;
        this.name = name;
        this.date = data;
        this.price = price;
    }

    public int getCode()
    {
        return code;
    }

    public void setCode(int code)
    {
        this.code = code;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getData()
    {
        return date;
    }

    public void setData(String data)
    {
        this.date = data;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public String toString()
    {
        return code + " " + name + " " + date;
    }

    public void InputInfoProduct(Product product)
    {
        ip.nextLine();
		System.out.println("Input code:");
		product.setCode(ip.nextInt());
		System.out.println("Input name:");
		product.setName(ip.nextLine());
		ip.nextLine();
		System.out.println("Input date:");
		product.setData(ip.nextLine());
        System.out.println("Input price:");
		product.setPrice(ip.nextDouble());
    }


}
