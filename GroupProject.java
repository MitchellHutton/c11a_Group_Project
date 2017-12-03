public class GroupProject {
  public static void main(String[] args) {

      int csvLength = 500;

      String[] player = new String[csvLength];    // col 0
      String[] position = new String[csvLength];  // col 1
      String[] team = new String[csvLength];      // col 2

      int[] rebounds = new int[csvLength];        // col 3
      int[] assists = new int[csvLength];         // col 4
      int[] steals = new int[csvLength];          // col 5
      int[] blocks = new int[csvLength];          // col 6
      int[] points = new int[csvLength];          // col 7

      // Read csv
      TextIO.readFile("fs.csv");
      TextIO.getln();  // skip the line of headers...
      int cate = 0;

      while (!TextIO.eof()) {

        String cell = TextIO.getln(); // read in the next cell from the file
        String[] columns = cell.split(","); // split the columns apart

      //establish categories (cate)
      player[cate] = columns[0];
      position[cate] = columns[1];
      team[cate] = columns[2];
      rebounds[cate] = Integer.parseInt(columns[3]);
      assists[cate] = Integer.parseInt(columns[4]);
      steals[cate] = Integer.parseInt(columns[5]);
      blocks[cate] = Integer.parseInt(columns[6]);
      points[cate] = Integer.parseInt(columns[7]);

      cate++;

      } // end of while loop

      System.out.println("Welcome to the fantasy draft!!!!");
      System.out.println("This is a 4 team NBA fantasy draft.");
      System.out.println("The stats are Points, Steals, Blocks, Assists, and Rebounds.");
      System.out.println("Good luck!");

  } // end of main

} // end of class GroupProject
