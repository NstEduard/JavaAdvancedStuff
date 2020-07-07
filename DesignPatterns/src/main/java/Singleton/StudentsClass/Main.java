package Singleton.StudentsClass;

public class Main {
    public static void main(String[] args) {
    // inceput de clasa a 9 a
        Catalog catalog = Catalog.getInstance();
        Group group = Group.getInstance();

        catalog.setCatalogName("catalogul clasei a 10 a B ");
        group.setGroupName("a 10 a B");

        Catalog catalog2 = Catalog.getInstance();
        Group group2 = Group.getInstance();

        System.out.println(catalog.getCatalogName());
        System.out.println(catalog2.getCatalogName());

        System.out.println(group.getGroupName());
        System.out.println(group2.getGroupName());

        group.setGroupName("clasa a 11 a B");
        catalog.setCatalogName("calalogul clasei a 11 a B");

        System.out.println(group.getGroupName());
        System.out.println(group2.getGroupName());
        System.out.println(catalog2.getCatalogName());
        System.out.println(catalog.getCatalogName());
    }
}
