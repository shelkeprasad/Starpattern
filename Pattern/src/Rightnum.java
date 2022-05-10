public class Rightnum {
    public static void main(String[] args){

        int j,k;
        for (int i=1;i<=5;i++){

            for ( j=1;j<=5-i;j++){

                System.out.print(" ");
            }
            for ( k=1;k<=i;k++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
