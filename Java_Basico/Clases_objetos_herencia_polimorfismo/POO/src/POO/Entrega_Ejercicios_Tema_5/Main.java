package POO.Entrega_Ejercicios_Tema_5;

public class Main {

    public interface CocheCRUD {

        void save();
        void findAll();
        void delete();
    }

    public static class CocheCRUDImpl implements CocheCRUD {

        @Override
        public void save() {

        }

        @Override
        public void findAll() {

        }

        @Override
        public void delete() {

        }

        String save  = "Guardando";
        String findAll = "Buscar Todo";
        String delete = "Borrando";

        @Override
        public String toString() {
            return "CocheCRUDImpl{" +
                    "save='" + save + '\'' +
                    ", findAll='" + findAll + '\'' +
                    ", delete='" + delete + '\'' +
                    '}';
        }
    }


    public static void main(String[] args) {

        CocheCRUD cocheCrud = new CocheCRUDImpl();
        System.out.println(cocheCrud);
    }
}
