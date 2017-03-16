class Main {
  public static void main(String[] args){
    Athlete athlete = new Athlete(new AthleteConsoleLog());
    athlete.run(10); 
    athlete.run(3);  
    athlete.run(0);
    Athlete athlete2 = new Athlete(new AthleteFileLog());
    athlete2.run(12);
    athlete2.run(10);

  }
}