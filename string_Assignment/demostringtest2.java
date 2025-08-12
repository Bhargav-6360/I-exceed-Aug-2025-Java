class StringConcatTest {

    public String concatWithString() {
        String str = "Global";
        for (int i = 0; i < 100000; i++) {
            str += "Warming"; 
        }
        return str;
    }

    public String concatWithBuffer() {
        StringBuffer sbb = new StringBuffer("Global");
        for (int i = 0; i < 100000; i++) {
            sbb.append("Warming"); 
        }
        return sbb.toString();
    }

    public String concatWithBuilder() {
        StringBuilder sbb = new StringBuilder("Global");
        for (int i = 0; i < 100000; i++) {
            sbb.append("Warming"); 
        }
        return sbb.toString();
    }
}

class demostringtest2 {
    public static void main(String[] args) {

        StringConcatTest test = new StringConcatTest();

        long startTime = System.currentTimeMillis();
        test.concatWithString();
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken by String: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        test.concatWithBuffer();
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by StringBuffer: " + (endTime - startTime) + " ms");

      
        startTime = System.currentTimeMillis();
        test.concatWithBuilder();
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by StringBuilder: " + (endTime - startTime) + " ms");
    }
}
