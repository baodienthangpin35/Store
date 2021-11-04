import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Database {
    public static List<Product> productlist = new ArrayList<Product>();

    public Database ()
    {
        super();
    }

    public void writeFile(List<Product> list) throws IOException
	{
		
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("DATABASE.dat");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(list);			
			
		} catch(Exception e) {
			//logr.log(Level.SEVERE, null,e);
		}
		finally {
			if (fos != null) {
				fos.close();
			}
			if (oos != null) {
				oos.close();
			}
		}
		
	}


    public ArrayList<Product> readFile() throws IOException
	{
		//System.out.println("----------------------");
		//logr.info("Read from File");
		ArrayList<Product> list_clone = new ArrayList<>();
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("DATABASE.dat");
			ois = new ObjectInputStream(fis);
			list_clone = (ArrayList<Product>) ois.readObject();
			
			
		} catch (Exception e) {
			//logr.log(Level.SEVERE, null,e);
		}
		finally {
			if (fis != null) {
				fis.close();
			}
			if (ois != null) {
				ois.close();
			}
		}
		return list_clone;
	}
	
}


