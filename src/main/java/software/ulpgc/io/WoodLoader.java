package software.ulpgc.io;

import software.ulpgc.model.Wood;

import java.io.IOException;
import java.util.List;

public interface WoodLoader {
    List<Wood> load() throws IOException;
}
