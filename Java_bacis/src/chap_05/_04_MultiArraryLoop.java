package chap_05;

public class _04_MultiArraryLoop {
    public static void main(String[] args) {
        String[][] seats = {
                {"A1","A2","A3","A4","A5"},
                {"B1","B2","B3","B4","B5"},
                {"C1","C2","C3","C4","C5"}
        };

        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[0].length; j++) {
                System.out.print(seats[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println("--------------");
        for (int i = 0; i < seats.length; i++) {
            System.out.println(String.join(" ", seats[i]));
        }

        System.out.println("--------------");
        String[][] seats1 = {
                {"A1","A2","A3"},
                {"B1","B2","B3","B4"},
                {"C1","C2","C3","C4","C5"}
        };
        for (int i = 0; i < seats1.length; i++) {
            for (int j = 0; j < seats1[i].length; j++) {
                System.out.print(seats1[i][j]);
                if (j < seats1[i].length - 1) {
                    System.out.print(" "); // 마지막 요소가 아닐 때만 공백 추가
                }
            }
            System.out.println();
        }

        char a = 'A';
        String[][] seats2 = new String[10][15];
        System.out.println(seats2.length);
        System.out.println(seats2[0].length);
        for (int i = 0; i < seats2.length; i++) {
            for (int j = 0; j < seats2[0].length; j++) {
                seats2[i][j] = Character.toString((char)(a+i))+(j+1);
            }
        }
        for (int i = 0; i < seats2.length; i++) {
            System.out.println(String.join(" ",seats2[i]));
        }
    }
}
