public class Product {
    public int code;
    public String name;
    public String data;//срок годности

    public Product()
    {
        code = 12345;
        name = "";
        data = "12-11-2021";
    }

    public Product(int code, String name,String data)
    {
        this.code = code;
        this.name = name;
        this.data = data;
    }

    public String toString()
    {
        return code + " " + name + " " + data;
    }

}
