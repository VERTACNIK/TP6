package ejercicio2;

import java.util.Objects;

public class Producto implements Comparable<Producto> {

    private int stock;
    private int precio;
    private int id_prod;
    private String descripcion;
    private String rubro;

    public Producto(int stock, int precio, int id_prod, String descripcion, String rubro) {
        this.stock = stock;
        this.precio = precio;
        this.id_prod = id_prod;
        this.descripcion = descripcion;
        this.rubro = rubro;
    }
    
    public Producto(int id_prod) {
    this.id_prod = id_prod;
}

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getId_prod() {
        return id_prod;
    }

    public void setId_prod(int id_prod) {
        this.id_prod = id_prod;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    @Override
    public int compareTo(Producto otro) {
        // Ordena el TreeSet automáticamente por id_prod de forma ascendente
        return Integer.compare(this.id_prod, otro.id_prod);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Producto otro = (Producto) obj;
        return this.id_prod == otro.id_prod;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_prod);
    }

    
}
