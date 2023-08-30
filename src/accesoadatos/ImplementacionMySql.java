package accesoadatos;

public class ImplementacionMySql implements IAccesoDatos{


    @Override
    public void insertar() {
        System.out.println("insertando desde MySql");
    }

    @Override
    public void listar() {
        System.out.println("listandon desde MySql");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizadno desde MySql");

    }

    @Override
    public void eliminar() {
        System.out.println("Eliminando desde MySql");

    }
}
