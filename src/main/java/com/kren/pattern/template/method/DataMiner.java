package com.kren.pattern.template.method;

import java.nio.file.Path;

abstract class DataMiner {

    public void mine(Path path) {
        Data data = extractData(path);
        Report report = analyzeData(data);
        save(report);
    }

    abstract Data extractData(Path path);

    abstract Report analyzeData(Data data);

    private void save(Report report) {
        System.out.println(String.format("%s report has been saved.", report));
    }
}

class Data {

}

class Report {

}
