package client.domain.response.chain.code;

import java.util.List;

public class Struct {

    private String name;

    private String base;

    private List<StructField> fields;

    public Struct() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public List<StructField> getFields() {
        return fields;
    }

    public void setFields(List<StructField> fields) {
        this.fields = fields;
    }
}
