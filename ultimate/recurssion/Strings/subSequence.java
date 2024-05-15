public class subSequence {
    public static void main(String[] args) {
        sequence("", "abc");
        System.out.println();
    }
    static void sequence(String complete,String remaining){
        if(remaining.isEmpty()){
            System.out.print(complete+ " ");
            return;
        }
        char c=remaining.charAt(0);
        sequence(complete+c, remaining.substring(1));
        sequence(complete, remaining.substring(1));

    }
}
