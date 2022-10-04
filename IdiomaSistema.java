import java.util.Locale;

public class IdiomaSistema {
    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        System.out.print("\nNo " + loc.getDisplayCountry());
        System.out.println(" se fala " + loc.getDisplayLanguage() + ".");
    }
}
