import java.util.ArrayList;
public class StepTracker
{
 private ArrayList <Integer> dailySteps;
 private int actDays;

 public StepTracker(int steps){
   dailySteps= new ArrayList <Integer>();
  actDays= steps;
 }
 public void addDailySteps(int steps){
  dailySteps.add(steps);
 }
 public int activeDays(){
int days=0;
  for(int i=0; i< dailySteps.size(); i++){
   if(i >= actDays){
    days++;
    return days;
   }
  }
 }
 public double averageSteps(){
  if(dailySteps.size() ==0){
   return 0;
  }
    double steps= 0;
  for(int j=0; j< dailySteps.size(); j++){
   steps= steps+s;
  return steps/dailySteps.size();
 }
}
}
                           
