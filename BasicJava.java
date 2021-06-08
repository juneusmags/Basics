import java.util.ArrayList;
public class BasicJava{

    //Prints 1- 255
    public static void printer(int num){
        while(num <= 255){
            System.out.println( num );
            num++;
        }
    }   


    //Prints odd numbers 1-255
    public static void printerOdd(int num){
        while(num <= 255){
            if(num % 2 != 0){
                System.out.println( num );
            }
            num++;
        }
    }
    

    //Prints Sum
    public static void printSum(int num){
        int sum = 0;
        while(num <= 255){
            System.out.println( num );
            sum = sum + num;
            System.out.println( sum );
            num++;
        }
    }

    //Iterates Through the array
    
    public static void iterateArray(int[] x){
        for(int i = 0; i < x.length; i++){
            System.out.println(x[i]);
        }
    }

    //Finds Maximum
    public static void findMax(int[] x){
        int max = x[0];
        for(int i = 0; i < x.length; i++){
            if(x[i] > max){
                max = x[i];
            }
        }
        System.out.println(max);
    }

    //Finds Average
    public static void findAvg(int[] x){
        int sum = 0;
        for(int i = 0 ; i < x.length; i++){
            sum = sum + x[i];
        }
        int avg = sum/x.length;
        System.out.println(avg);
    }


    //Array with Odd Numbers
    public static void arrOdd(){
        ArrayList<Integer> z = new ArrayList<Integer>();
        for(int i = 1; i <= 255; i+=2){
            z.add(i);
        }
        System.out.println(z);
    }


    //Greater than Y
    public static void greaterY(int[] x){
        int y = 3;
        int v = 0;
        for(int i = 0; i < x.length; i++){
            if(y < x[i]){
                v++;
            }
        }
        System.out.println(v);
    }


    //Square the Values
    public static void squareVal(int[] x){
        ArrayList<Integer> newarr = new ArrayList<Integer>();
        for(int i = 0; i < x.length; i ++){
            int n = x[i]*x[i];
            newarr.add(n);
            }
        System.out.println(newarr);
    }

    public static void eliminateNeg(int[] x){
        ArrayList<Integer> newarray = new ArrayList<Integer>();

        for(int i = 0; i < x.length; i++){
            if(x[i] < 0){
                newarray.add(0);
            }
            else{
                newarray.add(x[i]);
            }            
            System.out.println(newarray);
        }
    }

    public static void maxMin(int[] x){
        ArrayList<Integer> newarray = new ArrayList<Integer>();
        int max = x[0];
        int min = x[0];
        int sum = 0;
        
        for(int i = 0; i < x.length; i++){
            sum = sum + x[i];
            if(x[i] > max){
                max = x[i];
            }
            if( x[i]<min){
                min = x[i];
            }
        }
        int avg = sum/x.length;
        newarray.add(max);
        newarray.add(min);
        newarray.add(avg);
        System.out.println(newarray);
    }


    public static void shiftArr(int[] x){
        ArrayList<Integer> newarray = new ArrayList<Integer>();
        for(int i = 0; i< x.length; i++){
            newarray.add(x[i]);
        }
            
            newarray.add(0);
            newarray.remove(0);
            System.out.println(newarray);
    }
        


    
        


    public static void main(String[] args){
        //BasicJava.printer(0);
        //BasicJava.printerOdd(0);
        //BasicJava.printSum(0);
        int[] x = {1,2,3,4,5};
        //BasicJava.iterateArray(x);
        //BasicJava.findMax(x);
        //BasicJava.findAvg(x);
        //BasicJava.greaterY(x);
        //BasicJava.arrOdd();
        //BasicJava.greaterY(x);
        //BasicJava.squareVal(x);
        //BasicJava.eliminateNeg(x);
        //BasicJava.maxMin(x);
        //BasicJava.shiftArr(x);
    }

}





    
