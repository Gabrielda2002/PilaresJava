package accesoadatos;

public class ImplementacionPostgreSql implements IAccesoDatos{


    @Override
    public void insertar() {
        System.out.println("imsertar desde postgre");
    }

    @Override
    public void listar() {
        System.out.println("listandon desde postgre");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizando desde postgre");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminando desde postgre");
    }
}
