package chapterSeven;

public class Exercise {
    public static void main(String[] args) {

//        while if loops decreasing values

        int i = 0;
        while (i >= 1) {
            if (i % 2 == 0)
                System.out.println(i + " * ");

            i--;
        }

//       increasing Values

       while (i <= 100) {
            if (i % 2 == 1)
                System.out.println(i + " * ");
            i++;
        }


//        for if loops odd value

        for (int i1 = 100; i <= 1; i--) {
          if (i % 2 != 0)
            System.out.print(i + " * ");
        }


//        for if loops even value

        for (int i1 = 1; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.print(i + " * ");
        }

    }
}


