public class AttendanceSheet {
    private String[] presentStudents;
    private int count;

    public AttendanceSheet(int maxClassSize) {
        this.presentStudents = new String[maxClassSize];
        this.count = 0;
    }

    public void markPresent(String studentName) {
        if (studentName == null || isPresent(studentName)) {
            return;
        }
        if (count < presentStudents.length) {
            presentStudents[count] = studentName;
            count++;
        }
    }

    public int getPresentCount() {
        return count;
    }

    public boolean isPresent(String studentName) {
        if (studentName == null) {
            return false;
        }
        for (int i = 0; i < count; i++) {
            if (presentStudents[i].equals(studentName)) {
                return true;
            }
        }
        return false;
    }
}
