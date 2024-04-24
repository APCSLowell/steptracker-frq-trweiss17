import java.util.ArrayList;
public class StepTracker
{
 private int leastSteps;
 private int allSteps;
 private int allDays;
 private int actDays;

 public StepTracker(int goal){
   leastSteps= goal;
  allSteps= 0;
  allDays= 0;
  actDays=0;
 }
 public void addDailySteps(steps){
   allSteps= allSteps+ steps;
  allSteps++;
  if(steps>= leastSteps)
   actDays++;
  }
 public int activeDays(actDays){
return actDays;
 }
 public double averageSteps(){
  if(allDays==0){
   return 0.0;
 else
  return (double) allSteps/allDays;
 }
}
                           
