package week7_practice;

public class AttendanceSheet {
    private final String[] students;
    private int count;

    public AttendanceSheet(int maxStudents) { students = new String[maxStudents]; }
    public void markPresent(String name) {
        if (isPresent(name) || count == students.length) return;
        students[count++] = name;
    }
    public int getPresentCount() { return count; }
    public boolean isPresent(String name) {
        for (int i = 0; i < count; i++) if (students[i].equals(name)) return true;
        return false;
    }

    public static void main(String[] args) {
        AttendanceSheet sheet = new AttendanceSheet(30);
        sheet.markPresent("Ana"); sheet.markPresent("Ben"); sheet.markPresent("Ana");
        System.out.println(sheet.getPresentCount());
        System.out.println(sheet.isPresent("Ben"));
        System.out.println(sheet.isPresent("Chen"));
    }
}
