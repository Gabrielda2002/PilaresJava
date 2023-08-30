package accesoadatos;

public class ImplementacionOracle implements IAccesoDatos{


    @Override
    public void insertar() {
        System.out.println("insertando desde Oracle");
    }

    @Override
    public void listar() {
        System.out.println("listandon desde Oracle");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizando desde Oracle");
    }

    @Override
    public void eliminar() {
        System.out.println("eliminando desde Oracle");
    }
}
