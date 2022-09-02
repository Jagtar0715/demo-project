public class first {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder ("");
        for ( int i = 0; i< sb.length(); i++) {
            Integer count = 1;

            while (i < sb.length()-1 && sb.charAt(i)==sb.charAt(i+1)) {
                count++;
                i++;
            }



        }
    }
    }