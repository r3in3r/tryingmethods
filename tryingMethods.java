//this is a class that put methods to try
public class TryingMethods {

    public static void main(String[] args) {
        daysOfTheWeek();
        sumNumbers();
        
    }


//this is a switch case method

    static void daysOfTheWeek()
    {
        int days=4;
        switch (days) {
                case 1:
            System.out.println("Monday");    
                break;
                case 2:
            System.out.println("Tuesday");    
                break;
                case 3:
            System.out.println("Wednesday");    
                break;
                case 4:
            System.out.println("Thursday");    
                break;
                case 5:
            System.out.println("Friday");    
                break;
                case 6:
            System.out.println("Saturday");    
                break;
                case 7:
            System.out.println("Sunday");    
                break;        
            
        }

        System.out.println("");
    }
        
    static int sumNumbers() {
        int sum = 0;
        for (int i = 12; i < 103; i++) {
            if (i % 2 == 0)
                sum += i;
        }

        return sum;
    }
    static int zeroTo1000Sum() {
        int sum = 0;
        int i = 0;
        while (i < 1000) {
            sum += i++;
        }

        return sum;
    }




 
