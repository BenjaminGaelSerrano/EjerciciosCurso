
public class Customer {
    private String name;
    private String size;
    private Clothing[] items;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    public void setSize(int measurement) {
        switch (measurement) {
            case 1: case 2: case 3:
                this.setSize("S");
                break;
            case 4:  case 5: case 6:
                this.setSize("M");
                break;
            case 7: case 8: case 9:
                this.setSize("L");
                break;
            default:
                this.setSize("X");
        }
    }

    public Customer(String name, String size) {
        this.name = name;
        this.size = size;
    }

    public Customer() {
        this.name = "Marco";
        this.size = "M";
    }
    public void addItem(Clothing[] someItems){
        this.items = someItems;
    }
    public Clothing[] getItems() {
        return items;
    }
    public double getTotalClothingCost(){
        double total=0.0;
        for (Clothing item : items) {
            //if(item.getTamanio()==c1.getSize()){
                total+= item.getPrecio();
                //if(total>15){break;}
                //System.out.println("Descripción: " + item.getDescripcion() + ", " + "Precio: " + item.getPrecio() + ", " + "Tamanio: " + item.getTamanio());
                //total+=total*tax;
            }
        return total;
        }

}

