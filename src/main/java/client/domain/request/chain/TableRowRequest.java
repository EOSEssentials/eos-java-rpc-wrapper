package client.domain.request.chain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TableRowRequest {

    private int limit;

    private String scope;

    private int lowerBound;

    private Boolean json;

    private String table;

    private String code;

    private int upperBound;

    public TableRowRequest(String scope, String code, String table, Boolean json, int lowerBound, int upperBound, int limit) {
        this.limit = limit;
        this.scope = scope;
        this.lowerBound = lowerBound;
        this.json = json;
        this.table = table;
        this.code = code;
        this.upperBound = upperBound;
    }

    public int getLimit() {
        return limit;
    }

    public void withLimit(int limit) {
        this.limit = limit;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    @JsonProperty("lower_bound")
    public int getLowerBound() {
        return lowerBound;
    }

    public void setLowerBound(int lowerBound) {
        this.lowerBound = lowerBound;
    }

    public Boolean getJson() {
        return json;
    }

    public void setJson(Boolean json) {
        this.json = json;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("upper_bound")
    public int getUpperBound() {
        return upperBound;
    }

    public void setUpperBound(int upperBound) {
        this.upperBound = upperBound;
    }

}
