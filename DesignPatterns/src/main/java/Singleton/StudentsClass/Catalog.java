package Singleton.StudentsClass;

public class Catalog {

    private String catalogName = "catalogul clasei a 9 a";
    private static Catalog instance = new Catalog();

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    private Catalog(){

    }

    public static Catalog getInstance() {
        return instance;
    }

    public static void setInstance(Catalog instance) {
        Catalog.instance = instance;
    }
}
