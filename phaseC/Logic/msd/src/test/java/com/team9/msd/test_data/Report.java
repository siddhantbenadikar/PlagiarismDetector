package com.team9.msd.test_data;

import java.util.Date;
import java.util.List;

//Creates report objects of type IReport
public class Report {
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

    // Gives percentage of the similar tokens
    public Double getSimilarityPercent() {
        return null;
    }

    // Gives the similar highlighted lines
    public String getSimilarLines() {
        return null;
    }

    // Gives a link to download the report
    public String generateDownloadLink() {
        return null;
    }
}
