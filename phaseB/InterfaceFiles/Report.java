import java.util.Date;
import java.util.*;

//Creates report objects of type IReport
public class Report implements IReport {
    private Double similarityPercent;
    private Date timestamp;
    private List<String> similarLines;

    // Constructor template for type Report
    // new Report()
    public Report(Double similarityPercent, Date timestamp, List<String> similarLines) {
        this.similarityPercent = similarityPercent;
        this.timestamp = timestamp;
        this.similarLines = similarLines;
    }

    @Override
    // Gives percentage of the similar tokens
    public Double getSimilarityPercent() {
        return null;
    }

    @Override
    // Gives the similar highlighted lines
    public String getSimilarLines() {
        return null;
    }

    @Override
    // Gives a link to download the report
    public String generateDownloadLink() {
        return null;
    }
}
