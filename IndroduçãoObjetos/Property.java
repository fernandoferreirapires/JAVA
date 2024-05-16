public class Property {

    private String address;
    private double price;
    private double size;

    public Property(String address, double price,double size){
        this.address = address;
        this.price = price;
        this.size = size;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getSize(){
        return size;
    }
    public void setSize(double size){
        this.size = size;
    }
    public static void main(String[] args) {
        Property property1 = new Property("123 Main St", 200000, 1500);
        Property property2 = new Property("456 Elm St", 300000, 2000);

        System.out.println("Propriedade 1: ");
        System.out.println("Endereço: " + property1.getAddress());
        System.out.println("Preço: $" + property1.getPrice());
        System.out.println("Tamanho: " + property1.getSize() + " sqft");

        System.out.println("\nPropriedade 2: ");
        System.out.println("Endereço: " + property2.getAddress());
        System.out.println("Preço: $" + property2.getPrice());
        System.out.println("Tamanho: " + property2.getSize() + " sqft");
    }
}