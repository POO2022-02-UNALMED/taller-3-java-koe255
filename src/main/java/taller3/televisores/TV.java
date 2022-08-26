package taller3.televisores;

public class TV {
    private Marca marca;
    private boolean estado;
    private int canal;
    private int volumen;
    private int precio;
    private Control control;

    public static int numTV = 0;

    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
        this.canal = 1;
        this.volumen = 1;
        this.precio = 500;

        numTV += 1;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Control getControl() {
        return control;
    }

    public void setControl(Control control) {
        this.control = control;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if (canal >= 1 && canal <= 120 && this.estado) {
            this.canal = canal;
        }
    }

    public static int getNumTV() {
        return numTV;
    }

    public static void setNumTV(int numTV) {
        TV.numTV = numTV;
    }

    public boolean getEstado() {
        return estado;
    }

    public void turnOn() {
        this.estado = true;
    }

    public void turnOff() {
        this.estado = false;
    }

    public void canalUp() {
        if (this.estado && this.canal != 120) {
            this.canal += 1;
        }
    }

    public void canalDown() {
        if (this.estado && this.canal != 1) {
            this.canal -= 1;
        }
    }

    public void volumenUp() {
        if (this.estado && this.volumen != 7) {
            this.volumen += 1;
        }
    }

    public void volumenDown() {
        if (this.estado && this.volumen != 1) {
            this.volumen -= 1;
        }
    }
}