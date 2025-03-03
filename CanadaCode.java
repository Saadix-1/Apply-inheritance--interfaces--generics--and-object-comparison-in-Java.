public class CanadaCode extends PostalCode {

    public CanadaCode( String code ) {
        super( code );
    }
@Override
    public boolean isValid() { 

        String myCode = getCode();
        boolean valid = true;

        return myCode.length() == 7 &&
               Character.isLetter(myCode.charAt(0)) &&
               Character.isDigit(myCode.charAt(1)) &&
               Character.isLetter(myCode.charAt(2)) &&
               Character.isWhitespace(myCode.charAt(3)) &&
               Character.isDigit(myCode.charAt(4)) &&
               Character.isLetter(myCode.charAt(5)) &&
               Character.isDigit(myCode.charAt(6));    
        }

}

