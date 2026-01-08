package BTVN_B5;

public class DataCleaner {

    public static String formatName(String name){
        if (name == null || name.isEmpty()){
            return "";
        }

        // Xóa khoảng trắng thừa ở hai đầu và giữa các từ
        String[] names = name.trim().split("\\s+");
        if (names.length < 2){
            return "";
        }
        StringBuilder formattedName = new StringBuilder();
        String word = null;
        for (int i = 0; i < names.length; i++) {
            word = names[i];
            formattedName.append(word.substring(0, 1).toUpperCase()).append(word.substring(1).toLowerCase()).append(" ");
        }
        return formattedName.toString().trim();
    }

    public static String generateID(String name,int index){
        name = formatName(name);
        if (name.isEmpty()){
            return "";
        }

        String[] names = name.split("\\s+");
        StringBuilder id = new StringBuilder();
        for (String word : names) {
            id.append(word.charAt(0));
        }
        id.append(index);
        return id.toString();
    }

}
