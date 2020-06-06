import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.concurrent.Callable;

public class DownloadTask implements Callable<String> {

    String siteLocation;

    public DownloadTask(String siteLocation) {
        this.siteLocation = siteLocation;
    }

    @Override
    public String call() throws Exception {
        Path downloadLocation = Paths.get("/download.pdf");



        URL url = new URL(siteLocation);



        InputStream inputStream = url.openStream();

        Files.copy(inputStream, downloadLocation, StandardCopyOption.REPLACE_EXISTING);

        return null;

    }
}
