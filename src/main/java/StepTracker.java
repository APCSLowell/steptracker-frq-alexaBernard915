import java.util.ArrayList;
public class StepTracker
{
 private ArrayList <Integer> steps;
 private int minActive;
 public StepTracker(int min){
  minActive = min;
  steps = new ArrayList <Integer>();
 }
 public void addDailySteps(int stepN){
  steps.add(stepN);
 }
 public int activeDays(){
  int total = 0; 
  for(int i = 0; i<steps.size(); i++){
   if(steps.get(i) > minActive){
    total += 1; 
   }
  }
  return total; 
 }
 public double averageSteps(){
  double total = 0; 
  for(int i = 0; i<steps.size(); i++){
   total += steps.get(i); 
  }
  return total/steps.size();
 }
 
} 
