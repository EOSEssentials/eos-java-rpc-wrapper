package client.domain.response.chain;

import java.util.List;
import java.util.Map;

public class TableRow {

    private List<Map<String, String>> rows;

    private Boolean more;

    public TableRow() {

    }

    public List<Map<String, String>> getRows() {
        return rows;
    }

    public void setRows(List<Map<String, String>> rows) {
        this.rows = rows;
    }

    public Boolean getMore() {
        return more;
    }

    public void setMore(Boolean more) {
        this.more = more;
    }
}
