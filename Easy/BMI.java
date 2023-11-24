/* BMI Calculator */
public class calculateBMI {
        public static void main(String[] args) {
            // Test cases can be added here to validate the method's functionality.
            // Test case 1
            Object[] result1 = calculateBMI(170, 65); // height in cm, weight in kg
            System.out.println("BMI: " + result1[0] + ", Category: " + result1[1]);
          
            // Test case 2
            Object[] result2 = calculateBMI(180, 77); // height in cm, weight in kg
            System.out.println("BMI: " + result2[0] + ", Category: " + result2[1
                               
            // Test case 3
            Object[] result3 = calculateBMI(190, 92); // height in cm, weight in kg
            System.out.println("BMI: " + result3[0] + ", Category: " + result3[1]);
            }
  
        public static Object[] calculateBMI(double weight, double height) {    // Create the calculateBMI Method here. Object[] must be used as per test cases.
            if (weight <= 0 || height <= 0) {
                return new Object[] {0.0, "weight and height cannot be 0!"};   // Edge case.
            }
          
          // Convert height from centimeters to meters and calculate BMI. Round the BMI to two decimal places.
          
            String category;
            double BMI = Math.round(weight / (height / 100 * height / 100));   
            if (BMI < 18.5) { 
              category = "Underweight";
            } else if (BMI < 25.0) { 
              category = "Healthy";
            } else if (BMI < 30.0) { 
              category = "Overweight";
            } else {
              category = "Obesity";
            } 
          return new Object[] {BMI, category};                                // Return the new Object[].
    }
}
