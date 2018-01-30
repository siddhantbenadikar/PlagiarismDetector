import java.util.*;

public interface IPreProcessor {

    /**
     *
     * @return returns list of tokens which are strings
     */
    List<String> normalizeFiles(FileInput input);
}
