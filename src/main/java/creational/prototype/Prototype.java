package creational.prototype;

public interface Prototype {
    Prototype clone();
}

class Circle implements Prototype {
    private int radius;
    private String color;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Copy constructor for cloning
    private Circle(Circle target) {
        if (target != null) {
            this.radius = target.radius;
            this.color = target.color;
        }
    }

    @Override
    public Prototype clone() {
        return new Circle(this);
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", color=" + color + "]";
    }
}

class Rectangle implements Prototype {
    private int width;
    private int height;
    private String color;

    public Rectangle(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    // Copy constructor for cloning
    private Rectangle(Rectangle target) {
        if (target != null) {
            this.width = target.width;
            this.height = target.height;
            this.color = target.color;
        }
    }

    @Override
    public Prototype clone() {
        return new Rectangle(this);
    }

    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", height=" + height + ", color=" + color + "]";
    }
}


class Address {
    private String street;
    private String city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    // Getters and Setters
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return street + ", " + city;
    }
}

class Person implements Cloneable {
    private String name;
    private Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    // Shallow copy
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // Deep copy
    public Person deepClone() {
        try {
            Person cloned = (Person) super.clone();
            cloned.address = new Address(this.address.getStreet(), this.address.getCity());
            return cloned;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return name + " lives at " + address;
    }
}
