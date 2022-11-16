import java.util.ArrayList;
import java.util.List;

public class Student {

  List<Integer> marks = new ArrayList<>();
  String name;
  String surname;

  void setMark(int mark) {
    if (mark > 0 && mark < 6) {
      marks.add(mark);
      return;
    }
    throw new IllegalArgumentException();
  }

  public Student(String name, String surname) {
    this.name = name;
    this.surname = surname;
  }

  double mark() {
    if (marks.size() == 0) {
      return 0;
    }
    Integer sum = 0;
    for (Integer mark : marks) {
      sum += mark;
    }
    return (double) sum / marks.size();
  }

  public String toString() {
    return String.format("%s %s ", name, surname);
  }
}
