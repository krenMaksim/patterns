package com.kren.pattern.template.method;

import java.nio.file.Path;
import java.nio.file.Paths;

class TemplateMethodMain {

    public static void main(String[] args) {
        Path path = Paths.get("./my-path/document.pdf");

        DataMiner word = new WordDocMiner();
        DataMiner pdf = new PdfDocMiner();
        
        // Chain of Responsibility can be added here to decide what miner should be used.
        if (path.toString().endsWith(".pdf")) {
            pdf.mine(path);
        } else {
            word.mine(path);
        }
    }

}
