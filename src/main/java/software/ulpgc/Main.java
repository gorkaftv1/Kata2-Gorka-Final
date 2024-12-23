package software.ulpgc;

import software.ulpgc.io.FileWoodLoader;
import software.ulpgc.io.TsvWoodDeserializer;
import software.ulpgc.model.Wood;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:/Users/gorka/Downloads/WoodsData.tsv");
        FileWoodLoader fileWoodLoader = new FileWoodLoader(file, new TsvWoodDeserializer());
        List<Wood> woods = fileWoodLoader.load();
        System.out.println(woods);
    }
}
