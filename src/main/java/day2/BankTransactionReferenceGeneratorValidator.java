package day2;
public class BankTransactionReferenceGeneratorValidator {
    public static String normalizeReference(String raw) {
        String s=raw.trim();
        if(s.length()<3) return s.toUpperCase();
        return s.substring(0,3).toUpperCase()+s.substring(3);
    }
    public static String validateAndFormat(String reference) {
        if(reference.length()!=14) return "Invalid: wrong length";
        for(int i=0;i<3;i++) if(!Character.isLetter(reference.charAt(i))) return "Invalid: bank code must be 3 letters";
        for(int i=3;i<14;i++) if(!Character.isDigit(reference.charAt(i))) return "Invalid: body must contain only digits";
        StringBuilder sb=new StringBuilder();
        sb.append("[").append(reference.substring(0,3)).append("] DATE: ")
          .append(reference.substring(3,5)).append("/").append(reference.substring(5,7)).append("/")
          .append(reference.substring(7,9)).append(" | SEQ: ").append(reference.substring(9));
        return sb.toString();
    }
    public static void main(String[] args){
        String r=normalizeReference(" hdf03022600042 ");
        System.out.println(validateAndFormat(r));
    }
}
