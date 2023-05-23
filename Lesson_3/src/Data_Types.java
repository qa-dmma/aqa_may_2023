public class Data_Types {
    public static void main(String[] args) {

        //Character Type
        char TypeCharacter = 'A';
        //Integer Types
        byte TypeByte_low = -127;
        byte TypeByte_hight = 127;
        int TypeInt_low = -2147483648;
        int TypeInt_hight = 2147483647;
        short TypeShort_low = -32768;
        short TypeShort_hight = 32767;
        long TypeLong_low = -9223372036854775808L;
        long TypeLong_hight = 9223372036854775807L;
        //Floating-Point Types
        float TypeFlow = 0.1234567f;
        double TypeDouble = 0.1234567890123456d;
        //Boolean Type
        boolean TypeBoolean_false = false;
        boolean TypeBoolean_true = true;

        //Outputs
        System.out.println("Char stores a single character/letter or ASCII values, like that: "+TypeCharacter);
        System.out.println("Byte stores whole numbers from "+TypeByte_low+" to "+TypeByte_hight);
        System.out.println("Int stores whole numbers from "+TypeInt_low+" to "+TypeInt_hight);
        System.out.println("Short stores whole numbers from "+TypeShort_low+" to "+TypeShort_hight);
        System.out.println("Long stores whole numbers from "+TypeLong_low+" to "+TypeLong_hight);
        System.out.println("Float stores fractional numbers. Sufficient for storing 6 to 7 decimal digits, like that: "+TypeFlow);
        System.out.println("Double stores fractional numbers. Sufficient for storing 15 decimal digits, like that: "+TypeDouble);
        System.out.println("Boolean stores "+TypeBoolean_true+" or "+TypeBoolean_false+" values");

        }
    }
