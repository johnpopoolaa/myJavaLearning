class Laptop
{
    String model;
    int price;
    
    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + "]";
    }

    // I do not know what this does yet.

    // public int hashCode() {
    //     final int prime = 31;
    //     int result = 1;
    //     result = prime * result + ((model == null) ? 0 : model.hashCode());
    //     result = prime * result + price;
    //     return result;
    // }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }
}

// understand how to use methods that are in the object class
public class objClass {
    public static void main(String a[])
    {
        Laptop obj = new Laptop();
        obj.model = "Lenovo Thinkpad";
        obj.price = 2000;

        Laptop obj1 = new Laptop();
        obj1.model = "Lenovo Thinkpad";
        obj1.price = 2000;

        System.out.println(obj.equals(obj1));
        System.out.println(obj);
    }
}