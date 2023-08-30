import accesoadatos.*;

public class Principal {

    public static void main(String[] args) {
        IAccesoDatos datos = new ImplementacionPostgreSql();
        insertarGeneral(datos);
        listarGeneral(datos);
        actualizarGeneral(datos);
        eliminarGeneral(datos);

        datos = new ImplementacionMariaDB();
        insertarGeneral(datos);
        listarGeneral(datos);
        actualizarGeneral(datos);
        eliminarGeneral(datos);


        datos = new ImplementacionMySql();
        insertarGeneral(datos);
        listarGeneral(datos);
        actualizarGeneral(datos);
        eliminarGeneral(datos);

        datos = new ImplementacionOracle();
        insertarGeneral(datos);
        listarGeneral(datos);
        actualizarGeneral(datos);
        eliminarGeneral(datos);


    }
    public static void insertarGeneral(IAccesoDatos datos){
        datos.insertar();
    }

    public static void listarGeneral(IAccesoDatos datos){
        datos.listar();
    }
    public static void actualizarGeneral(IAccesoDatos datos){
        datos.actualizar();
    }
    public static void eliminarGeneral(IAccesoDatos datos){
        datos.eliminar();
    }
}
