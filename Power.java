import java.lang.Math; 
  
public class Power { 
  
    // Function to calculate N raised to the power P 
    static double power(int N, int P) 
    { 
        return Math.pow(N, P); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int N = 4; 
        int P = 2; 
  
        System.out.println(power(N, P)); 
    } 
} 