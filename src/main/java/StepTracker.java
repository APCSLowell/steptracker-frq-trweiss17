import java.util.ArrayList;
public class StepTracker
{
 private ArrayList <Integer> myDailySteps;
 private int active;

 public StepTracker(int steps){
   myDailySteps= new ArrayList <Integer>();
  active= steps;
 }
 public void addDailySteps(int steps){
  myDailySteps.add(steps);
 }
 public int activeDays(){
int days=0;
  for(int i: myDailySteps)
   if(i >= active)
    days++;
    return days;
   }
 public double averageSteps(){
  if(myDailySteps.size() ==0)
   return 0;
    double steps= 0;
  for(int i: myDailySteps)
   steps= steps+i;
  return steps/myDailySteps.size();
}
}
                           
