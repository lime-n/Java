package TestLEarning;

import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;


public class DatasetLoading {

  public static Instances loadData(String location) {
    try {
      return DataSource.read(location);
    }
    catch (Exception e) {
      System.err.println("Failed to load data from: " + location);
      e.printStackTrace();
      return null;
    }
  }

  public static void main(String[] args) {
    String dataLocation = "C:/Users/Emil/Desktop/Machine Learning - Java/Week 1/Arsenal_TRAIN1.arff";
    Instances train = loadData(dataLocation);
    System.out.println(train);
  }
}
