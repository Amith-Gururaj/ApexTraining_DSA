import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaxIPAddress {

    public static void maxIpAddresses(String[] addresses) {
        Map<String, Integer> map = new HashMap<>();
        for (String address : addresses) {
            String[] st = address.split(" ");
            if (validateIp(st)) {
                map.put(st[0], map.getOrDefault(st[0], 0) + 1);
            }
        }
        int max = Collections.max(map.values());
        map.entrySet().stream().filter(x -> x.getValue() == max)
                .forEach(y -> System.out.println(y.getKey()));
    }

    public static boolean validateIp(String[] st) {
        boolean isValid = true;
        String ip = st[0];
        if (ip.isEmpty())
            return false;
        String[] ipSlit = ip.split("\\.");
        if (ipSlit.length != 4)
            return false;
        for (String s : ipSlit) {
            if (s.length() > 1 && s.charAt(0) == '0')
                return false;
            if (!s.matches("^[0-9]+$"))
                return false;
            if (Integer.parseInt(s) > 255)
                return false;
        }
        return isValid;
    }
}
