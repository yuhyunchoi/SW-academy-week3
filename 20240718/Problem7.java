

//문자열의 처음 n개 문자의 모든 순열을 출력하는 재귀 함수를 작성하고 테스트하세요.
//예를 들어, print("ABC",3) 호출은 다음과 같이 출력할 것입니다.
//ABC ACB BAC BCA CBA CAB
// 규칙은?
// A : 0 , B : 1, C : 2


public class Problem7 {


    static void print(String message, int count){
        byte[] bytes = message.getBytes();
        print(bytes, 3);
    }

    static void print(byte[] bytes, int n){
        if(n==1){
            System.out.println(new String(bytes));
        }
        else{    
            for(int i = 0; i< n-1 ; i++){    
                byte tmp = bytes[i];
                bytes[i] = bytes[i-1];
                bytes[i-1] = tmp;

                tmp = bytes[n-1];
                bytes[i] = bytes[n-1];
                bytes[i-1] = tmp;
    
            }
        }
    }

    public static void main(String[] args) {
        
        
        print("ABC", 3);
    }

    
}


