package com.team9.msd.test_data;

import java.util.Date;
import java.util.List;

//Creates report objects of type IReport
public class Test {
    private Double similarityPercent1;
    private Date timestamp1;
    private List<String> similarLines1;

    // Constructor template for type Report
    // new Report()
    public Test(Double similarityPercent1, Date timestamp, List<String> similarLines1) {
        this.similarityPercent1 = similarityPercent1;
        this.timestamp1 = timestamp;
        this.similarLines1 = similarLines1;
    }

    // Gives the similar highlighted lines
    public String getSimilarLines1() {
        return null;
    }

    // Gives percentage of the similar tokens
    public Double getSimilarityPercent1() {
        return null;
    }


    // Gives a link to download the report
    public String generateDownloadLink() {
        return null;
    }

}

