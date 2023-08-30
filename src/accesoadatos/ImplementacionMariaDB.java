package accesoadatos;

public class ImplementacionMariaDB implements IAccesoDatos{

    @Override
    public void insertar() {
        System.out.println("insertando desde MariaDB");
    }

    @Override
    public void listar() {
        System.out.println("listando desde MariaDB");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizando desde MariaDB");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminando  desde MariaDB");
    }
}
