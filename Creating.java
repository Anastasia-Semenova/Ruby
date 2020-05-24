package ruby;

public class Creating {
    static String creating(int n) throws NotRightArgumentException {
        if (n <= 0) {
            throw new NotRightArgumentException();
        }
        if (n == 1) return "1";
        if (n == 2) return "11";

        StringBuilder str = new StringBuilder("11");
        for (int i = 3; i <= n; i++) {
            str.append(" ");
            int length = str.length();
            int times = 1;
            StringBuilder tmp = new StringBuilder();
            char[] arr = str.toString().toCharArray();

            for (int j = 1; j < length; j++) {
                if (arr[j] != arr[j - 1]) {
                    tmp.append(times);
                    tmp.append(arr[j - 1]);
                    times = 1;
                } else times++;
            }
            str = new StringBuilder(tmp.toString());
        }
        return str.toString();
    }
}
