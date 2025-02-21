public class oneDArray{
    public static void main(string [] args){

        int [] scores={10,20,30,40,78};

        for(int i=o;i<scores.length;i++){
            System.out.println(scores[i]);
        }

        for(int score : scores){
            System.out.println(score);
        }
    }
}


//2d array
public class multidemensionArray{
public static void main(string []args){
    int [][] scores={{10,20,30,40,50},{60,70,80,90,100}};
    for(int i=o;i<scores.length;i++){
        for (int j=0;j<scores[i].length;j++){
            System.out.println(scores[i][j]);
        }
    }
}
}

//classwork for the 2d array
public class TwoDArray{
    public static void main(String[]args){
        //directly initialize
        int [][] scores={
            {10,20,30,40},
            {50,60,67,89},
            {90,100,180,98}
        };

        //second way to initialize  an array
        int [][] scores=new int[3][4];
   //to print directly
        System.out.println(scores[1][2]);
        


        //to print using loops for(start;stop;setup)
        for(int i=0;i<3;i+=){
            for(int j=0;j<4;j++){
                System.out.println(scores[i][j]);
            }
        }
    }
}