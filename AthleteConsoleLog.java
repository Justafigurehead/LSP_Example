import java.io.*;

public class AthleteConsoleLog implements AthleteLog {

  public void distance(int lastRunDistance, int totalDistance){
    String thisRun = "This run was "+lastRunDistance+" meters";
    String totalRuns = "I have ran "+totalDistance+" meters in total";
  
      System.out.println(thisRun);
      System.out.println(totalRuns);

  }

}