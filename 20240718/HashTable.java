


public class HashTable{
    public static byte hash(String message){
        byte result = 0;

        for(int i = 0; i < message.length(); i++){
            result += message.getBytes()[i];
        }
        return (byte) ((result & 0x7F) % 3);
    }

    public static void main(String[] args) {
        String[] messages = {"John Smith", "Lisa Smith", "Sam Doe", "Sandra Dee"};

        for(String message : messages){
            System.out.printf("hash(%s) = %d%n" ,message , hash(message));
        }

    }
}