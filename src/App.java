public class App {
    public static void main(String[] args) throws Exception {
        int key =1;
        do{
            System.out.println("0--Quit program\n1--Input data\n2--Output data");
			System.out.println("Input operator: ");
			key = Product.ip.nextInt();
			switch(key)
			{
			case 1:
				Product product = new Product();
                product.InputInfoProduct(product);
                Database.productlist.add(product);
				break;
			case 2:
				for (Product i : Database.productlist)
                System.out.println(i.toString());
				break;
			}

        }while(key!=0);

    }
}
