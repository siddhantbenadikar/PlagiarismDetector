import java.util.List;

// Creates PreProcessor objects of type IPreProcessor
public class PreProcessor implements IPreProcessor {
    private FileInput fileA;
    private FileInput fileB;

    // Creates contructor of type PreProcessor
    // new PreProcessor()
    public PreProcessor(FileInput fileA, FileInput fileB) {
        this.fileA = fileA;
        this.fileB = fileB;
    }

    // returns fileA
    public FileInput getFileA() {
        return fileA;
    }

    // returns fileB
    public FileInput getFileB() {
        return fileB;
    }

    @Override
    //Normalizes the files
    public List<String> normalizeFiles(FileInput input) {
        return null;
    }
}
