package com.kren.pattern.template.method;

import java.nio.file.Path;

class PdfDocMiner extends DataMiner {

    @Override
    Data extractData(Path path) {
        System.out.println(String.format("[PdfDocMiner] Data has been exracted from %s.", path));
        return new Data();
    }

    @Override
    Report analyzeData(Data data) {
        System.out.println(String.format("[PdfDocMiner] %s data has been analyzed.", data));
        return new Report();
    }
}
