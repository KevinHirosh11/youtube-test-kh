class HelloWorld {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int k = i; k <= n; k++) {
                System.out.print(" ");
                }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            for (int k = 1; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=1;i<=n;i++){
            for (int k=1;k<=i;k++){
                System.out.print(" ");
            }
            for (int k=i;k<=n;k++){
                System.out.print("*");
            }
            for (int k=i+1;k<=n;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
