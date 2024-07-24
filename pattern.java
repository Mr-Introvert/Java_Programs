public class pattern{
    static void rightTriangle(int rows){
        for (int i = 0; i <= rows; i++){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void inverseRightTriangle(int rows){
        for (int i = rows; i >= 1; i--){
            for (int j = i; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    static void rightArrow(int rows){
        for (int i = 0; i <= rows-1; i++){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = rows; i >= 1; i--){
            for (int j = i; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[]args){
        int rows = 5;
        rightTriangle(rows);
        System.out.println();
        inverseRightTriangle(rows);
        System.out.println();
        rightArrow(rows);
    }
}
