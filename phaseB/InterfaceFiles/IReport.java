public interface IReport {

    /**
     *
     * @return the percentage of similarity between the two FileInputs
     */
    Double getSimilarityPercent();

    /**
     *
     * @return the similar lines in the two FileInputs
     */
    String getSimilarLines();

    /**
     *
     * @return the link to download the similarity report
     */
    String generateDownloadLink();
}
