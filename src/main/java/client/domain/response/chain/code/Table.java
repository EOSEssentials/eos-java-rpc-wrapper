package client.domain.response.chain.code;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Table {

    private String name;

    private String type;

    private String indexType;

    private List<String> keyNames;

    private List<String> keyTypes;

    public Table() {

    }

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

    @JsonProperty("index_type")
    public String getIndexType() {
        return indexType;
    }

    public void setIndexType(String indexType) {
        this.indexType = indexType;
    }

    @JsonProperty("key_names")
    public List<String> getKeyNames() {
        return keyNames;
    }

    public void setKeyNames(List<String> keyNames) {
        this.keyNames = keyNames;
    }

    @JsonProperty("key_types")
    public List<String> getKeyTypes() {
        return keyTypes;
    }

    public void setKeyTypes(List<String> keyTypes) {
        this.keyTypes = keyTypes;
    }
}
