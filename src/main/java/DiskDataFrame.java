import java.util.List;

public class DiskDataFrame implements DataFrame{
    DiskDataFrame(String file) {}

    public DataFrame filterBy(FilterCriteria filterCriteria) {
        return null;
    }

    public FilterCol col(String colName) {
        return null;
    }

    public DataFrame select(String... columnNames) {
        return null;
    }

    public DataFrame append(List<Object> row) {
        return null;
    }

    public GroupByObject groupBy(String... columnNames) {
        return null;
    }

    public DataFrame join(DataFrame other, List<String> selfColumns, List<String> otherColumns) {
        return null;
    }

    public List<List<Object>> rows() {
        return null;
    }

    public void print() {

    }
}
