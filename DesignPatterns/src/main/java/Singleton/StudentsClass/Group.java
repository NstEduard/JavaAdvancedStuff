package Singleton.StudentsClass;

public class Group {

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    private String groupName = "a 9 a";
    private static Group instance = new Group();

    private Group(){

    }

    public static Group getInstance() {
        return instance;
    }

    public static void setInstance(Group instance) {
        Group.instance = instance;
    }
}
