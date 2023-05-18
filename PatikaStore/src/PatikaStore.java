import java.util.ArrayList;
import java.util.Scanner;


public class PatikaStore {
    private static ArrayList<String> brands;
    private static ArrayList<Product> products;

    public PatikaStore(){
        brands=new ArrayList<>();
        products =new ArrayList<>();
    }


    public static void main(String[] args) {
        PatikaStore store=new PatikaStore();
        //Add Product of Notebook
        store.addProduct(1,1,"Macbook",7000.0,"Apple",512,15,16);
        store.addProduct(1,2,"Lenovo V14",3500.0,"Lenovo",1024,14,4);
        store.addProduct(1,3,"Acer Aspire",8199.0,"Acer",2048,16,8);

        //Add Product of Phone

        store.addProduct(2,4,"Samsung A72",3400.0,"Samsung",128,6,4);
        store.addProduct(2,5,"Samsung A52",4400.0,"Samsung",256,6,4);
        store.addProduct(2,6,"Redmi Note 10", 4012.0,"Xiaomi",128,7,6);


        System.out.println("Welcome to Patika Store");
        Scanner sc=new Scanner(System.in);
        System.out.println("1- Notebook ");
        System.out.println("2- Phone");
        System.out.println("3- Our Brands");
        System.out.println("4-Add Product");
        System.out.println("0- Çıkış Yap");
        System.out.print("Tercihiniz: ");
        int choose=sc.nextInt();
            switch (choose) {
                case 1:
                    listProductsNotebook();
                    break;
                case 2:
                    listProductPhone();
                    break;
                case 3:
                    System.out.println("Our brands");
                    System.out.println("---------");
                    PatikaStore.listBrands();
                    break;
                case 4:
                    userAddProduct();
                    break;
                case 0:
                    return;
                default:

            }
        }

    public static void userAddProduct(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Notebook(1) or Phone(2)");
        int ans=sc.nextInt();
        if (ans==1){
            System.out.print("ID: ");
            int id=sc.nextInt();
            System.out.print("Name: ");
            String name=sc.next();
            System.out.print("Price: ");
            double price=sc.nextDouble();
            System.out.print("Brand: ");
            String brand=sc.next();
            System.out.print("Storage: ");
            int storage=sc.nextInt();
            System.out.print("Inç: ");
            int inç=sc.nextInt();
            System.out.print("Ram: ");
            int ram=sc.nextInt();

            addProduct(1,id,name,price,brand,storage,inç,ram);
        }

        if (ans==2){
            System.out.print("ID: ");
            int id=sc.nextInt();
            System.out.print("Name: ");
            String name=sc.nextLine();
            System.out.print("Price: ");
            double price=sc.nextDouble();
            System.out.print("Brand: ");
            String brand=sc.nextLine();
            System.out.print("Storage: ");
            int storage=sc.nextInt();
            System.out.print("Inç: ");
            int inç=sc.nextInt();
            System.out.print("Ram: ");
            int ram=sc.nextInt();
            addProduct(2,id,name,price,brand,storage,inç,ram);
        }
    }
    public static void listBrands(){
        brands=new ArrayList<>();
        brands.add("Samsung");
        brands.add("Lenovo");
        brands.add("Apple");
        brands.add("Huawei");
        brands.add("Casper");
        brands.add("Asus");
        brands.add("HP");
        brands.add("Xiaomi");
        brands.add("Monster");
        for (String brands: brands){
            System.out.println(brands);
        }
    }
    public static void addProduct(int choose,int id,String name,double price,String brand,int storage,int inç,int ram){
        Product product;
        if (choose==1){
            product=new Notebook(id,name,price,brand,storage,inç,ram);
        }else if (choose==2){
            product =new Phone( id, name, price,brand, storage, inç, ram);
        }else {
            System.out.println("Invalid Entry");
            return;
        }
        products.add(product);
    }
    public static void listProductsNotebook(){
        System.out.println("ID \t Product\tPrice\t Brands\t Depolama" +
                "\t Inç \t Ram");
        for (Product product: products){
            if (product instanceof Notebook){
                System.out.println(product.getId() + " \t " + product.getName() + " \t " + product.getPrice() +
                        " \t" + product.getBrand() + " \t " + ((Notebook) product).getStorage() + " \t " + ((Notebook) product).getInç()+ " \t "+((Notebook) product).getRam());
            }
        }
        System.out.println("----------------------");
    }
    public static void listProductPhone(){
        System.out.println("ID \t Product\tPrice\t Brands\t Depolama" +
                "\t Inç \t Ram");

        for (Product product: products){
            if (product instanceof Phone){
                System.out.println(product.getId()+" \t "+product.getName()+" \t "+product.getPrice()+
                        "\t "+product.getBrand()+"\t "+((Phone)product).getMemory()+"\t "+ ((Phone) product).getInç()+"\t "+ ((Phone) product).getRam());
            }
        }
    }
    public void removeProduct(int id){
        if (products.contains(id)){
            products.remove(id);
        }else {
            System.out.println("Product Not Found");
        }
    }
}
