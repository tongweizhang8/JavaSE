package domain;

public class printer implements Equipment{
    private String name;//機器型號
    private String type;//機器類型

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public printer() {
    }

    public printer(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getDescription() {
        return name + " (" + type + ")";
    }
}
