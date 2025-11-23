package lesson1;

public class Task5 {
    public static void main(String[] args) {
        int brightness = 50;
        int contrast = 13;
        String filterName = "Stereoscopy";
        boolean isPremium = true;

        if(isPremium){
            contrast += 20;
        }

        System.out.println("Applied Filter: <" + filterName + ">");
        System.out.println("Brightness Level: " + brightness);
        System.out.println("Contrast Level: " + contrast);
        System.out.println("Is Premium User?: " + isPremium);
    }
}
