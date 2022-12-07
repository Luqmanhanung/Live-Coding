public class EncodeDecode {
    private static void encodeDecode(String word){

        String output = "";

        //1. process code
        String processedCode = word.replaceAll("<.*>", "");

        //2. filter method
        if (word.contains("encode")){
            for (int i = 0; i < processedCode.length(); i++){
                //2 i
                char codeChar = processedCode.charAt(i);

                //2 ii a = 97
                int codeInt = codeChar + 2; //99

                //2 iii
                if (codeInt < 123){
                    char n = (char)codeInt;
                    output += String.valueOf(n);
                }else{ //z =122; 124
                    char n = (char)(codeInt - 26);
                    //2 v
                    output += String.valueOf(n);
                }
            }
        }
        //decode
        if (word.contains("decode")){
            for (int i = 0; i < processedCode.length(); i++){
                //2 i
                char codeChar = processedCode.charAt(i);

                //2 ii
                int codeInt = codeChar - 2;

                //2 iii
                if (codeInt > 96) {
                    char n = (char) codeInt;
                    output += String.valueOf(n);
                }else{
                    char n = (char)(codeInt + 26);
                    output += String.valueOf(n);
                }
            }
        }
        System.out.println(output);
    }

    public static void main(String[] args) {

        // Encode
        encodeDecode("<encode>abcd");
        encodeDecode("<encode>xyz");

        // decode
        encodeDecode("<decode>cdef");
        encodeDecode("<decode>zab");


    }


}
