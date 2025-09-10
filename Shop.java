
public class Shop {
    public static void main(String[] args) {
        System.out.println("Bienvenido a la tienda Duke Choice");
        Customer c1 = new Customer("Pinky", "S");
        System.out.println("Precio Minimo: " + Clothing.min_Price);
        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");
        Clothing item3 = new Clothing("Green Scarf", 5, "S");
        Clothing item4 = new Clothing("Blue T-Shirt", 10.5, "S");
        Clothing[] items={item1,item2,item3,item4};
        //total = (item1.getPrecio() + (item2.getPrecio() * 2) * (1 * tax));
        c1.addItem(items);
        System.out.println("Total: " + c1.getTotalClothingCost());
        int measurement = 7;
        c1.setSize(measurement);
        System.out.println("El nombre del cliente es: " + c1.getName() + "El talle del cliente es: " + c1.getSize());
        for (Clothing item : items) {
            System.out.println("Item: " + item);
            //System.out.println("Descripción: " + item.getDescripcion() + ", " + "Precio: " + item.getPrecio() + ", " + "Tamanio: " + item.getTamanio());
        }
    }
}
